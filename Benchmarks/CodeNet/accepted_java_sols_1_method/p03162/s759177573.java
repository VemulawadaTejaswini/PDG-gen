import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long[] b = new long[n];
    long[] c = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      b[i] = sc.nextLong();
      c[i] = sc.nextLong();
    }
    long[][] dp = new long[n][3];
    dp[0][0] = a[0];
    dp[0][1] = b[0];
    dp[0][2] = c[0];
    for(int i = 1; i < n; i++) {
      dp[i][0] = Math.max(dp[i - 1][1] + a[i], dp[i - 1][2] + a[i]);
      dp[i][1] = Math.max(dp[i - 1][0] + b[i], dp[i - 1][2] + b[i]);
      dp[i][2] = Math.max(dp[i - 1][0] + c[i], dp[i - 1][1] + c[i]);
    }
    long ans = Math.max(dp[n - 1][0], dp[n - 1][1]);
    ans = Math.max(ans, dp[n - 1][2]);
    System.out.println(ans);
  }
}