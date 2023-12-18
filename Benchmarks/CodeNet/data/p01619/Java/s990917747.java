import java.util.*;
public class Main{
    static long power(int n){
      long ans = 1;
      long x = 2L;
      while(n!=0){
        if(n%2==1){
          ans = ans * x % 1000000;
          n -= 1;
        }
        else{
          x = x * x % 1000000;
          n /= 2;
        }
      }
      return ans;
    }
          
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = 1000000;
        if(m==1){
          System.out.println(power(n));
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
