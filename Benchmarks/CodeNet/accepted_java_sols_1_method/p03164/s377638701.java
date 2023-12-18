import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int w = sc.nextInt();
    int sum = 0;
    
    int wt[] = new int[n];
    int v[] = new int[n];
    for (int i=0; i<n; i++) {
      wt[i] = sc.nextInt();
      v[i] = sc.nextInt();
      sum += v[i];
    }
    long dp[] = new long[sum+1];
    long inf = 1234567890987L;
    for (int i=1; i<=sum; i++) dp[i] = inf;
    dp[0] = 0;
    long ans = 0;
    for (int i=0; i<n; i++) {
      for (int W=sum; W-v[i]>=0; W--) {
        dp[W] = Math.min(dp[W], dp[W-v[i]] + wt[i]);
      }
    }
    for (int i=0; i<=sum; i++) {
      if (dp[i] <= w) {
        ans = Math.max(ans, i);
      }
    }
    System.out.println(ans);
  }
}