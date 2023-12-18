import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int H = sc.nextInt();
    int M = sc.nextInt();
    sc.close();

    double a = (double) A;
    double b = (double) B;
    double h = (H * 60 + M) * 360d / 720d;
    double m = M * 360d / 60d;
    double ans = Math.sqrt(a * a + b * b
        - 2.0d * a * b * Math.cos(Math.toRadians(Math.abs(h - m))));
    System.out.println(ans);
  }
}
