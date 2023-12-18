

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder print=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        int mod=1000000007;
        long dp[]=new long[n+1];
        dp[0]=1;
        for(int i=3;i<=n;i++){
            for(int j=3;j<=i;j++){
                dp[i]=(dp[i]+dp[i-j])%mod;
            }
        }
        System.out.println(dp[n]);
    }
}
