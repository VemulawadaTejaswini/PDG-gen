import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      char a[]=sc.next().toCharArray();
      char b[]=sc.next().toCharArray();
      
      int dp[][] = new int[a.length+1][b.length+1];
      
      for(int i=0;i<=a.length;i++)
      {
          for(int j=0;j<=b.length;j++)
          {
              if(i == 0 || j == 0)
              {
                  dp[i][j] = 0;
              }
              else if(a[i-1] == b[j-1])
              {
                  dp[i][j] = dp[i-1][j-1]+1;
              }
              else
              {
                  dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
              }
          }
      }
      
      int i = a.length, j = b.length;
      String ans = "";
      while(i>0 && j>0)
      {
          if(a[i-1]==b[j-1])
          {
              ans = a[i-1] + ans;
              i--;
              j--;
          }
          else
          {
              if(dp[i-1][j] >= dp[i][j-1])
              {
                  i--;
              }
              else
              {
                  j--;
              }
          }
      }
      w.println(ans);
      w.close();
    }
}