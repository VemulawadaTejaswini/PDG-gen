import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int[] DP = new int[N];

        if (K > N) {
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < N; i++) {
                DP[i] = Math.abs(A[i] - A[0]);
                min = Math.min(DP[i], min);
            }
            System.out.println(min);
        } else {
            for (int i = 1; i < K; i++) {
                DP[i] = Math.abs(A[i] - A[0]);
            }
            for (int i = K; i < N; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= K; j++) {
                    min = Math.min(min, DP[i - j] + Math.abs(A[i] - A[i - j]));
                }
                DP[i] = min;
            }
            System.out.println(DP[N - 1]);
        }
    }
}