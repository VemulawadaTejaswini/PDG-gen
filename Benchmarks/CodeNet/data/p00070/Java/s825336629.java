import java.io.*;
import java.util.*;

public class Main {
    int N, S, ans;

    void run() {
        while (true) {
            try {
                N = readInt();
                S = readInt();
                ans = 0;
                used = new boolean[10];
                perm = new int[10];
                permutation(0, 10);
                ans /= factorial(10 - N);
                sysout.println(ans);
            } catch (NullPointerException e) {
                break;
            }
        }
    }

    int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    boolean[] used;
    int[] perm;

    void permutation(int pos, int n) {
        if (pos == n) {
            // do something
            int s = 0;
            for(int i = 1; i <= N; ++i) {
                s += i * perm[i - 1];
            }
            if(s == S) ++ans;
            return;
        }
        for (int i = 0; i < n; ++i) {
            if (used[i]) continue;
            used[i] = true;
            perm[pos] = i;
            permutation(pos + 1, n);
            used[i] = false;
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