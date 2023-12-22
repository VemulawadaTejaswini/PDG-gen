//package AtCoderDp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int h[]=new int[n+1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        long dp[]=new long[n+1];
        for(int i=1;i<=n;i++){
            h[i]=Integer.parseInt(st.nextToken());
        }
        dp[n-1]=Math.abs(h[n]-h[n-1]);
        for(int i=n-2;i>=1;i--){
            dp[i]=Long.MAX_VALUE;
            for(int j=i+1;j<=i+2;j++){
                dp[i]=Math.min(dp[i],dp[j]+Math.abs(h[j]-h[i]));
            }
        }
        System.out.println(dp[1]);
    }
}
