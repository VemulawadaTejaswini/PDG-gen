
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());
            a--;
            b--;
            uf.unite(a, b);
        }
        scan.close();

        int[] root = new int[n];
        for (int i = 0; i < n; i++) {
            root[uf.getRoot(i)]++;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, root[i]);
        }

        System.out.println(ans);
    }

    static class UnionFind {

        /** ルートノード */
        public int[] roots;

        /**
         * コンストラクタ.
         *
         * @param n ノード数
         */
        public UnionFind(int n) {
            roots = new int[n];
            for (int i = 0; i < n; i++) {
                roots[i] = i;
            }
        }

        /**
         * 各々のノードが属するグループを結合する.
         *
         * @param x
         * @param y
         */
        public void unite(int x, int y) {
            roots[getRoot(y)] = getRoot(x);
        }

        /**
         * 各々のノードが属するグループが同じかどうかを判定する.
         *
         * @param x
         * @param y
         * @return 同じグループに属するならtrue
         */
        public boolean same(int x, int y) {
            return getRoot(x) == getRoot(y);
        }

        /**
         * ルートノードを返す.<br>
         * 再帰によって経路圧縮を行っている.
         *
         * @param x
         * @return ルートノード
         */
        public int getRoot(int x) {
            int parent = roots[x];
            if (x != parent) {
                roots[x] = getRoot(parent);
            }
            return roots[x];
        }

    }

}
