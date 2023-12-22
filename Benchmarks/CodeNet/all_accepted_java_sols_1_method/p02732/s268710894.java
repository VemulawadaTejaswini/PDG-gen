import java.util.Scanner;

/**
 * Banned K
 * 
 * https://atcoder.jp/contests/abc159/tasks/abc159_d
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long[] B = new long[N + 1];
        for (int a : A) {
            B[a]++;
        }

        long K = 0;
        for (int i = 1; i <= N; i++) {
            K += B[i] * (B[i] - 1) / 2;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            long b = B[A[i]];
            if (b < 2) {
                ans.append(K).append("\n");
            } else {
                ans.append(K - b * (b - 1) / 2 + (b - 1) * (b - 2) / 2).append("\n");
            }
        }

        System.out.println(ans.toString());
    }

}
