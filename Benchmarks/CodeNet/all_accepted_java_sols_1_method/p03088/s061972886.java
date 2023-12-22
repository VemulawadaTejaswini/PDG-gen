import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        final long MOD = (long)1e9 + 7;
        
        int N = sc.nextInt();
        
        // A:0, G:1, C:2, T:3
        long[][][][] dp = new long[N+1][4][4][4];
        dp[0][3][3][3] = 1;
        
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    for(int l = 0; l < 4; l++){
                        for(int m = 0; m < 4; m++){
                            
                            if (k == 0 && l == 1 && m == 2) continue;
                            if (k == 1 && l == 0 && m == 2) continue;
                            if (k == 0 && l == 2 && m == 1) continue;
                            if (j == 0 && k == 1 && m == 2) continue;
                            if (j == 0 && l == 1 && m == 2) continue;
                            
                            dp[i][k][l][m] += dp[i-1][j][k][l];
                            if( dp[i][k][l][m] > MOD ) dp[i][k][l][m] %= MOD;
                        }
                    }
                }
            }
        }
        
        long ans  = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    ans += dp[N][i][j][k];
                    if ( ans > MOD ) ans %= MOD;
                }
            }
        }
        
        System.out.println(ans);
        
    }
}
