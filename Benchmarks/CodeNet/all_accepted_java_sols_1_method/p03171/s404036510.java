import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; ++i) {
            arr[i] = scanner.nextInt();
        }

        long[][] dp = new long[count + 1][count + 1];
        for (int piles = 1; piles <= count; ++piles) {
            for (int start = 0; start + piles <= count; ++start) {
                if ((count - piles) % 2 == 0) {
                    dp[piles][start] = Math.max(
                            dp[piles - 1][start + 1] + arr[start],
                            dp[piles - 1][start] + arr[start + piles - 1]);
                } else {
                    dp[piles][start] = Math.min(
                            dp[piles - 1][start + 1] - arr[start],
                            dp[piles - 1][start] - arr[start + piles - 1]);
                }
            }
        }

        System.out.println(dp[count][0]);
    }
}
