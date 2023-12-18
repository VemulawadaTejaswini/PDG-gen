import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int[][] dp = new int[N+1][N+1];
    for(int i = N-1; i >= 0; i--){
      for(int j = N-1; j >= 0; j--){
        if(S.charAt(i)==S.charAt(j)){
          dp[i][j]=dp[i+1][j+1]+1;
        }
      }
    }
    int ans = 0;
    for(int i = 0; i < N; i++){
      for(int j = 0; j < N; j++){
        if(i > j){
          continue;
        }
        ans = Math.max(ans, Math.min(dp[i][j], j-i));
      }
    }
    System.out.println(ans);
  }
}