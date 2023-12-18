import java.io.*;
import java.util.*;

public class Main {
    void run() {
        int N = readInt();
        for (int i = 1; i <= N; i++) {
            int x = i;
            if (x % 3 == 0) {
                sysout.print(" " + i);
                continue;
            }
            while (x > 0) {
                boolean end = false;
                if (x % 10 == 3) {
                    sysout.print(" " + i);
                    end = true;
                }
                if (end) break;
                x /= 10;
            }
        }
        sysout.println();
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