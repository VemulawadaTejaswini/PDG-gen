import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String X = null, Y = null;
        int[][] dp = new int[1001][1001];

        int q = sc.nextInt();

        for (int i = 0; i < q; ++i) {
            X = sc.next();
            Y = sc.next();
            for (int x = 0; x < X.length(); ++x) {
                for (int y = 0; y < Y.length(); ++y) {
                    if (X.charAt(x) == Y.charAt(y)) {
                        dp[x + 1][y + 1] = dp[x][y] + 1;
                    }
                    else {
                        if (dp[x + 1][y] > dp[x][y + 1]) {
                            dp[x + 1][y + 1] = dp[x + 1][y];
                        }
                        else {
                            dp[x + 1][y + 1] = dp[x][y + 1];
                        }
                    }
                }
            }
            System.out.printf("%d\n", dp[X.length()][Y.length()]);
        }
    }
}