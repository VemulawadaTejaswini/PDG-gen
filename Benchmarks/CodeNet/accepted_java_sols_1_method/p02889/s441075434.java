import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long l = sc.nextLong();
    long[][] dp1 = new long[n][n];
    long[][] dp2 = new long[n][n];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(i != j) {
          dp1[i][j] = (long)Math.pow(10, 16);
          dp2[i][j] = (long)Math.pow(10, 16);
        }
      }
    }
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      long c = sc.nextLong();
      dp1[a][b] = c;
      dp1[b][a] = c;
    }
    for(int k = 0; k < n; k++) {
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          dp1[i][j] = Math.min(dp1[i][j], dp1[i][k] + dp1[k][j]);
        }
      }
    }
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if((i != j) && (dp1[i][j] <= l)) dp2[i][j] = 1;
      }
    }
    for(int k = 0; k < n; k++) {
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          dp2[i][j] = Math.min(dp2[i][j], dp2[i][k] + dp2[k][j]);
        }
      }
    }

    int q = sc.nextInt();
    for(int i = 0; i < q; i++) {
      int s = sc.nextInt() - 1;
      int t = sc.nextInt() - 1;
      long ans = -1;
      if(dp2[s][t] < 1000) ans = dp2[s][t] - 1;
      System.out.println(ans);
    }
  }
}
