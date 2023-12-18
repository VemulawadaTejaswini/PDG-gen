import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int C = sc.nextInt();
    int k = sc.nextInt();
    long[][] p = new long[R][C];
    for(int i = 0; i < k; i++) {
      int r = sc.nextInt() - 1;
      int c = sc.nextInt() - 1;
      long v = sc.nextLong();
      p[r][c] = v;
    }
    long[][][] dp = new long[R][C][4];
    if(p[0][0] > 0) {
      dp[0][0][1] = p[0][0];  
    }
    for(int i = 0; i < R; i++) {
      for(int j = 0; j < C; j++) {
        if((i + j) > 0) {
        if(p[i][j] == 0) {
          if(i == 0) {
            dp[i][j][0] = dp[i][j - 1][0];
          } else if(j == 0) {
            dp[i][j][0] = dp[i - 1][j][0];
          } else {
            dp[i][j][0] = Math.max(dp[i][j - 1][0], dp[i - 1][j][0]);
          }
          if(i > 0) dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][1]);
          if(i > 0) dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][2]);
          if(i > 0) dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][3]);
          
          if(j > 0) dp[i][j][1] = dp[i][j - 1][1];
          
          if(j > 0) dp[i][j][2] = dp[i][j - 1][2];

          if(j > 0) dp[i][j][3] = dp[i][j - 1][3];
        } else {
          if(i == 0) {
            dp[i][j][0] = dp[i][j - 1][0];
          } else if(j == 0) {
            dp[i][j][0] = dp[i - 1][j][0];
          } else {
            dp[i][j][0] = Math.max(dp[i][j - 1][0], dp[i - 1][j][0]);
          }
          if(i > 0) dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][1]);
          if(i > 0) dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][2]);
          if(i > 0) dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][3]);

          if(j > 0) {
            dp[i][j][1] = Math.max(dp[i][j - 1][1], dp[i][j - 1][0] + p[i][j]);
            if(i > 0) {
              dp[i][j][1] = Math.max(dp[i][j][1], dp[i - 1][j][0] + p[i][j]);
              dp[i][j][1] = Math.max(dp[i][j][1], dp[i - 1][j][1] + p[i][j]);
              dp[i][j][1] = Math.max(dp[i][j][1], dp[i - 1][j][2] + p[i][j]);
              dp[i][j][1] = Math.max(dp[i][j][1], dp[i - 1][j][3] + p[i][j]);
            }
          }
          
          if(j > 0) dp[i][j][2] = Math.max(dp[i][j - 1][2], dp[i][j - 1][1] + p[i][j]);

          if(j > 0) dp[i][j][3] = Math.max(dp[i][j - 1][3], dp[i][j - 1][2] + p[i][j]);
        }
        }
      }
    }
    long ans = dp[R - 1][C - 1][0];
    ans = Math.max(ans, dp[R - 1][C - 1][1]);
    ans = Math.max(ans, dp[R - 1][C - 1][2]);
    ans = Math.max(ans, dp[R - 1][C - 1][3]);
    System.out.println(ans);
  }
}