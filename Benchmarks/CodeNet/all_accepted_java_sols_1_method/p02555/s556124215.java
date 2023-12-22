import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] dp=new int[2001];
        dp[0]=1;
        dp[3]=1;
        dp[4]=1;
        dp[5]=1;
        long MOD=1000000007;
        for(int i=6;i<=2000;i++)
        {
            long sum=0L;
            for(int j=i-3;j>=0;j--)
            {
                sum+=dp[j];
                sum%=MOD;
            }
            dp[i]=(int)sum;
        }
        System.out.println(dp[n]);
        
    }
}