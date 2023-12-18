import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    double area = Math.PI * r * r;
    double length = 2 * Math.PI * r;
    System.out.printf("%f %f\n", area, length);
  }
}