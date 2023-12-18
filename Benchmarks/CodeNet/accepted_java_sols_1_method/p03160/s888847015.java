import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] stones = new int[N];
        for(int i = 0; i < N; i++) stones[i] = scanner.nextInt();

        int[] dp = new int[N];
        dp[1] = Math.abs(stones[1] - stones[0]);
        for(int i = 2; i < N; i++) {
            dp[i] = Math.min(Math.abs(stones[i] - stones[i - 2]) + dp[i - 2],
                    Math.abs(stones[i] - stones[i - 1]) + dp[i - 1]);
        }
        System.out.println(dp[N - 1]);
    }
}