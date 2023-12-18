public class Main {
  public static void main(String...args) {
    double r = new java.util.Scanner(System.in).nextDouble();

    double area = r * r * Math.PI;
    double circumference = r * 2 * Math.PI;

    System.out.printf("%f %f\n", area, circumference);
  }
}