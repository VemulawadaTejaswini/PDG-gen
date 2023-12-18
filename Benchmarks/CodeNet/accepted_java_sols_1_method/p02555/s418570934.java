import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        long dp[]=new long[n+1],M=1000000007;
        if(n<3) {System.out.print(0); return;}
        dp[0]=1;
        int i,j;
        for(i=1;i<=n;i++)
        for(j=3;j<=n;j++)
        if(i>=j)
        dp[i]=(dp[i]+dp[i-j])%M;
        System.out.print(dp[n]);
    }
}
