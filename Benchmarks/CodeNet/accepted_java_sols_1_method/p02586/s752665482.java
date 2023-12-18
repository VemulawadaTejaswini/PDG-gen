import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head = br.readLine().split(" ");
    int r = Integer.parseInt(head[0]);
    int c = Integer.parseInt(head[1]);
    int k = Integer.parseInt(head[2]);
    long[][] item_map = new long[r + 1][c + 1];
    for(int i = 0; i < k; i++){
      String[] data = br.readLine().split(" ");
      int ri = Integer.parseInt(data[0]);
      int ci = Integer.parseInt(data[1]);
      long vi = Long.parseLong(data[2]);
      item_map[ri][ci] = vi;
    }
    br.close();

    long[][][] dp = new long[r + 1][c + 1][4];
    for(int r_pos = 1; r_pos <= r; r_pos++){
      for(int c_pos = 1; c_pos <= c; c_pos++){
        //同一行0個の最大値
        dp[r_pos][c_pos][0] = dp[r_pos][c_pos - 1][0];
        dp[r_pos][c_pos][0] = Math.max(dp[r_pos][c_pos][0], dp[r_pos - 1][c_pos][0]);
        dp[r_pos][c_pos][0] = Math.max(dp[r_pos][c_pos][0], dp[r_pos - 1][c_pos][1]);
        dp[r_pos][c_pos][0] = Math.max(dp[r_pos][c_pos][0], dp[r_pos - 1][c_pos][2]);
        dp[r_pos][c_pos][0] = Math.max(dp[r_pos][c_pos][0], dp[r_pos - 1][c_pos][3]);

        //同一行1個の最大値
        dp[r_pos][c_pos][1] = dp[r_pos][c_pos - 1][1];
        dp[r_pos][c_pos][1] = Math.max(dp[r_pos][c_pos][1], dp[r_pos][c_pos][0] + item_map[r_pos][c_pos]);

        //同一行2個の最大値
        dp[r_pos][c_pos][2] = dp[r_pos][c_pos - 1][2];
        dp[r_pos][c_pos][2] = Math.max(dp[r_pos][c_pos][2], dp[r_pos][c_pos - 1][1] + item_map[r_pos][c_pos]);

        //同一行3個の最大値
        dp[r_pos][c_pos][3] = dp[r_pos][c_pos - 1][3];
        dp[r_pos][c_pos][3] = Math.max(dp[r_pos][c_pos][3], dp[r_pos][c_pos - 1][2] + item_map[r_pos][c_pos]);
      }
    }

    long ans = 0;
    for(int i = 0; i < 4; i++){
      ans = Math.max(ans, dp[r][c][i]);
    }
    System.out.println(ans);
  }
}