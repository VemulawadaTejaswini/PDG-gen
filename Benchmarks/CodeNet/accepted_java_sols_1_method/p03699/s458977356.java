import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        int[] dp = new int[10001];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 10000; j >= 0; j--) {
                if (dp[j] == 0) {
                    continue;
                }
                if (j + a[i] <= 10000) {
                    dp[j + a[i]] = 1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= 10000; i++) {
            if (dp[i] == 1 && i % 10 != 0) {
                ans = Math.max(ans, i);
            }
        }
        System.out.println(ans);
    }
}