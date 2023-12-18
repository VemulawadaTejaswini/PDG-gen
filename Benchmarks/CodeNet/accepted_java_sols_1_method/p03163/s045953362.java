import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      int n=sc.nextInt();
      int W=sc.nextInt();
      long wei[] = new long[n+1];
      long val[] = new long[n+1];
      for(int i=1;i<=n;i++)
      {
          wei[i]=sc.nextLong();
          val[i]=sc.nextLong();
      }
      
      long dp[][]=new long[n+1][W+1];
      for(int i=0;i<=n;i++)
      {
          for(int j=0;j<=W;j++)
          {
              if(i==0 || j==0)
              {
                  dp[i][j]=0;
              }
              else
              {
                  if(wei[i]<=j)
                  {
                      dp[i][j]=Math.max(dp[i-1][j],val[i]+dp[i-1][j-(int)wei[i]]);
                  }
                  else
                  {
                      dp[i][j]=dp[i-1][j];
                  }
              }
              //w.print(dp[i][j]+" ");
          }
          //w.println();
      }
      w.println(dp[n][W]);
      w.close();
    }
}