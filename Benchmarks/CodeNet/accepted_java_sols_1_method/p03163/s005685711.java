import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int W=sc.nextInt();
        sc.nextLine();
        long value[][]=new long[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                value[i][j]=sc.nextLong();
            }
            sc.nextLine();
        }
        long dp[][]=new long[n+1][W+1];
             for(int i=1;i<=n;i++)
             {
                for(int j=1;j<=W;j++)
                {
                    if((int)value[i-1][0]<=j)
                    {
                         dp[i][j]=(long)Math.max(dp[i-1][j],value[i-1][1]+dp[i-1][j-(int)value[i-1][0]]);
                    }
                    else
                       dp[i][j]=dp[i-1][j];
                }   
             }
        System.out.println(dp[n][W]);
        sc.close();
    }
}