import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long W = sc.nextLong();
    int[] r = new int[N];
    int[] v = new int[N];
    long w0 = sc.nextLong();
    v[0] = sc.nextInt();
    for(int i = 1; i < N; i++) {
      long w = sc.nextLong();
      r[i] = (int)(w - w0);
      v[i] = sc.nextInt();
    }
    // dp[i][j][k]は物0～iまでからrの和がk以下となるようにj個選んだときの価値の最大値
    int[][][] dp = new int[N][N + 1][3 * N];
    for(int k = 0; k < 3 * N; k++) {
      dp[0][1][k] = v[0]; 
    }
    for(int i = 1; i < N; i++) {
      for(int j = 1; j < N + 1; j++) {
        for(int k = 0; k < 3 * N; k++) {
          if(r[i] <= k) {
            dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - 1][k - r[i]] + v[i]);
          } else {
            dp[i][j][k] = dp[i - 1][j][k];
          }
        }
      }
    }
    int ans = 0;
    for(int j = 1; j < N + 1; j++) {
      if(W - w0 * j >= 0) {
        int re = Math.min((int)(W - w0 * j), 3 * N - 1);
        ans = Math.max(ans, dp[N - 1][j][re]);
      }
    }
    System.out.println(ans);
  }
}