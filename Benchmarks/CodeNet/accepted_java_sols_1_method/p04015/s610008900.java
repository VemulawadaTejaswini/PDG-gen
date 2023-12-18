import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int A = Integer.parseInt(S[1]);
    
    int[] num = new int[N];
    int max = A;
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(sc.next());
      max = max < num[i] ? num[i] : max;
    }
    
    int M = N*max;
    long[][][] dp = new long[N+1][N+1][M+1];
    for(int i = 0; i <= N; i++){
      dp[i][0][0] = 1;
    }
    
    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= i; j++){
        for(int k = 0; k <= M; k++){
          int z = num[i-1];
          if(z > k){
            dp[i][j][k] = dp[i-1][j][k];
          }else{
            dp[i][j][k] = dp[i-1][j][k] + dp[i-1][j-1][k-z];
          }
        }
      }
    }
    
    long ans = 0;
    for(int i = 1; i <= N; i++){
      ans += dp[N][i][i*A];
    }
    System.out.println(ans);
  }
}