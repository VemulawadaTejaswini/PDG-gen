import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = 1000000
        if(m==1){
          System.out.println(((int)(Math.pow(2, n)))%p);
        }
        else{
          int[][] dp = new int[n][5];
          dp[0][0] = 3;
          dp[0][1] = 3;
          dp[0][2] = 2;
          dp[0][3] = 1;
          dp[0][4] = 4;
          for(int i=1; i<n; i++){
            dp[i][0] = (((dp[i-1][0] + dp[i-1][1])%p + dp[i-1][3])%p + dp[i-1][4])%p;
            dp[i][1] = ((dp[i-1][0] + dp[i-1][1])%p +  dp[i-1][4])%p;
            dp[i][2] = (dp[i-1][0] + dp[i-1][2])%p;
            dp[i][3] = (dp[i-1][3] + dp[i-1][4])%p;
            dp[i][4] = (((dp[i-1][0] + dp[i-1][1])%p + dp[i-1][2])%p + dp[i-1][4])%p;
          }
          System.out.println(dp[n-1][4]%p);
        }
      }
  }
