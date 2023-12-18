import java.util.*;
import java.lang.*;

public class Main{
	static long mod = 1000000007;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String inp = sc.nextLine();
        long[][] dp = new long[inp.length()+1][13];

        dp[0][0] = 1;
        int n = inp.length();
        for(int i=1;i<=n;i++){
            char c = inp.charAt(i-1);
            if(c == '?'){
                for(int k=0;k<10;k++){
                    for(int j=0;j<13;j++){
                        dp[i][(j*10 + k)%13] += dp[i-1][j];
                        dp[i][(j*10 + k)%13] %= mod;
                    }
                }
            }else{
                int val = Character.getNumericValue(c);
                for(int j=0;j<13;j++){
                    dp[i][(j*10 + val)%13] += dp[i-1][j];
                    dp[i][(j*10 + val)%13] %= mod;
                }
            }
        }

        System.out.println(dp[n][5]%mod);



        sc.close();
	}
}