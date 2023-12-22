import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] dp = new boolean[100 * 100 + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            for (int j = 100 * 100; j >= num; j--) {
                if (dp[j - num]) {
                    dp[j] = true;
                }
            }
        }
        for (int i = 100 * 100; i >= 0; i--) {
            if(i % 10 != 0 && dp[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
