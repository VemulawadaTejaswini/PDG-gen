import java.awt.geom.Rectangle2D;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    final double pi = (1 << 2)
            * (Math.cbrt(1. / 0.015625) * Math.atan(0.2) - Math.atan(1. / 239));
    final double EPS = 1.0e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            while (n != 0) {
                int m = sc.nextInt();
                Rectangle2D.Double[] rs = new Rectangle2D.Double[m];
                for (int i = 0; i < m; i++) {
                    double xa = sc.nextInt() - EPS;
                    double ya = sc.nextInt() - EPS;
                    double xb = sc.nextInt() - EPS;
                    double yb = sc.nextInt() + EPS;
                    double xc = sc.nextInt() + EPS;
                    double yc = sc.nextInt() + EPS;
                    double xd = sc.nextInt() + EPS;
                    double yd = sc.nextInt() - EPS;
                    rs[i] = new Rectangle2D.Double(xa, ya, xd - xa, yb - ya);
                }
                UnionFind uf = new UnionFind(m);
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        if (rs[i].intersects(rs[j]))
                            uf.unite(i, j);
                    }
                }
                Set<Integer> set = new HashSet<Integer>();
                for (int i = 0; i < m; i++) {
                    set.add(uf.par[i]);
                }
                System.out.println(set.size());
                n--;
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

class UnionFind {
    int par[];

    UnionFind(int n) {
        par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    int find(int x) {
        if (x == par[x])
            return x;
        else
            return par[x] = find(par[x]);
    }

    void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y)
            return;
        par[x] = y;
    }

    boolean same(int x, int y) {
        return find(x) == find(y);
    }
}