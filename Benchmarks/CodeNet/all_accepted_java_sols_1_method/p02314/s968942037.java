import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] c = new int[M];
        for (int i = 0; i < M; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);

        int[] dp = new int[N+1];
        for (int i = 0; i < N+1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;

        for (int coin : c) {
            for (int i = 0; i < N; i++) {
                if (i + coin > N) continue;
                dp[i + coin] = Math.min(dp[i + coin], dp[i] + 1);
            }
        }

        System.out.println(dp[N]);
    }
}
