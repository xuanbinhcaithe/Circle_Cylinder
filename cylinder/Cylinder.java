package OOP.cylinder;

public class Cylinder extends Circle {
    private double height = 5;
    public Cylinder(){
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea()*this.height;
    }
    @Override
    public String toString() {
        return "A Cylinder with radius "
                + getRadius()
                +",and height"
                + getHeight()
                +" which a subclass of "
                +super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(7);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder);
    }
}
