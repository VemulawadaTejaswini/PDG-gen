import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long W = sc.nextLong();
    long[] w = new long[n];
    int[] v = new int[n];
    for(int i = 0; i < n; i++) {
      w[i] = sc.nextLong();
      v[i] = sc.nextInt();
    }
    long[][] dp = new long[n][100001];
    for(int i = 0; i < n; i++) {
      for(int j = 1; j < 100001; j++) {
        dp[i][j] = (long)Math.pow(10, 12); 
      }
    }
    dp[0][v[0]] = w[0];
    for(int i = 1; i < n; i++) {
      for(int j = 0; j < 100001; j++) {
        if((j - v[i]) >= 0) {
          if((j - v[i]) == 0) {
            dp[i][j] = Math.min(w[i], dp[i - 1][j]);
          } else {
            dp[i][j] = Math.min(w[i] + dp[i - 1][j - v[i]], dp[i - 1][j]);
          }
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }
    int ans = 0;
    for(int i = 100000; i > 0; i--) {
      if(dp[n - 1][i] <= W) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}