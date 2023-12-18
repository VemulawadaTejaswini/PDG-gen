import java.util.*;
public class Main{
  Scanner cin = new Scanner(System.in);
  int N,M,L;
  int[] d,a,k,t;
  int[][][] dp;
  public void solve(){
    N = cin.nextInt();
    M = cin.nextInt();
    L = cin.nextInt();

    d = new int[M];
    a = new int[M];
    k = new int[M];
    t = new int[M];

    for(int i = 0;i < M;i++){
      d[i] = cin.nextInt();
      a[i] = cin.nextInt();
      k[i] = cin.nextInt();
      t[i] = cin.nextInt();
    }
    dp = new int[5 + 1][N + 1][L + 1];
    for(int i = 0;i < 5;i++){
      for(int j= 0;j < N;j++){
        for(int l = 0;l < L;l++){
          for(int m = 0;m < M;m++){
            if(d[m] == i && a[m] - 1 == j){
              dp[i + 1][0][l + 1] = Math.max(dp[i + 1][0][l + 1],dp[i][j][l] + t[m]);
              dp[i][j + k[m]][l + 1] = Math.max(dp[i][j + k[m]][l + 1],dp[i][j][l] + t[m]);
            }
            dp[i][j + 1][l] = Math.max(dp[i][j + 1][l],dp[i][j][l]);
            dp[i + 1][0][l] = Math.max(dp[i + 1][0][l],dp[i][j][l]);
          }
        }
      }
    }

    int ans = 0;
    for(int i = 0;i < 5 + 1;i++){
      for(int j = 0;j < N + 1;j++){
        for(int k = 0;k < L + 1;k++){
          ans = Math.max(ans,dp[i][j][k]);
        }
      }
    }
    System.out.println(ans);
  }
  public static void main(String[] args){
    new Main().solve();
  }
}