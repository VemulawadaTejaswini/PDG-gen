import java.io.IOException;// 从这行开始复制，这是第一行
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int N2 = N * N;
        int[][] dp = new int[N][N];

        for (int i = 0; i < (N + 1) / 2; i++) {
            for (int j = 0; j < (N + 1) / 2; j++) {
                dp[i][j] = Math.min(i, j);
                dp[i][N - 1 - j] = dp[i][j];
                dp[N - 1 - i][j] = dp[i][j];
                dp[N - 1 - i][N - 1 - j] = dp[i][j];
            }
        }


        int ans = 0;
        for (int i = 0; i < N2; i++) {
            int a = sc.nextInt();
            int row = (a - 1) / N;
            int col = (a - 1) % N;
            ans += dp[row][col];
            //TODO 更新每个人的消耗呀。
            update(dp, row, col, dp[row][col]);
            my--;

//            for (int ii = 0; ii < N; ii++) {
//                for (int j = 0; j < N; j++) {
//                    System.out.print(dp[ii][j] + "  ");
//                }
//                System.out.print("\r\n");
//            }
//            System.out.println("\r\n");
        }
        System.out.println(ans);

    }

    List<int[]> list = new ArrayList<>();

    static int my = -1;

    public static void update(int[][] dp, int x, int y, int data) {
        dp[x][y] = my;
        if (x - 1 >= 0 && data < dp[x - 1][y]) {
            if (data < dp[x - 1][y]) {
                dp[x - 1][y]--;
            } else if (dp[x - 1][y] < 0 && dp[x - 1][y] != my) {
                update(dp, x - 1, y, data);
            }
        }
        if (x + 1 < dp.length) {
            if (data < dp[x + 1][y]) {
                dp[x + 1][y]--;
            } else if (dp[x + 1][y] < 0 && dp[x + 1][y] != my) {
                update(dp, x + 1, y, data);
            }
        }

        if (y - 1 >= 0) {
            if (data < dp[x][y - 1]) {
                dp[x][y - 1]--;
            } else if (dp[x][y - 1] < 0 && dp[x][y - 1] != my) {
                update(dp, x, y - 1, data);
            }
        }

        if (y + 1 < dp.length) {
            if (data < dp[x][y + 1]) {
                dp[x][y + 1]--;
            } else if (dp[x][y + 1] < 0 && dp[x][y + 1] != my) {
                update(dp, x, y + 1, data);
            }
        }

    }


}