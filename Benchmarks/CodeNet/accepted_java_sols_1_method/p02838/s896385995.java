import java.util.Scanner;

/**
 * Xor Sum 4
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            long[] c = new long[60];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 60; j++) {
                    c[j] += ((A[i] >> j) & 1);
                }
            }

            long ans = 0;

            for (int j = 0; j < 60; j++) {
                ans = (ans + ((1L << j) % 1000000007) * ((N - c[j]) * c[j] % 1000000007)) % 1000000007;
            }

            System.out.println(ans);
        }
    }

}
