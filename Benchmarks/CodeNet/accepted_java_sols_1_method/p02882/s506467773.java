import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double a = scanner.nextInt();
    double b = scanner.nextInt();
    double x = scanner.nextInt();

    double t;
    if (x > a * a * b * 0.5) {
      t = Math.atan2(a * a * a, 2 * a * a * b - 2 * x);
    } else {
      t = Math.atan2(2 * x, a * b * b);
    }
    System.out.println(90 - t * 180 / Math.PI);
  }
}
