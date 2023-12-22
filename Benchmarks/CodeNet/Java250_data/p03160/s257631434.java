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
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int[] DP = new int[N];
        DP[1] = Math.abs(A[1] - A[0]);

        for (int i = 2; i < N; i++) {
            DP[i] = Math.min(DP[i - 1] + Math.abs(A[i] - A[i - 1]), DP[i - 2] + Math.abs(A[i] - A[i - 2]));
        }
        System.out.println(DP[N - 1]);
    }
}