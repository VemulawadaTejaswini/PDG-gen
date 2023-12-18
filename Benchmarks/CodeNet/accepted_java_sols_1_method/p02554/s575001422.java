import java.util.*;
public class Main{
    
    static final int MOD = (int)1e9 + 7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        long ans;
        if(n==1){
            ans = 0;
        }else if(n==2){
            ans = 2;
        }else{
            long[][] dp = new long[n+1][4];
            dp[0][0] = 1;
            for(int i=0; i<n; i++){
                for(int j=0; j<4; j++){
                    if(j==0){
                        dp[i+1][1] += dp[i][j];
                        dp[i+1][1] %= MOD;
                        dp[i+1][2] += dp[i][j];
                        dp[i+1][2] %= MOD;
                        dp[i+1][0] += dp[i][j]*8;
                        dp[i+1][0] %= MOD;
                    }else if(j==1){
                        dp[i+1][3] += dp[i][j];
                        dp[i+1][3] %= MOD;
                        dp[i+1][1] += dp[i][j]*9;
                        dp[i+1][1] %= MOD;
                    }else if(j==2){
                        dp[i+1][3] += dp[i][j];
                        dp[i+1][3] %= MOD;
                        dp[i+1][2] += dp[i][j]*9;
                        dp[i+1][2] %= MOD;
                    }else if(j==3){
                        dp[i+1][3] += dp[i][j]*10;
                        dp[i+1][3] %= MOD;
                    }
                }
            }
            ans = dp[n][3];
        }
        
        System.out.println(ans);
    }
}