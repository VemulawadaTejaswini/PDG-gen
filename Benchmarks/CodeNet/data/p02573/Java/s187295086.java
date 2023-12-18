import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int n = sc.nextInt();
        int m = sc.nextInt();
        UF uf = new UF(n);
        for (int i = 0; i < m; i++) {
            uf.unite(sc.nextInt() - 1, sc.nextInt() - 1);
        }

        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            int p = uf.par[i];
            size[p]++;
        }
        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, size[i]);
        }

        System.out.println(max);


        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

class UF {

    int n;
    int[] par; // 親の要素の番号
    int[] rank; // 木の高さ

    public UF(int n) {
        this.n = n;
        par = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
        }

    }

    // 木の根を求める
    int find(int x) {
        if (par[x] == x) {
            return x;
        } else {
            return par[x] = find(par[x]);
        }
    }

    // xとyの属する集合を併合
    void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) return;

        if (rank[x] < rank[y]) {
            par[x] = y;
        } else {
            par[y] = x;
            if (rank[x] == rank[y]) rank[x]++;
        }
    }

    boolean same(int x, int y) {
        return find(x) == find(y);
    }
}
