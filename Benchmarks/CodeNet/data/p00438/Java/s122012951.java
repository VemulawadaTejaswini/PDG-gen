import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int w = sc.nextInt();
      int h = sc.nextInt();
      if(w == 0 && h == 0) break;

      int n = sc.nextInt();
      boolean[][] t = new boolean[h][w];

      for(int i = 0; i < n; i++){
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;
        t[y][x] = true;
      }

      int[][] dp = new int[h][w];
      if(!t[0][0]){
        dp[0][0] = 1;
      }

      for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
          if(dp[i][j] == 0) continue;

          if(j + 1 < w && !t[i][j + 1]){
            dp[i][j + 1] += dp[i][j];
          }
          if(i + 1 < h && !t[i + 1][j]){
            dp[i + 1][j] += dp[i][j];
          }
        }
      }

      System.out.println(dp[h - 1][w - 1]);
    }
  }
}