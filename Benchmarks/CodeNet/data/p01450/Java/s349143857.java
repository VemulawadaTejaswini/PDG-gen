/*

ÂoÂbÂOÂÃÂÃ¼ÂÃªÂÃ©ÂFÂBÂÃÂdÂÂ³ÂÃ°ÂÂÂÃÂÃÂÂµÂÃÂÂ¤ ÂÂ x ÂÃÂÂ·ÂÃ©
ÂÂ±ÂÃÂdÂÂ³ÂÂ¿ÂÃ¥ÂÂ¤ÂÃÂÃÂÃÂÃ©ÂÃ¦ÂÂ¤ÂÃÂAÂFÂBÂÃ°ÂoÂbÂOÂÃÂÃ¼ÂÃªÂÃ©ÂpÂ^Â[ÂÂÂÂÂÃ°ÂlÂÂ¦ÂÃ©

x ÂÃ°ÂÂÂÃÂÃ©ÂÃÂA(W - x) ÂÃÂÂºÂÃÂdÂÂ³ÂÃÂFÂBÂÃÂAÂSÂÃÂoÂbÂOÂÃÂÃ¼ÂÃªÂÃÂÂ¯ÂÃªÂÃÂÃÂÃ§ÂÃÂÂ¢
  ÂÂÂÂ±ÂÃÂlÂÂ½ÂÂ¿ÂÃÂdÂÂ³ÂÃÂÂÂvÂÃ° pre[W - x] ÂÃÂÂ·ÂÃ©

ÂÂ ÂÃÂAÂoÂbÂOÂÃÂÃ¼ÂÃªÂÃ§ÂÃªÂÃ©ÂcÂÃ¨ÂÃÂdÂÂ³ÂÃ (x - pre[W - x]) ÂÃÂÂ ÂÃ©

ÂÃÂÃÂÃ¨ÂAÂoÂbÂOÂÃÂdÂÂ³ÂÃ° x ÂÃÂÂ·ÂÃ©ÂÂ½ÂÃÂÃÂpÂ^Â[ÂÂÂÂÂÃÂA
Âu(x - pre[W - x]) ÂÃÂdÂÂ³ÂÃ° (W - x + 1) ÂÃÂÃ£ÂÃÂdÂÂ³ÂÃÂFÂBÂÃÂÃÂÂ»ÂÂ·ÂÃ©ÂpÂ^Â[ÂÂÂÂÂvÂÃÂÃÂÃ©


ÂÂ±ÂÃÂÃ¨ÂÂÂÃ°ÂADPÂÃÂÂ©ÂOÂvÂZÂÃÂÂ©ÂgÂÃÂÃÂÂÂÂÂÂ·ÂÃªÂÃÂÂ¢ÂÂ¢

 */
import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int MOD = 1000000007;

    while(br.ready()){
      String[] s = br.readLine().split(" ");
      int N = Integer.parseInt(s[0]);
      int W = Integer.parseInt(s[1]);
      ArrayList<Integer> wal = new ArrayList<Integer>();
      int[] pre = new int[W + 2];

      for(int i = 0; i < N; i++){
        int x = Integer.parseInt(br.readLine());

        if(x <= W){
          pre[x] += x;
          wal.add(x);
        }
      }

      for(int i = 0; i < W; i++){
        pre[i + 1] += pre[i];
      }

      Collections.sort(wal);
      Integer[] w = (Integer[])wal.toArray(new Integer[0]);
      N = w.length;

      int[] idx = new int[W + 2];
      Arrays.fill(idx, -1);

      int[][] dp = new int[N + 2][W + 2];
      dp[N][0] = 1;

      for(int i = N; i > 0; i--){
        for(int j = 0; j <= W; j++){
          dp[i - 1][j] += dp[i][j];
          dp[i - 1][j] %= MOD;

          if(j + w[i - 1] <= W){
            dp[i - 1][j + w[i - 1]] += dp[i][j];
            dp[i - 1][j + w[i - 1]] %= MOD;
          }
        }

        if(w[i - 1] <= W){
          idx[w[i - 1]] = i - 1;
        }
      }

      idx[W + 1] = N;
      for(int i = W + 1; i > 0; i--){
        if(idx[i - 1] == -1){
          idx[i - 1] = idx[i];
        }
      }

      int ans = 0;

      for(int x = 0; x <= W; x++){
        if(x < pre[W - x]) continue;
        ans += dp[ idx[W - x + 1] ][ x - pre[W - x] ];
        ans %= MOD;
      }

      System.out.println(ans);
    }
  }
}