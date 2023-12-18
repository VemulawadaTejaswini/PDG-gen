import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner itr = new Scanner(System.in);
        int N = itr.nextInt();
        int[] stone = new int[N];

        for (int i = 0; i < N; i++) {
            stone[i] = itr.nextInt();
        }

        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = Math.abs(stone[0] - stone[1]);

        for (int i = 2; i < N; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(stone[i - 1] - stone[i]), dp[i - 2] + Math.abs(stone[i - 2] - stone[i]));
        }

        System.out.println(dp[N - 1]);
    }
}