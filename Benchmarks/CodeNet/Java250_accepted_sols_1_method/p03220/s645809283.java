import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double t = sc.nextDouble();
    double a = sc.nextDouble();
    int ans = 1;
    double s = 1000000;
    for(int i = 1; i <= n; i++) {
      double x = sc.nextDouble();
      double t1 = t - (x * (double)6) / (double)1000;
      double s1 = Math.abs(t1 - a);
      if(s1 < s) {
        ans = i;
        s = s1;
      }
    }
    System.out.println(ans);
  }
}