import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int w = sc.nextInt();
    long dp[] = new long[w+1];
    dp[0] = 0;
    int wt[] = new int[n];
    int v[] = new int[n];
    for (int i=0; i<n; i++) {
      wt[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }
    long ans = 0;
    for (int i=0; i<n; i++) {
      for (int W=w; W-wt[i]>=0; W--) {
        dp[W] = Math.max(dp[W], dp[W-wt[i]] + v[i]);
        ans = Math.max(ans, dp[W]);
      }
    }
    System.out.println(ans);
  }
}