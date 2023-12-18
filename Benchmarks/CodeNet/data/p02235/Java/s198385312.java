
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = Integer.parseInt(scan.next());

        for (int i = 0; i < q; i++) {
            String s = scan.next();
            String t = scan.next();

            int[][] dp = new int[s.length() + 1][t.length() + 1];
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < t.length(); k++) {
                    if (s.charAt(j) == t.charAt(k)) {
                        dp[j + 1][k + 1] = Math.max(dp[j][k] + 1, Math.max(dp[j + 1][k], dp[j][k + 1]));
                    } else {
                        dp[j + 1][k + 1] = Math.max(dp[j + 1][k], dp[j][k + 1]);
                    }
                }
            }

            System.out.println(dp[s.length()][t.length()]);
        }
        scan.close();

    }

}

