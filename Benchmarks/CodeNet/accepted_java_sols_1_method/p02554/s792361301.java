import java.util.*;
public class Main {
    static long MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        long N = sc.nextLong();
        long ans = 1;
        long A = 1;
        long B = 1;
        long C = 1;

        for (int i = 0; i < N; i++) {
            A = A * 10 % MOD;
        }

        for (int i = 0; i < N; i++) {
            B = B * 9 % MOD;
        }

        for (int i = 0; i < N; i++) {
            C = C * 8 % MOD;
        }

        ans = A - B - B + C;
        ans %= MOD;
        ans = (ans + MOD) % MOD;
        System.out.println(ans);
		sc.close();
    }
}
