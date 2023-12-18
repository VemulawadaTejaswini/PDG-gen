import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), q = in.nextInt();
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < q; i++) {
            int cmd = in.nextInt(),
                    x = in.nextInt(),
                    y = in.nextInt();
            if (cmd == 0) {
                unionFind.union(x, y);
            }else {
                System.out.println(unionFind.same(x, y) ? 1 : 0);
            }
        }
    }
}

class UnionFind {
    int[] parent;
    int[] depth;

    UnionFind(int n) {
        parent = new int[n];
        depth = new int[n];
        Arrays.fill(parent, -1);
    }

    private int root(int p) {
        while (parent[p] != -1) {
            p = parent[p];
        }
        return p;
    }

    void union(int p, int q) {
        int rp = root(p), rq = root(q);

        if (rp == rq) {
            return;
        }

        if (depth[rp] >= depth[rq]) {
            parent[rq] = rp;
            depth[rp] = Math.max(depth[rp], depth[rq] + 1);
        } else {
            parent[rp] = rq;
//            depth[rq] = Math.max(depth[rq], depth[rp] + 1);
        }
    }

    boolean same(int p, int q) {
        return root(p) == root(q);

    }
}
