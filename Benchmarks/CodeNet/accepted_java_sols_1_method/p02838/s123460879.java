import java.util.*;
 
public class Main {
    private static final long MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][60];
        for (int i = 0; i < N; i++ ) {
            long a = sc.nextLong();
            int j = 0;
            while (a > 0) {
                A[i][j] = (int)(a%2);
                j++;
                a /= 2;
            }
        }

        long ans = 0;
        long pow = 1;
        for (int j = 0; j < 60; j++) {
            int num = 0;
            for (int i = 0; i < N; i++) {
                if (A[i][j] == 1) {
                    num++;
                }
            }
            ans += (((long)num*(N-num))%MOD)*pow%MOD;
            ans %= MOD;

            pow *= 2;
            pow %= MOD;
        }

        System.out.println(ans);
    }
}
