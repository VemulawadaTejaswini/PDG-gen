import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String L = sc.next();
    long MOD = (long)Math.pow(10, 9) + 7;
    int n = L.length();
    long[][] dp = new long[n + 1][2];
    dp[0][0] = 1;
    dp[0][1] = 0;
    for(int i = 1; i < n + 1; i++) {
      if(L.charAt(i - 1) == '0') {
        dp[i][0] = dp[i - 1][0];
        dp[i][1] = (3 * dp[i - 1][1]) % MOD;
      } else {
        dp[i][0] = (2 * dp[i - 1][0]) % MOD;
        dp[i][1] = (3 * dp[i - 1][1]) % MOD;
        dp[i][1] = (dp[i][1] + dp[i - 1][0]) % MOD; 
      }
    }
    long ans = (dp[n][0] + dp[n][1]) % MOD;
    System.out.println(ans);
  }
}