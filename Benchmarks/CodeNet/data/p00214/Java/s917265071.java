import java.awt.geom.Line2D;
import java.util.Arrays;
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
                Tetragon[] rs = new Tetragon[m];
                for (int i = 0; i < m; i++) {
                    P[] ps = new P[4];
                    for (int j = 0; j < 4; j++)
                        ps[j] = new P(sc.nextInt(), sc.nextInt());
                    rs[i] = new Tetragon(ps);
                }
                UnionFind uf = new UnionFind(m);
                for (int i = 0; i < m; i++) {
                    for (int j = i + 1; j < m; j++) {
                        if (rs[i].isTouch(rs[j]))
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

class P {
    int x;
    int y;

    P(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + " , " + y + ")";
    }

    public P add(P p) {
        return new P(p.x + x, p.y + y);
    }

    public P sub(P p) {
        return new P(x - p.x, y - p.y);
    }

    public P mul(int k) {
        return new P(k * x, k * y);
    }

    public double abs() {
        return Math.sqrt(x * x + y * y);
    }

    public int abs2() {
        return x * x + y * y;
    }

    public int det(P p) {
        return x * p.y - y * p.x;
    }

    public P rot90() {
        return new P(-y, x);
    }
}

class Tetragon {
    P ps[] = new P[4];
    Line2D.Double[] ls = new Line2D.Double[4];

    Tetragon(P qs[]) {
        for (int i = 0; i < 4; i++) {
            ps[i] = qs[i];
        }
        for (int i = 0; i < 4; i++) {
            ls[i] = new Line2D.Double(ps[i].x, ps[i].y, ps[(i + 1) % 4].x,
                    ps[(i + 1) % 4].y);
        }
    }

    boolean inTetragon(P g) {
        boolean right = true;
        boolean left = true;
        for (int i = 0; i < 4; i++) {
            int ep = g.sub(ps[i]).det(ps[(i + 1) % 4].sub(ps[i]));
            if (ep < 0)
                left = false;
            else if (ep > 0)
                right = false;
        }
        return right || left;
    }

    boolean isTouch(Tetragon t) {
        boolean touch = false;
        for (int i = 0; i < 4; i++) {
            if (t.inTetragon(ps[i]))
                touch = true;
            if (this.inTetragon(t.ps[i]))
                touch = true;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (ls[i].intersectsLine(t.ls[j]))
                    touch = true;
            }
        }
        return touch;
    }
}

class UnionFind {
    int par[];
    int rank[];

    UnionFind(int n) {
        par = new int[n];
        rank = new int[n];
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
        if (rank[y] > rank[x])
            par[x] = y;
        else {
            par[y] = x;
            if (rank[x] == rank[y])
                rank[x]++;
        }
    }

    boolean same(int x, int y) {
        return find(x) == find(y);
    }
}