import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    double ans = 0;
    for(int i = 1; i <= n; i++) {
      int t = 0;
      int c = i;
      while(c < k) {
        c *= 2;
        t++;
      }
      ans += ((double)1 / ((double)n * (double)Math.pow(2, t)));
    }
    System.out.println(ans);
  }
}