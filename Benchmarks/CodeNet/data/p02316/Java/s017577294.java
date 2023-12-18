
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();

        int[] vArr = new int[n];
        int[] wArr = new int[n];
        for (int i = 0; i< n;i++) {
            vArr[i] = sc.nextInt();
            wArr[i] = sc.nextInt();
        }

        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= w; j++) {
                if (wArr[i] <= j) {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i + 1][j - wArr[i]] + vArr[i]);
                } else {
                    dp[i + 1][j] = dp[i][j];
                }
            }
        }

//        debug(dp);

        System.out.println(dp[n][w]);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

