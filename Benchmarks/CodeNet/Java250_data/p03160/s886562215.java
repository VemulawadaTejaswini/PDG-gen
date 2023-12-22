import java.util.Scanner;

public class Main {

    private static int frog1(int N, int[] h) {
        // subproblem:
        // f(k) = cost when standing on stone k (0 <= k < N)
        // f(N-1)

        // f(0) = 0
        // f(1) = abs(h[1], h[0])
        // f(k) = min:
        //        f(k-1) + abs(h[k], h[k-1])
        //        f(k-2) + abs(h[k], h[k-2])

        int[] dp = new int[N];
        dp[0] = 0;
        dp[1] = Math.abs(h[0] - h[1]);
        for (int k = 2; k < N; k++) {
            dp[k] = Math.min(
                    dp[k-1] + Math.abs(h[k] - h[k-1]),
                    dp[k-2] + Math.abs(h[k] - h[k-2])
            );
        }
        return dp[N-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = scanner.nextInt();
        }
        int res = frog1(N, h);
        System.out.println(res);
    }
}
