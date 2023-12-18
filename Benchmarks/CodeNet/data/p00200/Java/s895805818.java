import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      if(n == 0 && m == 0) break;

      int[][] costs = new int[m][m];
      int[][] times = new int[m][m];

      for(int i = 0; i < m; i++) {
        for(int j = 0; j < m; j++) {
          costs[i][j] = INFINITY;
          times[i][j] = INFINITY;
        }
      }

      for(int i = 0; i < n; i++) {
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int cost = sc.nextInt();
        int time = sc.nextInt();

        costs[a][b] = cost;
        costs[b][a] = cost;
        times[a][b] = time;
        times[b][a] = time;
      }

      for(int i = 0; i < m; i++) {
        for(int j = 0; j < m; j++) {
          if(i == j) continue;
          for(int k = 0; k < m; k++) {
            if(i == k || j == k) continue;

            costs[j][k] = Math.min(costs[j][k], costs[j][i] + costs[i][k]);
            times[j][k] = Math.min(times[j][k], times[j][i] + times[i][k]);
          }
        }
      }

      int k = sc.nextInt();

      for(int i = 0; i < k; i++) {
        int p = sc.nextInt() - 1;
        int q = sc.nextInt() - 1;
        int r = sc.nextInt();

        switch(r) {
        case 0:
          System.out.println(costs[p][q]); break;
        case 1:
          System.out.println(times[p][q]); break;
        }
      }
    }
  }

  private Scanner sc = new Scanner(System.in);
  private static final int INFINITY = 100000000;
}