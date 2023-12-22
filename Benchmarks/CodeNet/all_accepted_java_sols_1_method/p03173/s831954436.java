import java.io.*;
import  java.util.*;
import static java.lang.System.in;

public class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        for(int i=1;i<=n;i++) a[i]=sc.nextInt();
        long[][] dp = new long[n+1][n+1];
        long[] sum = new long[n+1];
        for(int i=1;i<=n;i++) sum[i] = sum[i-1]+a[i];
        for(int i=0;i<=n;i++) Arrays.fill(dp[i],Long.MAX_VALUE/2);
        for(int i=0;i<=n;i++) dp[i][i] = 0;
        for(int i=1;i<n;i++) dp[i][i+1] = a[i]+a[i+1];
        for(int dx=2;dx<n;dx++){
            for(int i=1;i+dx<=n;i++){
                int j = i+dx;
                for(int k=i;k<=j-1;k++) dp[i][j] =Math.min(dp[i][j],dp[i][k]+dp[k+1][j]+sum[j]-sum[i-1]);
            }
        }
        System.out.println(dp[1][n]);
    }
}
