import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = Integer.parseInt(scanner.next());
    int w = Integer.parseInt(scanner.next());
    String[] a = new String[h];
    int[][] dp = new int[h + 1][w + 1];
    int MAX = 1000000007;
    for (int i = 0; i < h; i++) {
      a[i] = scanner.next();
      dp[i][0] = 0;
    }
    for (int i = 1; i < w; i++) {
      dp[0][i] = 0;
    }
    dp[0][1] = 1;
    for (int i = 1; i < h + 1; i++) {
      for (int j = 1; j < w + 1; j++) {
        if (a[i - 1].charAt(j-1) == '.') {
          dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
        } else {
          dp[i][j] = 0;
        }
        if (dp[i][j] >= MAX) {
          dp[i][j] %= MAX;
        }
      }
    }
    System.out.println(dp[h][w]);
  }
}
