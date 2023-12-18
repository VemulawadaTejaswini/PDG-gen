import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1000000007;  // 10**9 + 7

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        final int N = readInt();
        final int K = readInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = readInt();
        }

        Arrays.sort(A);
        pw.println(solve(N, K, A));
        pw.close();
    }

    private static long solve(int N, int K, long[] A) {
        if (K == 1 || K == N || A[0] >= 0) {
            return productMod(A, N - K, N);
        }
        // 2 <= K < N and A[0] < 0 now.

        if (A[N - 1] <= 0) {
            if (K % 2 == 0) return productMod(A, 0, K);
            else return productMod(A, N - K, N);
        }
        // A[N-1] > 0 now.
        // Answer cannot be negative now, since we have product(A, 0, K-1) and
        // product(A, 1, K-1) * A[n-1], which cannot be negative at the same time.

        int lastNegativeIndex = 0;
        while (A[lastNegativeIndex + 1] < 0) lastNegativeIndex++;

        int firstPositiveIndex = N - 1;
        while (A[firstPositiveIndex - 1] > 0) firstPositiveIndex--;

        long answer = 1;
        long count = 0;
        int positiveIndex = N - 1;
        int negativeIndex = 0;

        // multiply either by two positive factors or by two negative factors.
        while (count < K - 1 && (negativeIndex < lastNegativeIndex || positiveIndex > firstPositiveIndex)) {
            long pN = 0, pP = 0;
            if (negativeIndex < lastNegativeIndex) pN = A[negativeIndex] * A[negativeIndex + 1];
            if (positiveIndex > firstPositiveIndex) pP = A[positiveIndex] * A[positiveIndex - 1];
            if (pN <= pP) {
                answer = answer * (pP % MOD) % MOD;
                positiveIndex -= 2;
            } else {
                answer = answer * (pN % MOD) % MOD;
                negativeIndex += 2;
            }
            count += 2;
        }

        // positive factors if needed and available
        while (count < K && positiveIndex >= firstPositiveIndex) {
            answer *= A[positiveIndex];
            positiveIndex--;
            count++;
        }

        if (count == K) return answer;
        else return 0;
    }

    static long productMod(long[] A, int start, int endExclusive) {
        long p = 1;
        for (int i = start; i < endExclusive; i++) {
            p = p * A[i] % MOD;
        }
        return p;
    }
}
