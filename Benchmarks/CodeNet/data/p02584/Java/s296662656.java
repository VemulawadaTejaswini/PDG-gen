import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static long readLong() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Long.parseLong(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        pw.println(solve());
        pw.close();
    }

    private static long solve() throws IOException {
        long OrigX = readLong();
        long K = readLong();
        long D = readLong();

        if (OrigX == 0) return D * (K % 2);

        return solve(Math.abs(OrigX), K, D);
    }

    private static long solve(long X, long K, long D) {
        if (X / D >= K) return (X - K * D);
            // Now X < D * K

        else {
            K -= X/D;
            X -= X / D * D;

            if ( K % 2 == 0) {
                return X;
            } else {
                return D - X;
            }
        }
    }
}
