import java.util.*;
public class Main {
    static int mod=1000000007;
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int h=sc.nextInt();
       int w=sc.nextInt();
       char grid[][]=new char[h+1][w+1];
       for(int i=1;i<=h;i++)
       {
           char ch[]=sc.next().toCharArray();
           for(int j=1;j<=w;j++)
           {
           grid[i][j]=ch[j-1];
          // System.out.print(grid[i][j]+ " ");
           }
          // System.out.println();
       }
      long dp[][]=new long[h+1][w+1];
     
      for(int i=1;i<=h;i++)
      {
          for(int j=1;j<=w;j++)
          {
              if(grid[i][j]=='#')
              dp[i][j]=0;
              else if(i==1 && j==1)
              dp[i][j]=grid[i][j]=='#'?0:1;
              else
              dp[i][j]=(dp[i-1][j]+dp[i][j-1])%mod;
          }
      }
      System.out.println(dp[h][w]%mod);
    }
}