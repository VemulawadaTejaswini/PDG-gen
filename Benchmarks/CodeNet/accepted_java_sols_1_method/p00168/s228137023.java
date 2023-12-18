import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int n = sc.nextInt();
      if(n == 0) break;

      int[] dp = new int[n + 1];
      dp[0] = 1;

      for(int i = 0; i < n; i++){
        for(int j = 1; j <= 3; j++){
          if(n < i + j) break;
          dp[i + j] += dp[i];
        }
      }

      System.out.println((((dp[n] + 9) / 10) - 1) / 365 + 1);
    }
  }
}