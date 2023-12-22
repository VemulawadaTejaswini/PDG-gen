import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            ans += p;
            dp[i] = p;
        }
        Arrays.sort(dp);
        if (ans%10 != 0) {
            System.out.println(ans);
        } else {
            for (int i = 0; i < n; i++) {
                if (dp[i]%10 == 0) {
                    continue;
                } else {
                    ans -= dp[i];
                    break;
                }
            }
            System.out.println(ans%10==0?0:ans);
        }
    }
}
