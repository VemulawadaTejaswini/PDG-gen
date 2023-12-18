import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] lib = new int[300];
    int[] lib2 = new int[300];
    int libi = 0;
    int lib2i = 0;
    for (int i = 1; ; i++) {
      int k = (i * (i + 1) * (i + 2)) / 6;
      lib[libi++] = k;
      if (k % 2 == 1) {
        lib2[lib2i++] = k;
      }
      if (k >= 1000000) {
        break;
      }
    }
    while (true) {
      int n = sc.nextInt();
      if (n == 0) {
        break;
      }
      System.out.println(calc(n, lib) + " " + calc(n, lib2));
    }
  }

  public static int calc(int n, int[] lib) {
    int[][] dp = new int[300][n + 1];
    for (int i = 0; i < 300; i++) {
      for (int j = 0; j < n + 1; j++) {
        dp[i][j] = Integer.MAX_VALUE;
      }
    }
    for (int i = 0; i <= n; i++) {
      dp[0][i] = i;
    }
    for (int i = 1; i < lib.length; i++) {
      int v = lib[i];
      if (lib[i] > n) {
//        System.out.println("--------");
//        for (int o = 0; o < i; ++o) {
//          for (int j = 0; j <= n; ++j) {
//            System.out.printf(" %2d", dp[o][j]);
//          }
//          System.out.println();
//        }

        return dp[i - 1][n];
      }
      for (int j = 0; j <= n; j++) {
        if (dp[i - 1][j] == Integer.MAX_VALUE) {
          continue;
        }
        for (int k = 0; j + k * v <= n; k++) {
          dp[i][j + k * v] = Math.min(dp[i][j + k * v], dp[i - 1][j] + k);
        }
      }
    }
    return dp[lib.length][n];
  }
}