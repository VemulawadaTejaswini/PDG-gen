import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, q;
        int com, x, y;
        UnionFind uf;

        n = sc.nextInt();
        q = sc.nextInt();

        uf = new UnionFind(n);

        for (int i = 0; i < q; i++) {
            com = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            if (com == 0) {
                uf.unite(x, y);
            }
            else {
                if (uf.isSameGroup(x, y)) {
                    System.out.println('1');
                }
                else {
                    System.out.println('0');
                }
            }
        }
    }
}

/**
 * 素集合データ構造.<br>
 * 各操作O(a(n))程度(a() はアッカーマン関数の逆関数)
 * @see <a href="https://abc097.contest.atcoder.jp/submissions/5437889">検証</a>
 */
class UnionFind {

    /**
     * 添字の示すノードの親.<br>
     * 親がない = 自身が根のとき、-1 * (集合の大きさ)をもつ
     */
    int[] parent;

    /**
     * 木の大きさ.<br>
     * あまり速くならなかった<br>
     * 計算量は O(log n) から O(a(n))くらいまで落ちるはずなのに
     */
    int[] rank;

    /** nmemb個の要素からなる UnionFind */
    public UnionFind(int nmemb) {
        parent = new int[nmemb];
        rank = new int[nmemb];
        
        Arrays.fill(parent, -1);
        Arrays.fill(rank, 0);
    }

    /**
     * 根を求める
     * @param x 根を求めるノードの番号
     */
    protected int root(int x) {
        if (parent[x] < 0) {
            return x;
        }
        
        parent[x] = root(parent[x]);
        return parent[x];
    }

    /** ノードx, yが同じ集合であるかを確かめる */
    public boolean isSameGroup(int x, int y) {
        return root(x) == root(y);
    }

    /**
     * ノードx, y を併合.
     * x, yがすでに同じ集合にあるときは何もしない
     */
    public void unite(int x, int y) {

        x = root(x);
        y = root(y);

        if (x == y) {
            return;
        }

        //小さい木を大きい方へマージ(木の高さを抑えられるので)
        if (rank[x] > rank[y]) {
            parent[x] += parent[y];
            parent[y] = x;
        }
        else {
            parent[y] += parent[x];
            parent[x] = y;

            if (rank[x] == rank[y]) {
                rank[y]++;
            }
        }
        
        return;
    }

    /** グループの大きさ(=要素数)を調べる */
    public int groupSize(int x) {
        return -1 * parent[root(x)];
    }
}

