import java.io.*;
import java.util.*;

public class Main {

    void run() {
        while (true) {
            int N = readInt();
            if (N == 0) break;
            int[] input = new int[N];
            for (int i = 0; i < N; i++) {
                input[i] = readInt();
            }
            double minH = Double.MAX_VALUE;
            Answer minParam = null;
            for (int S = 0; S < 16; S++) {
                for (int A = 0; A < 16; A++) {
                    for (int C = 0; C < 16; C++) {
                        double H = entropy(S, A, C, input);
//                        sysout.printf("(%d %d %d) = %f\n", S, A, C, H);
                        if (minH > H) {
                            minH = H;
                            minParam = new Answer(S, A, C);
                        }
                    }
                }
            }
            sysout.printf("%d %d %d\n", minParam.S, minParam.A, minParam.C);
        }
    }

    double entropy(int S, int A, int C, int[] input) {
        int n = input.length;
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            S = (A*S + C) % 256;
            output[i] = (S + input[i]) % 256;
        }
        int[] num = new int[256];
        Arrays.fill(num, 0);
        for (int i = 0; i < n; i++) {
            num[output[i]]++;
        }
        double H = 0.0;
        for (int i = 0; i < 256; i++) {
            if (num[i] == 0) continue;
            H += -(1.0 * num[i] / n) * Math.log(1.0 * num[i] / n);
        }
        return H;
    }

    class Answer implements Comparable<Answer> {
        public int S, A, C;

        public Answer(int s, int a, int c) {
            S = s;
            A = a;
            C = c;
        }

        @Override
        public int compareTo(Answer o) {
            if (S != o.S) return S - o.S;
            if (A != o.A) return A - o.A;
            return C - o.C;
        }
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