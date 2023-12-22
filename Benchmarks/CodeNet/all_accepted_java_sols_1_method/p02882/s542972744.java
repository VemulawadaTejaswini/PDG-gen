import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble();
    double s = x / a;

    if (a * b / 2 >= s) {
      double a1 = 2 * s / b;
      System.out.println(Math.toDegrees(Math.atan(b/a1)));
    } else {
      double ex = a * b - s;
      double h = 2 * ex / a;
      System.out.println(Math.toDegrees(Math.atan(h/a)));
    }
  }

}
