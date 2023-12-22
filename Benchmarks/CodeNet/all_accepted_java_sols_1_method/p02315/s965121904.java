
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer n = Integer.parseInt(scan.next());
        Integer capasity = Integer.parseInt(scan.next());

        int[] v = new int[n];
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(scan.next());
            w[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        int[][] dp = new int[n + 1][capasity + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= capasity; j++) {
                if (w[i] > j) {
                    dp[i+1][j] = dp[i][j];
                } else {
                    dp[i+1][j] = Math.max(dp[i][j], dp[i][j - w[i]] + v[i]);
                }
            }
        }

        System.out.println(dp[n][capasity]);
    }
}

