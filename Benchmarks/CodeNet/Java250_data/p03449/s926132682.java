import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] s1 = sc.nextLine().split(" ");
    String[] s2 = sc.nextLine().split(" ");
    int[][] candies = new int[N][2];
    
    for(int i  = 0; i < N; i++){
      candies[i][0] = Integer.parseInt(s1[i]);
      candies[i][1] = Integer.parseInt(s2[i]);
    }
    
    int[][] dp = new int[N][2];
    dp[0][0] = candies[0][0];
    dp[0][1] = dp[0][0] + candies[0][1];
    
    
    for(int i = 1; i < N; i++){
      dp[i][0] = dp[i-1][0] + candies[i][0];
      if(candies[i][1]+dp[i-1][1] > candies[i][1]+dp[i][0]){
        dp[i][1] = candies[i][1]+dp[i-1][1];
      }else{
        dp[i][1] = candies[i][1]+dp[i][0];
      }
    }
    
    System.out.println(dp[N-1][1]);
  }
}