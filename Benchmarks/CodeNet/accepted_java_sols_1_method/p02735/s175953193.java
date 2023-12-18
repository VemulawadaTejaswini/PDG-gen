import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    char[][] f = new char[m][n];
    for(int i = 0;i<m;i++)
    {
      f[i] = sc.next().toCharArray();
    }
    int[][] dp = new int[m][n];

    if(f[0][0] == '#'){
      dp[0][0] = 1;
    }

    for(int i=1;i<m;i++)
    {
      dp[i][0]=Integer.MAX_VALUE;
      if(f[i-1][0] == f[i][0]||f[i][0] == '.')
          dp[i][0]=Math.min(dp[i][0],dp[i-1][0]);
      else dp[i][0]=Math.min(dp[i][0],dp[i-1][0]+1);
    }
    
    for(int j=1;j<n;j++)
    {
      dp[0][j]=Integer.MAX_VALUE;
      if(f[0][j-1] == f[0][j]||f[0][j] == '.')
          dp[0][j]=Math.min(dp[0][j],dp[0][j-1]);
      else dp[0][j]=Math.min(dp[0][j],dp[0][j-1]+1);
    }

    for(int i=1;i<m;i++) {
      for(int j=1;j<n;j++)
      {
        dp[i][j]=Integer.MAX_VALUE;
        if(f[i-1][j] == f[i][j]||f[i][j] == '.')
        dp[i][j]=Math.min(dp[i][j],dp[i-1][j]);
        else dp[i][j]=Math.min(dp[i][j],dp[i-1][j]+1);

        if(f[i][j-1] == f[i][j]||f[i][j] == '.')
            dp[i][j]=Math.min(dp[i][j],dp[i][j-1]);
        else dp[i][j]=Math.min(dp[i][j],dp[i][j-1]+1);
      }
    }
    System.out.println(dp[m-1][n-1]);
  }
}