import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int[][] abc = new int[n][3];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++) {
        abc[i][j] = Integer.parseInt(scanner.next());
      }
    }
    int l, m;
    int[][] dp = new int[n][3];
    dp[0] = abc[0];
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < 3; j++) {
        l = (j + 1) % 3;
        m = (j + 2) % 3;
        dp[i][j] = Math.max(dp[i - 1][l] + abc[i][j], dp[i - 1][m] + abc[i][j]);
      }
    }
    Arrays.sort(dp[n - 1]);
    System.out.println(dp[n - 1][2]);
  }
}
