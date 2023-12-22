import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    int h = sc.nextInt();
    int m = sc.nextInt();
    int D = (60 * h) + m;
    double dd = (double)D;
    double a1 = dd / (double)2;
    double a2 = dd * ((double)6);
    a1 = (a1 % 360);
    a2 = (a2 % 360);
    double a3 = Math.abs(a1 - a2);
    double a3r = Math.toRadians(a3);
    double cos = Math.cos(a3r);
    double ans = (a * a) + (b * b) - (2 * a * b * cos);
    ans = Math.sqrt(ans); 
    System.out.println(ans);
  }
}
