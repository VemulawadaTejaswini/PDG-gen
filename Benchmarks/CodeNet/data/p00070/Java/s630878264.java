import java.io.*;
import java.util.*;

public class Main {
    int[][] dp;

    void dfs(int bits, int sum) {
        for(int i = 0; i < 10; ++i) {
            if (((bits >> i) & 1) == 0) {
                int newBits = bits | (1 << i);
                int newSum = sum + i*(Integer.bitCount(bits) + 1);
                dp[newBits][newSum] += dp[bits][sum];
                // sysout.printf("dp[%d][%d] = %d\n", newBits, newSum, dp[newBits][newSum]);
                dfs(newBits, newSum);
            }
        }
    }

    void run() {
        dp = new int[1024][331];
        dp[0][0] = 1;
        dfs(0, 0);
        while (true) {
            try {
                int N = readInt();
                int S = readInt();
                if(S > 330) {
                    sysout.println(0);
                    continue;
                }
                int ans = 0;
                for (int i = 0; i < (1 << 10); ++i) {
                    if (Integer.bitCount(i) == N) {
                        ans += dp[i][S];
                    }
                }
                sysout.println(ans);
            } catch (NullPointerException e) {
                break;
            }
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