import java.io.*;
import java.util.*;

public class Main {

    void run() {
        while (true) {
            int R = readInt();
            int C = readInt();
            if(R == 0 && C == 0) break;
            boolean[][] osenbei = new boolean[R][C];
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    int x = readInt();
                    osenbei[i][j] = x == 1;
                }
            }
            int ans = 0;
            for (int S = 0; S < 1 << R; S++) {
                int tmp = 0;
                for (int j = 0; j < C; j++) {
                    int k = 0;
                    for (int i = 0; i < R; i++) {
                        if(osenbei[i][j] ^ (((S >> i) & 1) != 0)) k++;
                    }
                    tmp += Math.max(k, R - k);
                }
                ans = Math.max(ans, tmp);
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