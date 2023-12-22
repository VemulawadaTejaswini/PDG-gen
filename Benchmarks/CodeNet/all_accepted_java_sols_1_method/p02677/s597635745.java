import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double h = sc.nextDouble();
    double m = sc.nextDouble();
    double rad = Math.toRadians(h * 30 - m * 5.5);
    double ans2 = a * a + b * b - 2 * a * b * Math.cos(rad);
    double ans = Math.sqrt(ans2);
    System.out.println(ans);

  }
}
