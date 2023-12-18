import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int day = Integer.parseInt(scan.nextLine());
    int[][] happy = new int[day][3];
    for(int i = 0;i < day;i ++){
      String[] hiki = scan.nextLine().split(" ");
      for(int j = 0;j < 3;j ++){
        happy[i][j] = Integer.parseInt(hiki[j]);
      }
    }
    int[][] dp = new int[day][3];
    dp[0][0] = happy[0][0];
    dp[0][1] = happy[0][1];
    dp[0][2] = happy[0][2];
    for(int i = 1;i < day;i ++){
      dp[i][0] = happy[i][0] + Math.max(dp[i-1][1],dp[i-1][2]);
      dp[i][1] = happy[i][1] + Math.max(dp[i-1][2],dp[i-1][0]);
      dp[i][2] = happy[i][2] + Math.max(dp[i-1][0],dp[i-1][1]);
    }
    System.out.println(Math.max(dp[day-1][0],Math.max(dp[day-1][1], dp[day-1][2])));
  }
}
