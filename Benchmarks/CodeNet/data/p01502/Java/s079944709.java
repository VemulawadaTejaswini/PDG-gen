import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        SightseeingTour solver = new SightseeingTour();
        solver.solve(1, in, out);
        out.close();
    }

    static class SightseeingTour {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[][] C = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    C[i][j] = in.nextInt();
                }
            }
            int ans = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i; j < N; j++) {
                    ans += Math.min(C[i][j], C[j][i]);
                }
            }
            out.println(ans);
        }

    }
}