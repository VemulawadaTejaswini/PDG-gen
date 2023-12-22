import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double h = scan.nextDouble();
    double m = scan.nextDouble();

    double t = h * 60 + m;

    double diff = Math.abs(t / 720 - m / 60);
    diff = Math.min(diff, 1 - diff);

    double ans = a * a + b * b;
    // System.out.println(diff);
    ans -= 2 * a * b * Math.cos(diff * 2 * Math.PI);
    System.out.println(Math.sqrt(ans));
  }
}