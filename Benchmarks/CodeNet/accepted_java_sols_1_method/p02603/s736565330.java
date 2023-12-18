import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long[] dp = new long[N+1];
        dp[0] = 1000;
        for (int i = 1; i <= N; i++) {
            dp[i] = dp[i-1];
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j-1]/A[j-1]*A[i-1]+dp[j-1]%A[j-1]);
            }
        }

        System.out.println(dp[N]);
    }
}
