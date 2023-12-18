import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static int[] a, b;
  static final int INF = 200000000;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    int[][] g = new int[n][n];

    for(int i = 0; i < n; i++){
      in = br.readLine().split(" ");
      for(int j = 0; j < n; j++){
        g[i][j] = Integer.parseInt(in[j+1]);
      }
    }
    
    br.close();

    int ans = 0;

    int[] cost = new int[n];
    Arrays.fill(cost, INF);

    cost[0] = 0;

    for(int i = 0; i < n; i++){
      int minCost = INF;
      int minCostIdx = -1;
      for(int j = 0; j < n; j++){
        if(cost[j] == -1) continue;
        if(cost[j] < minCost) {
          minCost = cost[j];
          minCostIdx = j;
        }
      }

      ans += cost[minCostIdx];

      for(int j = 0; j < n; j++){
        if(g[minCostIdx][j] == -1 || cost[j] == -1) continue;
        cost[j] = Math.min(g[minCostIdx][j], cost[j]);
      }

      cost[minCostIdx] = -1;

    }

    System.out.println(ans);
  }
}
