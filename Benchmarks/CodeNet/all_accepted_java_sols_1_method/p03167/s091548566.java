import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int M = 1_000_000_007;
    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] grid = new char[H][W];
    for (int i = 0; i < H; i++) grid[i] = scanner.next().toCharArray();

    long[][] dp = new long[H][W];
    dp[0][0] = 1;
    for (int i = 1; i < W; i++) if(grid[0][i] == '.') dp[0][i] = dp[0][i - 1];
    for (int i = 1; i < H; i++) if(grid[i][0] == '.') dp[i][0] = dp[i - 1][0];
    for (int i = 1; i < H; i++)
      for (int j = 1; j < W; j++) 
        if (grid[i][j] == '.') dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % M;
    System.out.println(dp[H - 1][W - 1]);
  }
}
