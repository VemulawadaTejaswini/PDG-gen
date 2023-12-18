import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

import lib.io.ExtendedScanner;
import lib.io.Out;
import lib.util.Longs;

public class E {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        long[][] g = new long[r + 1][c + 1];
        for (int i = 0; i < k; i++) g[sc.nextInt()][sc.nextInt()] = sc.nextLong();
        long[][][] dp = new long[r + 1][c + 1][4];
        for (int i = 1; i <= r; i++) {
            for (int x = 1; x <= 3; x++) {
                for (int j = 1; j <= c; j++) {
                    dp[i][j][x] = Longs.max(dp[i][j - 1][x - 1] + g[i][j], dp[i][j - 1][x]);
                    if (x == 1) {
                        dp[i][j][x] = Longs.max(dp[i][j][x], g[i][j] + Longs.max(dp[i - 1][j][1], dp[i - 1][j][2], dp[i - 1][j][3]));
                    }
                }
            }
        }
        out.writeln(Longs.max(dp[r][c][1], dp[r][c][2], dp[r][c][3]));
    }
}
