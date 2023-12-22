import java.util.*;
public class Main {
  private static final int MOD = 1_000_000_007;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    // A(0), C(1), G(2), T(3)
    int[][][][] dp = new int[N+1][4][4][4];
    dp[0][3][3][3] = 1;
    for (int len = 0; len < N; len++) {
      for (int c1 = 0; c1 < 4; c1++) {
        for (int c2 = 0; c2 < 4; c2++) {
          for (int c3 = 0; c3 < 4; c3++) {
            if (dp[len][c1][c2][c3] == 0) {
              continue;
            }
            for (int a = 0; a < 4; a++) {
              if ((a == 1 && c1 == 2 && c2 == 0)
                 || (a == 1 && c1 == 0 && c2 == 2)
                 || (a == 2 && c1 == 1 && c2 == 0)
                 || (a == 1 && c1 == 2 && c3 == 0)
                 || (a == 1 && c2 == 2 && c3 == 0)
                 ) {
                continue;
              }
              dp[len+1][a][c1][c2] += dp[len][c1][c2][c3];
              dp[len+1][a][c1][c2] %= MOD;
            }
          }
        }
      }
    }
    
    int ans = 0;
    for (int c1 = 0; c1 < 4; c1++) {
      for (int c2 = 0; c2 < 4; c2++) {
        for (int c3 = 0; c3 < 4; c3++) {
          ans += dp[N][c1][c2][c3];
          ans %= MOD;
        }
      }
    }
    
    System.out.println(ans);
  }
}