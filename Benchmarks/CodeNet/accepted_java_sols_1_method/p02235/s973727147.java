import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for(int a = 0; a < q; a++) {
            String x = sc.next();
            String y = sc.next();

            // xの(i + 1)番目までとyの(j + 1)番目までの最長共通部分列
            int[][] dp = new int[x.length() + 1][y.length() + 1];
            for(int i = 0; i < x.length(); i++) {
                for(int j = 0; j < y.length(); j++) {
                    if(x.charAt(i) == y.charAt(j)) dp[i + 1][j + 1] = dp[i][j] + 1;
                    else dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }

            System.out.println(dp[x.length()][y.length()]);
        }

        sc.close();
    }
}

