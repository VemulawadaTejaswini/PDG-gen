import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextLong();
        }


        System.out.println(solve(N, A));
    }

    private static long solve(int N, long[] A) {
        long count = 1;
        int keta = 0;

        for (int i=0; i<N; i++) {
            if (A[i] == 0) return 0;

            count *= A[i];

            while (A[i] >= 10) {
                A[i] /= 10;
                keta++;
                // System.err.println(A[i] + ", " + keta);
            }
            if (keta > 18) return -1;
        }

        if (count > 1_000_000_000_000_000_000L) return -1;

        return count;
    }
}