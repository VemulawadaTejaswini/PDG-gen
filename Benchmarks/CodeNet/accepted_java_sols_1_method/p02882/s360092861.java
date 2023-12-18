import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble();
    sc.close();
    double fullV = a * a * b;
    double degree = 180 / Math.PI;
    if (x < fullV / 2) {
      double theta = Math.atan(a * b * b / (2.0 * x));
      System.out.println(theta * degree);
    } else {
      double theta = Math.atan(2.0 * (a * a * b - x) / Math.pow(a, 3.0));
      System.out.println(theta * degree);
    }
  }
}