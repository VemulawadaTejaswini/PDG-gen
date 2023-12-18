import java.io.*;
import java.util.*;

import static java.lang.Integer.*;
import static java.lang.Long.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;


        st = new StringTokenizer(in.readLine());
        int N = parseInt(st.nextToken()), M = parseInt(st.nextToken());
        Long K = parseLong(st.nextToken());
        st = new StringTokenizer(in.readLine());
        long[] A = new long[N + 1];
        long[] B = new long[M + 1];
        A[0] = 0;
        B[0] = 0;
        for (int i = 1; i <= N; i++) {
            A[i] += (A[i - 1] + parseLong(st.nextToken()));
        }
        st = new StringTokenizer(in.readLine());
        for (int i = 1; i <= M; i++) {
            B[i] += (B[i - 1] + parseLong(st.nextToken()));
        }
        pw.println(solve(A, B, N, K));
        pw.close();
    }

    static Long solve(long[] A, long[] B, int N, long K) {
        long res = 0;
        int j = B.length - 1;
        for (int i = 0; i <= N; i++) {
            if (A[i] > K) break;
            while (B[j] > (K - A[i])) {
                j--;
            }
            res = Math.max(res, (i + j));
        }
        return res;
    }
}