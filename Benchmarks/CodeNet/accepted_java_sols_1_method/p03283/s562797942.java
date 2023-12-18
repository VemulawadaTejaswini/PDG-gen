import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int q = sc.nextInt();
    int[][] train = new int[n][n];
    for(int i = 0; i < m; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      train[l - 1][r - 1]++;
    }
    int[][] ruiseki = new int[n][n];
    for(int i = 0; i < n; i++) {
      ruiseki[i][0] = train[i][0];
      for(int j = 1; j < n; j++) {
        ruiseki[i][j] = ruiseki[i][j - 1] + train[i][j];
      }
    }
    for(int i = 0; i < q; i++) {
      int p = sc.nextInt();
      int t = sc.nextInt();
      int ans = 0;
      for(int j = p - 1; j < t; j++) {
        if(p > 1) {
          ans += (ruiseki[j][t - 1] - ruiseki[j][p - 2]);
        } else {
          ans += (ruiseki[j][t - 1]);
        }
      }
      System.out.println(ans);
    }
  }
}