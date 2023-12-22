import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      //Input Part
      int n = sc.nextInt();
      int k = sc.nextInt();
      int height[] = new int[n];
      for(int i = 0; i < n; i++)
      {
          height[i] = sc.nextInt();
      }
      
      //Logic Part
      int dp[] = new int[n];
      dp[0] = 0;
      dp[1] = Math.abs(height[1] - height[0]);
      for(int i = 2; i < n; i++)
      {
          dp[i] = dp[i-1] + Math.abs(height[i] - height[i-1]);
          for(int j = 2; j <= k; j++)
          {
              if(j <= i && j < n)
              {
                  dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(height[i] - height[i-j]));
              }
          }
      }
      w.println(dp[n-1]);
      w.close();
    }
}