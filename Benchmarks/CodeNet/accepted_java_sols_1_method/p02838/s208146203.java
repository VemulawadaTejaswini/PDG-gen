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

            long ans = 0;

            long sum = 0;
            int[] count = new int[62];

            for (int j = 0; j < 60; j++) {
                count[j] += ((A[0] >> j) & 1);
            }

            for (int i = 1; i < N; i++) {
                sum = (sum + (A[i - 1] % 1000000007)) % 1000000007;

                int[] b = new int[62];
                for (int j = 0; j < 60; j++) {
                    b[j] += ((A[i] >> j) & 1);
                }

                ans = (ans + (A[i] % 1000000007) * i) % 1000000007;
                ans = (ans + sum) % 1000000007;

                for (int j = 0; j < 60; j++) {
                    if (b[j] == 1) {
                        ans = (ans - count[j] * ((1L << j) % 1000000007) * 2) % 1000000007;
                        while (ans < 0) {
                            ans += 1000000007;
                        }
                    }
                }

                for (int j = 0; j < 60; j++) {
                    count[j] += b[j];
                }
            }

            System.out.println(ans);
        }
    }

}
