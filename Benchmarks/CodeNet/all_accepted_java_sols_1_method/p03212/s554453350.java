import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = String.valueOf(n);
    int s = str.length();
    int[][][][][] dp = new int[s][2][2][2][2];
    int f = Integer.parseInt(String.valueOf(str.charAt(0)));
    if(f < 3) {
      dp[0][0][0][0][1] = 1;
    } else if(f == 3) {
      dp[0][0][0][0][1] = 1;
      dp[0][1][0][0][0] = 1;
    } else if(f < 5) {
      dp[0][0][0][0][1] = 1;
      dp[0][1][0][0][1] = 1;
    } else if(f == 5) {
      dp[0][0][0][0][1] = 1;
      dp[0][1][0][0][1] = 1;
      dp[0][0][1][0][0] = 1;
    } else if(f < 7) {
      dp[0][0][0][0][1] = 1;
      dp[0][1][0][0][1] = 1;
      dp[0][0][1][0][1] = 1;
    } else if(f == 7) {
      dp[0][0][0][0][1] = 1;
      dp[0][1][0][0][1] = 1;
      dp[0][0][1][0][1] = 1;
      dp[0][0][0][1][0] = 1;
    } else {
      dp[0][0][0][0][1] = 1;
      dp[0][1][0][0][1] = 1;
      dp[0][0][1][0][1] = 1;
      dp[0][0][0][1][1] = 1;
    }

    for(int i = 1; i < s; i++) {
      dp[i][0][0][0][1] = 1;
      for(int j = 0; j < 2; j++) {
        for(int k = 0; k < 2; k++) {
          for(int l = 0; l < 2; l++) {
            dp[i][Math.min(1, j + 1)][k][l][1] += dp[i - 1][j][k][l][1];
            dp[i][j][Math.min(1, k + 1)][l][1] += dp[i - 1][j][k][l][1];
            dp[i][j][k][Math.min(1, l + 1)][1] += dp[i - 1][j][k][l][1];

            int d = Integer.parseInt(String.valueOf(str.charAt(i)));

            if(d < 3) {

            } else if(d == 3) {
              dp[i][Math.min(1, j + 1)][k][l][0] += dp[i - 1][j][k][l][0];
            } else if(d < 5) {
              dp[i][Math.min(1, j + 1)][k][l][1] += dp[i - 1][j][k][l][0];
            } else if(d == 5) {
              dp[i][Math.min(1, j + 1)][k][l][1] += dp[i - 1][j][k][l][0];
              dp[i][j][Math.min(1, k + 1)][l][0] += dp[i - 1][j][k][l][0];
            } else if(d < 7) {
              dp[i][Math.min(1, j + 1)][k][l][1] += dp[i - 1][j][k][l][0];
              dp[i][j][Math.min(1, k + 1)][l][1] += dp[i - 1][j][k][l][0];
            } else if(d == 7) {
              dp[i][Math.min(1, j + 1)][k][l][1] += dp[i - 1][j][k][l][0];
              dp[i][j][Math.min(1, k + 1)][l][1] += dp[i - 1][j][k][l][0];
              dp[i][j][k][Math.min(1, l + 1)][0] += dp[i - 1][j][k][l][0];
            } else {
              dp[i][Math.min(1, j + 1)][k][l][1] += dp[i - 1][j][k][l][0];
              dp[i][j][Math.min(1, k + 1)][l][1] += dp[i - 1][j][k][l][0];
              dp[i][j][k][Math.min(1, l + 1)][1] += dp[i - 1][j][k][l][0];
            }
          }
        }
      }

    }
    
    System.out.println(dp[s - 1][1][1][1][0] + dp[s - 1][1][1][1][1]);
  }
}