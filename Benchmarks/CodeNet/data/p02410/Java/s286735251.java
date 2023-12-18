import java.io.*;
import java.util.*;

public class Main {
    void run() {
        int N = readInt();
        int M = readInt();
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = readInt();
            }
        }
        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            b[i] = readInt();
        }
        for (int i = 0; i < N; i++) {
            int ans = 0;
            for (int j = 0; j < M; j++) {
                ans += A[i][j] * b[j];
            }
            sysout.println(ans);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = null;

    String readLine() {
        buffer = null;
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    String read() {
        if (buffer == null || !buffer.hasMoreTokens()) {
            buffer = new StringTokenizer(readLine());
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }
}