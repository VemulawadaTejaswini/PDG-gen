import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        long M=1000000007L;
        char A[][]=new char[n][m];
        long dp[][]=new long[n][m];
        for(int i=0;i<n;i++)
        {
            String s=in.next();
            for(int j=0;j<m;j++)
            {
                A[i][j]=s.charAt(j);
                dp[i][j]=0;
            }

        }

        dp[0][0]=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(A[i][j]!='#')
                {
                    if(i-1>=0)
                    {
                        dp[i][j]=(dp[i][j]+dp[i-1][j]+M)%M;
                    }
                    if(j-1>=0)
                    {
                        dp[i][j]=(dp[i][j]+dp[i][j-1]+M)%M;
                    }
                }

            }
        }
        long res=(dp[n-1][m-1]+M)%M;
        System.out.println(res);
    }
}