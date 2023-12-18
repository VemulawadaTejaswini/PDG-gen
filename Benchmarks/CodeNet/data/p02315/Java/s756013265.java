import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int WW = Integer.parseInt(sc.next());
    int[] v = new int[N];
    int[] w = new int[N];
    for(int i=0; i<N; i++){
      v = Integer.parseInt(sc.next());
      w = Integer.parseInt(sc.next());
    }

    int[][] dp = new int[N+1][WW+1];
    for(int i=1; i<N+1; i++){
        dp[i][0] = 0;
    }
  
    for (int i=1; i<=N; i++) {
      for (int W=1; W<=WW; W++) {
        if(W>=w[i]){
            dp[i][W] = Math.max(dp[i-1][W], dp[i-1][W-w[i]] + v[i]);
        }else{
          dp[i][W] = dp[i-1][WW];
        }
      
      }
    }

    Systm.out.println(dp[N][W]);
  }
}