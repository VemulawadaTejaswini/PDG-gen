import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    long MOD = (long)998244353;
    long[][] dp = new long[n][s + 1];
    dp[0][0] = 2;
    if(a[0] <= s) dp[0][a[0]] = 1;
    for(int i = 1; i < n; i++) {
      for(int j = 0; j <= s; j++) {
        dp[i][j] = (dp[i][j] + 2 * dp[i - 1][j]) % MOD;
        if(j >= a[i]) dp[i][j] = (dp[i][j] + dp[i - 1][j - a[i]]) % MOD;
      }
    }
    System.out.println(dp[n - 1][s]);
  }
}
