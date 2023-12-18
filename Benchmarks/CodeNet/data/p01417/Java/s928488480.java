import java.io.*;
import java.util.*;

public class Main {

    void run() {
        int N = readInt();
        int M = readInt();
        double[] L = new double[N];
        double[] A = new double[N];
        double[] B = new double[N];
        for (int i = 0; i < N; i++) {
            L[i] = readDouble();
            A[i] = readDouble();
            B[i] = readDouble();
        }
        double max = 0.0;
        for (int i = 0; i < 1 << N; i++) {
            if (Integer.bitCount(i) == M) {
                double sum = 0.0;
                for (int a = 0; a < N; a++) {
                    for (int b = a + 1; b < N; b++) {
                        if (((i >> a) & 1) != 0 && ((i >> b) & 1) != 0) {
                            double dl = L[a] - L[b];
                            double da = A[a] - A[b];
                            double db = B[a] - B[b];
                            sum += (dl * dl + da * da + db * db);
                        }
                    }
                }
                max = Math.max(max, sum);
            }
        }
        sysout.printf("%.5f\n", max);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = new StringTokenizer("");

    String read() {
        if (!buffer.hasMoreTokens()) {
            try {
                buffer = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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

    String readLine() {
        buffer = new StringTokenizer("");
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}