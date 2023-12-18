
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] xArr = new String[n];
        String[] yArr = new String[n];
        for (int i = 0; i < n; i ++) {
            xArr[i] = sc.next();
            yArr[i] = sc.next();
        }

        for (int q = 0; q < n; q++) {
            String x = xArr[q];
            String y = yArr[q];
            int nx = x.length();
            int ny = y.length();

            int[][] dp = new int[nx + 1][ny + 1];
            for (int i = 0; i < nx; i++) {
                for (int j = 0; j < ny; j++) {
                    if (x.charAt(i) == y.charAt(j)) {
                        dp[i + 1][j + 1] = dp[i][j] + 1;
                    } else {
                        dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                    }
                }
            }

            System.out.println(dp[nx][ny]);
        }

    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

