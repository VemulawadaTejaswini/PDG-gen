import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt(),
            k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        long[] dp=new long[n];
        Arrays.fill(dp,Long.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<n;i++) {
            for(int j=1;j<=k;j++) {
                if((i+j)<n)
                    dp[i+j]=Math.min(dp[i+j],dp[i]+Math.abs(a[i]-a[i+j]));
            }
        }
        pw.print(dp[n-1]);
        pw.close();
    }
}