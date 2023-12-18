
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer n = Integer.parseInt(scan.next());
        Integer capa = Integer.parseInt(scan.next());

        int[] v = new int[n];
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(scan.next());
            w[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        int[] dp = new int[capa + 1];
        for (int i = 1; i <= capa; i++) {
            int max = dp[i - 1];
            for (int j = 0; j < n; j++) {
                if (w[j] <= i && max < dp[i - w[j]] + v[j]) {
                    max = dp[i - w[j]] + v[j];
                }
            }
            dp[i] = max;
        }

        System.out.println(dp[capa]);
    }

}

