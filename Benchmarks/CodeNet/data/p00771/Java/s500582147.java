import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        AnchoredBalloon solver = new AnchoredBalloon();
        solver.solve(1, in, out);
        out.close();
    }

    static class AnchoredBalloon {
        private static final double EPS = 1e-5;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            int testcase = 0;
            while (n > 0) {
                AnchoredBalloon.Point[] points = new AnchoredBalloon.Point[n];
                double ans = 1e5;
                for (int i = 0; i < n; i++) {
                    points[i] = new AnchoredBalloon.Point(in.doubles(), in.doubles(), in.doubles());
                    ans = Math.min(ans, points[i].r);
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < i; j++) {
                        AnchoredBalloon.Point p1 = points[i], p2 = points[j];
                        double dp = Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2);
                        double d = Math.sqrt(Math.max(dp, 0));
                        double r1p = Math.pow(p1.r, 2), r2p = Math.pow(p2.r, 2);
                        if (r1p > dp + r2p + EPS || r2p > dp + r1p + EPS) {
                            continue;
                        }

                        double w1 = (dp + (p1.r * p1.r) - (p2.r * p2.r)) / (2 * d);
                        double hp = p1.r * p1.r - w1 * w1;
                        double h = Math.sqrt(Math.max(0, hp));
                        ans = Math.min(ans, h);
                    }
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < i; j++) {
                        outer:
                        for (int k = 0; k < j; k++) {
                            AnchoredBalloon.Point[] p = {points[i], points[j], points[k]};
                            double[] c = new double[3];
                            for (int l = 0; l < 3; l++) c[l] = p[l].r * p[l].r - p[l].x * p[l].x - p[l].y * p[l].y;
                            double det = (p[0].x - p[1].x) * (p[1].y - p[2].y) - (p[1].x - p[2].x) * (p[0].y - p[1].y);
                            double x = (p[1].y - p[2].y) * (c[1] - c[0]) + (p[1].y - p[0].y) * (c[2] - c[1]);
                            double y = (p[2].x - p[1].x) * (c[1] - c[0]) + (p[0].x - p[1].x) * (c[2] - c[1]);
                            if (Math.abs(det) < EPS) {
                                continue;
                            }

                            x /= 2 * det;
                            y /= 2 * det;
                            double hPow = Math.pow(p[0].r, 2) - Math.pow(x - p[0].x, 2) - Math.pow(y - p[0].y, 2);
                            if (hPow < -EPS) {
                                continue;
                            }

                            double[] oc = new double[3];
                            for (int l = 0; l < 3; l++) {
                                double x1 = p[(l + 1) % 3].x - p[l].x, x2 = x - p[l].x;
                                double y1 = p[(l + 1) % 3].y - p[l].y, y2 = y - p[l].y;
                                oc[l] = x1 * y2 - x2 * y1;
                            }
                            for (int l = 0; l < 3; l++) {
                                if (Math.abs(oc[l]) < EPS) {
                                    continue outer;
                                }
                            }
                            for (int l = 0; l < 2; l++) {
                                if ((oc[l] < -EPS) != (oc[l + 1] < -EPS)) {
                                    continue outer;
                                }
                            }

                            double h = Math.sqrt(Math.max(0, hPow));
                            ans = Math.min(ans, h);
                        }
                    }
                }

                out.ansln(ans);
                n = in.ints();
                testcase++;
            }
        }

        private static class Point {
            double x;
            double y;
            double r;

            public Point(double x, double y, double r) {
                this.x = x;
                this.y = y;
                this.r = r;
            }

            public String toString() {
                return "Point{" +
                        "x=" + x +
                        ", y=" + y +
                        ", r=" + r +
                        '}';
            }

        }

    }

    static class LightWriter implements AutoCloseable {
        private static final int DEFAULT_DOUBLE_ACC = 9;
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(double x, int n) {
            if (!breaked) {
                print(' ');
            }
            if (x < 0) {
                print('-');
                x = -x;
            }
            x += Math.pow(10, -n) / 2;
            print(Long.toString((long) x)).print('.');
            x -= (long) x;
            for (int i = 0; i < n; i++) {
                x *= 10;
                print((char) ('0' + ((int) x)));
                x -= (int) x;
            }
            return this;
        }

        public LightWriter ansln(int n, double... x) {
            for (double x1 : x) {
                ans(x1, n).ln();
            }
            return this;
        }

        public LightWriter ansln(double... x) {
            return ansln(DEFAULT_DOUBLE_ACC, x);
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public double doubles() {
            return Double.parseDouble(string());
        }

    }
}


