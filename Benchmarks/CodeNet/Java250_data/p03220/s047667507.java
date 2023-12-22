import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double t = sc.nextDouble();
    double a = sc.nextDouble();
    int ans = 0;
    double sa = 1000000;
    for(int i = 0; i < n; i++) {
      double h = sc.nextDouble();
      double s = Math.abs(a - (t - h * 0.006));
      if(s < sa) {
        sa = s;
        ans = (i + 1);
      }
    }
    System.out.println(ans);
  }
}