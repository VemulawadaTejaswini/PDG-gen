import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }
        long[] prefSum = new long[N];
        prefSum[0] = A[0];
        for (int i = 1; i < N; i++) {
            prefSum[i] = prefSum[i-1] + A[i];
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += (sum-prefSum[i])*A[i]%MOD;
            ans %= MOD;
        }


        System.out.println(ans);
    }
}
