import java.util.Scanner;

public class Main {
    static int n;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[9]; //0:灰色～7:赤 8:それ以上
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int color = Math.min(8, sc.nextInt()/400);
            dp[color]++;
        }
        for (int i = 0; i < 8; i++) {
            if (dp[i] != 0) {
                ans++;
            }
        }
        System.out.println(Math.max(1, ans) + " " + (ans + dp[8]));
    }
}
