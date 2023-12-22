import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String L = sc.next();
        int n = L.length();
        
        // dp[i][0] ・・・ a + b == L
        // dp[i][1] ・・・ a + b < L        
        long[][] dp = new long[n+5][2];
        int MOD = (int)1e9 + 7;
        
        dp[0][0] = 1;
        for(int i = 1; i <= n; i++){
            
            // (aのi番目) + (bのi番目) == 0 とする場合
            if ( L.charAt(i-1) == '0' ){
                dp[i][0] = dp[i-1][0];
                dp[i][1] = dp[i-1][1];
            } else if( L.charAt(i-1) == '1' ){
                dp[i][1] = (dp[i-1][0] + dp[i-1][1]) % MOD;
            }
            
            // (aのi番目) + (bのi番目) == 1 とする場合
            if ( L.charAt(i-1) == '0' ){
                dp[i][1] += dp[i-1][1] * 2 % MOD;
                dp[i][1] %= MOD;
            } else if( L.charAt(i-1) == '1' ){
                dp[i][0] += dp[i-1][0] * 2 % MOD;
                dp[i][1] += dp[i-1][1] * 2 % MOD;
                dp[i][0] %= MOD;
                dp[i][1] %= MOD;
            }
        }
        
        System.out.println( (dp[n][0] + dp[n][1]) % MOD );
    }
}
