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
        KotoDistance solver = new KotoDistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class KotoDistance {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int W = in.nextInt();
            int H = in.nextInt();
            int[] wimos = new int[W + 10];
            int[] himos = new int[H + 10];
            for (int i = 0; i < N; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int w = in.nextInt();
                wimos[Math.max(0, x - w)]++;
                wimos[Math.min(W, x + w)]--;
                himos[Math.max(0, y - w)]++;
                himos[Math.min(H, y + w)]--;
            }
            for (int i = 1; i <= W + 1; i++) {
                wimos[i] += wimos[i - 1];
            }
            for (int i = 1; i <= H + 1; i++) {
                himos[i] += himos[i - 1];
            }
            boolean wng = false;
            for (int i = 0; i < W; i++) {
                wng |= (wimos[i] == 0);
            }
            boolean hng = false;
            for (int i = 0; i < H; i++) {
                hng |= (himos[i] == 0);
            }
            out.println((hng && wng ? "No" : "Yes"));
        }

    }
}