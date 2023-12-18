import java.io.*;
import java.util.*;

public class Main {
    void run() {
        int N = readInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = readInt();
        }
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = readInt();
        }
        {
            double sum = 0.0;
            for (int i = 0; i < N; i++) {
                sum += Math.abs(A[i] - B[i]);
            }
            sysout.println(sum);
        }
        {
            double sum = 0.0;
            for (int i = 0; i < N; i++) {
                sum += Math.pow(Math.abs(A[i] - B[i]), 2);
            }
            sysout.println(Math.sqrt(sum));
        }
        {
            double sum = 0.0;
            for (int i = 0; i < N; i++) {
                sum += Math.pow(Math.abs(A[i] - B[i]), 3);
            }
            sysout.println(Math.cbrt(sum));
        }
        {
            double max = 0.0;
            for (int i = 0; i < N; i++) {
                max = Math.max(max, Math.abs(A[i] - B[i]));
            }
            sysout.println(max);
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