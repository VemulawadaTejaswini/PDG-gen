import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int h[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            h[i] = sc.nextInt();
        }
        int dp[] = new int[n + 1];
        dp[1] = 0;
        for (int i = 2; i < n + 1; i++) {
            int tmp = Integer.MAX_VALUE;
            for (int j = i - k; j < i; j++) {
                if (j < 1)
                    continue;
                int sa = Math.abs(h[i] - h[j]);
                int wa = dp[j] + sa;
                if (wa < tmp) {
                    tmp = wa;
                }
            }
            dp[i] = tmp;
        }
        System.out.println(dp[n]);
    }
}
