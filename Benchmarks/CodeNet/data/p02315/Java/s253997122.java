import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ZeroOneKnapsack solver = new ZeroOneKnapsack();
        solver.solve(1, in, out);
        out.close();
    }

    static class ZeroOneKnapsack {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int weightLimit = in.nextInt();
            Vec2i[] product = new Vec2i[n];
            int[][] dp = new int[n + 1][weightLimit + 1];

            for (int i = 0; i < n; i++) {
                product[i] = new Vec2i(in.nextInt(), in.nextInt());
                // (value, weight);
                Arrays.fill(dp[i], 0);
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= weightLimit; j++) {
                    if (j >= product[i].y) {
                        dp[i + 1][j] = Math.max(product[i].x + dp[i][j - product[i].y], dp[i][j]);
                    } else {
                        dp[i + 1][j] = dp[i][j];
                    }
                }
            }

            out.println(dp[n][weightLimit]);

        }

    }

    static class Vec2i {
        public int x;
        public int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "Vec2i{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
            return x == vec2i.x &&
                    y == vec2i.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

    }
}


