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
        for (int i = 0; i < N; i++) {
            A[i]=readInt();
        }

        pw.println((solve(A) + MOD) % MOD);
        pw.close();
    }

    private static long solve(long[] A) {
        Arrays.sort(A);

        if (A[0] >= 0) {
            return productMod(A, N - K, N);
        }
        if (A[N - 1] <= 0) {
            if (K % 2 == 0) return productMod(A, 0, K);
            else return productMod(A, N - K, N);
        }

        if (K == N) {
            return productMod(A,0, N);
        }

        // A[0] < 0 < A[N-1] and K < N now.
        // Answer cannot be negative now, since A[0] * product(A, 1, K) and
        // product(A, 1, K) * A[N-1] cannot be negative at the same time.

        int lastNegativeIndex = 0;
        while (A[lastNegativeIndex + 1] < 0) lastNegativeIndex++;

        int firstPositiveIndex = N - 1;
        while (A[firstPositiveIndex - 1] > 0) firstPositiveIndex--;

        if ((lastNegativeIndex + 1) / 2 * 2 + N - firstPositiveIndex < K) return 0;
        // Answer must be > 0 now.

        // Two pointers
        int negativeIndex = 0;
        int positiveIndex = (K % 2 == 0) ? N - 1 : N - 2;
        long answer = (K % 2 == 0) ? 1 : A[N - 1];
        long count = (K % 2 == 0) ? 0 : 1;
        // count == K (mod 2) now

        // Choose either two positive factors or two negative factors.
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
