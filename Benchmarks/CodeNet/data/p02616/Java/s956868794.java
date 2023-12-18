import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1000000007;  // 10**9 + 7

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;
    private static int N;
    private static int K;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        N = readInt();
        K = readInt();
        long[] A = new long[N];
        int index = -1;
        for (int i = 0; i < N; i++) {
            long c = readInt();
            if (c != 0) A[++index] = c;
        }
        N = index + 1;

        long[] arr = Arrays.copyOf(A, N);
        Arrays.sort(arr);

        pw.println((solve(arr) + MOD) % MOD);
        pw.close();
    }

    // no zeros in A. A must be sorted
    private static long solve(long[] A) {
        if (K > N) return 0;

        if (K == 1 || K == N || A[0] > 0) {
            return productMod(A, N - K, N);
        }
        // 2 <= K < N and A[0] < 0 now.

        if (A[N - 1] < 0) {
            if (K % 2 == 0) return productMod(A, 0, K);
            else return productMod(A, N - K, N);
        }
        // A[N-1] > 0 now.

        // Answer cannot be negative now, since we have A[0] * product(A, 1, K-1) and
        // product(A, 1, K-1) * A[n-1], which cannot be negative at the same time.

        int lastNegativeIndex = 0;
        while (A[lastNegativeIndex + 1] < 0) lastNegativeIndex++;

        int firstPositiveIndex = N - 1;
        while (A[firstPositiveIndex - 1] > 0) firstPositiveIndex--;

        if (lastNegativeIndex / 2 * 2 + N - firstPositiveIndex < K) return 0;
        // Answer must be > 0 now.

        // Two-pointers technique
        int negativeIndex = 0;
        int positiveIndex = (K % 2 == 0) ? N - 1 : N - 2;
        long answer = (K % 2 == 0) ? 1 : A[N - 1];
        long count = (K % 2 == 0) ? 0 : 1;
        // count == K (mod 2)

        // multiply by either two positive factors or two negative factors.
        while ((count < K) && (negativeIndex < lastNegativeIndex || positiveIndex > firstPositiveIndex)) {
            long pN = (negativeIndex < lastNegativeIndex) ?
                    A[negativeIndex] * A[negativeIndex + 1] : 0;
            long pP = (positiveIndex > firstPositiveIndex) ?
                    A[positiveIndex] * A[positiveIndex - 1] : 0;

            if (pN <= pP) {
                answer = answer * (pP % MOD) % MOD;
                positiveIndex -= 2;
            } else {
                answer = answer * (pN % MOD) % MOD;
                negativeIndex += 2;
            }

            count += 2;
        }

        assert count == K : "Not enough numbers in the product";
        return answer;
    }

    static long productMod(long[] A, int start, int endExclusive) {
        long p = 1;
        for (int i = start; i < endExclusive; i++) {
            p = p * A[i] % MOD;
        }
        return p;
    }
}
