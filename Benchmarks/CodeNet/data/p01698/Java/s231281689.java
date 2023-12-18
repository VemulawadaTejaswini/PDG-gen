import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

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
        WishUponAShootingStar solver = new WishUponAShootingStar();
        solver.solve(1, in, out);
        out.close();
    }

    static class WishUponAShootingStar {
        private static final double EPS = 1e-9;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            while (n != 0) {
                WishUponAShootingStar.Star[] stars = new WishUponAShootingStar.Star[n];
                for (int i = 0; i < n; i++) {
                    stars[i] = new WishUponAShootingStar.Star(
                            in.nextDouble(), in.nextDouble(),
                            in.nextDouble(), in.nextDouble(),
                            in.nextDouble(), in.nextDouble(),
                            in.nextDouble(), in.nextDouble()
                    );
                }

                List<WishUponAShootingStar.Collision> collisions = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < i; j++) {
                        WishUponAShootingStar.Star s1 = stars[i], s2 = stars[j];

                        double x = s1.x - s2.x, y = s1.y - s2.y, z = s1.z - s2.z;
                        double vx = s1.vx - s2.vx, vy = s1.vy - s2.vy, vz = s1.vz - s2.vz;
                        double r = s1.r + s2.r, vr = s1.vr + s2.vr;

                        double a = vx * vx + vy * vy + vz * vz - vr * vr;
                        double b = x * vx + y * vy + z * vz + r * vr;
                        double c = x * x + y * y + z * z - r * r;

                        double disapperAt = Double.NaN;
                        if (Math.abs(a) > EPS) {
                            double det = b * b - a * c;
                            if (det < -EPS) {
                                // No solution
                            } else if (det < EPS) {
                                // One solution
                                double t = -b / a;
                                if (EPS < t && t < Math.min(s1.disappearAt, s2.disappearAt) - EPS) {
                                    disapperAt = t;
                                }
                            } else {
                                // Two solutions
                                double sqrt = Math.sqrt(det);
                                double t0 = (-b - sqrt) / a, t1 = (-b + sqrt) / a;
                                if (EPS < t0 && t0 < Math.min(s1.disappearAt, s2.disappearAt) - EPS) {
                                    disapperAt = t0;
                                } else if (EPS < t1 && t1 < Math.min(s1.disappearAt, s2.disappearAt) - EPS) {
                                    disapperAt = t1;
                                }
                            }
                        } else if (Math.abs(b) > EPS) {
                            // One solution
                            double t = -c / (b * 2.0);
                            if (EPS < t && t < Math.min(s1.disappearAt, s2.disappearAt) - EPS) {
                                disapperAt = t;
                            }
                        }

                        if (!Double.isNaN(disapperAt)) {
                            collisions.add(new WishUponAShootingStar.Collision(i, j, disapperAt));
                        }
                    }
                }

                collisions.sort(Comparator.naturalOrder());
                int m = collisions.size();
                for (int i = 0; i < m; i++) {
                    WishUponAShootingStar.Collision col = collisions.get(i);
                    if (stars[col.i].disappered || stars[col.j].disappered) continue;
                    stars[col.i].disappered = true;
                    stars[col.j].disappered = true;
                    stars[col.i].disappearAt = col.t;
                    stars[col.j].disappearAt = col.t;
                }

                for (int i = 0; i < n; i++) {
                    out.println(dtos(stars[i].disappearAt));
                }

                n = in.nextInt();
            }
        }

        private static String dtos(double d) {
            StringBuilder sb = new StringBuilder();
            if (d < 0) {
                sb.append('-');
                d = -d;
            }
            d += Math.pow(10, -10) / 2;
            sb.append((long) d);
            d -= (long) d;
            sb.append('.');
            for (int i = 0; i < 10; i++) {
                d *= 10;
                sb.append((char) ('0' + (int) d));
                d -= (int) d;
            }
            return sb.toString();
        }

        private static class Star {
            double x;
            double y;
            double z;
            double vx;
            double vy;
            double vz;
            double r;
            double vr;
            double disappearAt;
            boolean disappered = false;

            public Star(double x, double y, double z, double vx, double vy, double vz, double r, double vr) {
                this.x = x;
                this.y = y;
                this.z = z;
                this.vx = vx;
                this.vy = vy;
                this.vz = vz;
                this.r = r;
                this.vr = vr;
                this.disappearAt = r / vr;
            }

        }

        private static class Collision implements Comparable<WishUponAShootingStar.Collision> {
            int i;
            int j;
            double t;

            public Collision(int i, int j, double t) {
                this.i = i;
                this.j = j;
                this.t = t;
            }

            public int compareTo(WishUponAShootingStar.Collision o) {
                return Double.compare(t, o.t);
            }

        }

    }
}


