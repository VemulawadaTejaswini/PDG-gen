
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        char[][] grid  = new char[h + 1][w + 1];
        for (int i = 1; i <= h; ++i) {
            String current = scanner.next();
            for (int j = 1; j <= w; ++j) {
                grid[i][j] = current.charAt(j - 1);
                //System.out.println("current: " + current);
            }
        }
        int [][] dp = new int[h + 1][w + 1];
        for (int i = 1; i <= h; ++i) {
            for (int j = 1; j <= w; ++j) {
                dp[i][j] = 100000;
            }
        }
        if (grid[1][1] == '#') {
            dp[1][1] = 1;
        } else {
            dp[1][1] = 0;
        }
        for (int i = 1; i <= h; ++i) {
            for (int j = 1; j <= w; ++j) {
                if (i == 1 && j == 1) {
                    continue;
                }
                if (grid[i][j] == '.') {
                    if (i - 1 >= 1 && j - 1 >= 1) {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]);
                    } else if (i - 1 >= 1) {
                        dp[i][j] = dp[i - 1][j];
                    } else if (j - 1 >= 1) {
                        dp[i][j] = dp[i][j - 1];
                    }
                } else {
                    if (i - 1 >= 1) {
                        if (grid[i - 1][j] == '#') {
                            dp[i][j] = dp[i - 1][j];
                        } else {
                            dp[i][j] = dp[i - 1][j] + 1;
                        }
                    }
                    if (j - 1 >= 1) {
                        if (grid[i][j - 1] == '#') {
                            dp[i][j] = Math.min(dp[i][j], dp[i][j - 1]);
                        } else {
                            dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                        }
                    }
                }
           //     System.out.println("dp[" + i + "][" + j + "]: " + dp[i][j] );
            }
        }
        System.out.println(dp[h][w]);
    }
}
