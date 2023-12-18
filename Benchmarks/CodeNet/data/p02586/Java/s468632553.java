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
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int k=in.nextInt();
        long[][] mat=new long[r][c];
        for(int i=1;i<=k;i++)
        {
            int rr=in.nextInt();
            int cc=in.nextInt();
            rr--;
            cc--;
            long v=in.nextLong();
            mat[rr][cc]=v;
        }
        long[][][] dp=new long[r][c][4];
        dp[r-1][c-1][0]=mat[r-1][c-1];
        dp[r-1][c-1][1]=mat[r-1][c-1];
        dp[r-1][c-1][2]=mat[r-1][c-1];
        dp[r-1][c-1][3]=0;
        for(int i=c-2;i>=0;i--)
        {
            dp[r-1][i][3]=dp[r-1][i+1][3];
            for(int j=2;j>=0;j--)
            {
                if(mat[r-1][i]>0)
                    dp[r-1][i][j]=Math.max(dp[r-1][i+1][j],dp[r-1][i+1][j+1]+mat[r-1][i]);
                else
                    dp[r-1][i][j]=dp[r-1][i+1][j];
            }
        }

        for(int i=r-2;i>=0;i--)
        {
            dp[i][c-1][3]=dp[i+1][c-1][3];
            for(int j=2;j>=0;j--)
            {
                dp[i][c-1][j]=dp[i+1][c-1][0]+mat[i][c-1];
            }
        }

        for(int i=r-2;i>=0;i--)
        {
            for(int j=c-2;j>=0;j--)
            {
                dp[i][j][3]=Math.max(dp[i+1][j][0],dp[i][j+1][3]);
                for(int l=2;l>=0;l--)
                {
                    if(mat[i][j]>0)
                        dp[i][j][l]=Math.max(mat[i][j]+dp[i+1][j][0],Math.max(mat[i][j]+dp[i][j+1][l+1],dp[i][j+1][l]));
                    else
                        dp[i][j][l]=Math.max(dp[i+1][j][0],dp[i][j+1][l]);
                }
            }
        }
        System.out.println(dp[0][0][0]);
    }
}
