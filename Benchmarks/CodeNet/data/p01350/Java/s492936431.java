import java.util.*;
import java.util.function.Function;


public class Main {
    Scanner sc = new Scanner(System.in);

    double function(final double y, double a, final double dx) {
        double nx = a + dx;
        if (Math.abs(Math.floor(a) - Math.floor(nx)) < 1e-6) {
            double sx1 = Math.floor(a);
            double sx2 = sx1 + 1;
            double rx1 = Math.floor(nx);
            double rx2 = rx1 + 1;
            double dist = Math.min(a - sx1 + nx - rx1, sx2 - a + rx2 - nx);
            return y + dist;
        } else {
            return y + nx - a;
        }
    }

    static class Point {
        int x, y;

        Point(int a, int b) {
            x = a;
            y = b;
        }

        static Point p(int x, int y) {
            return new Point(x, y);
        }
    }

    double kaku(Point p1, Point p2, Point p3) {
        int dx1 = p2.x - p1.x;
        int dy1 = p2.y - p1.y;
        int dx2 = p3.x - p2.x;
        int dy2 = p3.y - p2.y;

        int naiseki = dx1 * dx2 + dy1 * dy2;
        double z1 = Math.sqrt(dx1 * dx1 + dy1 * dy1);
        double z2 = Math.sqrt(dx2 * dx2 + dy2 * dy2);

        return Math.acos(naiseki / (z1 * z2)) * 180 / Math.PI;
    }

    double dist(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    class Node {
        int now;
        int prev;
        int done;
        double[] map = new double[20];
        int[] cnt = new int[20];
        int flag;
    }

    void run() {
        int n = ni();
        double r = sc.nextDouble();
        double theta = sc.nextDouble();
        Point[] p = new Point[n];
        for (int i = 0; i < n; ++i) {
            int x = ni();
            int y = ni();
            p[i] = new Point(x, y);
        }
        Node atom = new Node();
        atom.cnt[0] = 0;
        atom.map[0] = 0;
        atom.now = 0;
        atom.prev = -1;
        atom.done = 1;
        atom.flag = 0;
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingDouble(a -> a.map[a.now]));
        queue.add(atom);
        int max = 0;
        boolean[][][][] done = new boolean[2][n][n + 1][1 << n];
        while (queue.size() > 0) {
            Node node = queue.poll();
            if (done[node.flag][node.now][node.prev + 1][node.done]) {
                continue;
            }
            done[node.flag][node.now][node.prev + 1][node.done] = true;
            max = Math.max(max, node.cnt[node.now]);
            for (int i = 0; i < n; ++i) {
                if (node.now == i) {
                    continue;
                }
                if (node.prev == -1 || kaku(p[node.prev], p[node.now], p[i]) <= theta + 1e-3) {
                    if (node.flag == 0 && ((node.done >> i) & 1) == 1) {
                        // loop
                        int tugi = node.cnt[node.now] + 1;
                        int mae = node.cnt[i];
                        int diff = tugi - mae;
                        double loop = node.map[node.now] + dist(p[node.now], p[i]) - node.map[i];
                        double nokori = r - (node.map[node.now] + dist(p[node.now], p[i]));
                        int cnt = (int) (nokori / loop);
                        Node next = new Node();
                        next.now = i;
                        next.done = 1 << i;
                        next.cnt[i] = node.cnt[node.now] + 1 + cnt * diff;
                        next.map[i] = node.map[node.now] + dist(p[node.now], p[i]) + cnt * loop;
                        next.prev = node.now;
                        next.flag = 1;
                        queue.add(next);
                    } else {
                        Node next = new Node();
                        next.now = i;
                        System.arraycopy(node.cnt, 0, next.cnt, 0, 20);
                        System.arraycopy(node.map, 0, next.map, 0, 20);
                        next.cnt[i] = node.cnt[node.now] + 1;
                        next.map[i] = node.map[node.now] + dist(p[node.now], p[i]);
                        if (next.map[i] > r) {
                            continue;
                        }
                        next.prev = node.now;
                        next.done |= node.done | 1 << i;
                        next.flag = node.flag;
                        queue.add(next);
                    }
                }
            }
        }
        System.out.println(max);
    }

    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    double goldenSectionSearch(double left, double right, Function<Double, Double> f, Comparator<Double> comp) {
        double c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
        double c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
        double d1 = f.apply(c1);
        double d2 = f.apply(c2);
        for (int i = 0; i < 10000000; ++i) {
            if (comp.compare(d1, d2) > 0) {
                right = c2;
                c2 = c1;
                d2 = d1;
                c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
                d1 = f.apply(c1);
            } else {
                left = c1;
                c1 = c2;
                d1 = d2;
                c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
                d2 = f.apply(c2);
            }
        }
        return left;
    }

    double divideInternally(double a, double b, double m, double n) {
        return (n * a + m * b) / (m + n);
    }

    int ni() {
        return sc.nextInt();
    }

    static public void main(String[] args) {
        new Main().run();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }
}