import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        UnionFindTree uf = new UnionFindTree(n);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            uf.union(a, b);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, uf.getSize(i));
        }
        System.out.println(ans);
    }
}

class UnionFindTree {

    private int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納
    private int[] rank; //parentと同様に、木の高さを格納

    public UnionFindTree(int size) {
        this.parent = new int[size];
        this.rank = new int[size];
        for (int i = 0; i < size; i++) {
            init(i);
        }
    }

    public void init(int i) {
        parent[i] = i;
        rank[i] = 0; //集合の高さ
    }

    public void union(int x, int y) {
        int xRoot = getRoot(x);
        int yRoot = getRoot(y);

        // xが属する木の方が大きい場合
        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot; //yの親をxに更新
        } else if(rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (xRoot != yRoot){
            parent[yRoot] = xRoot;
            rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
        }
    }

    // 引数の属する木のルートのidを返す
    public int getRoot(int i) {
        if (i != parent[i]) {
            parent[i] = getRoot(parent[i]);
        }
        return parent[i];
    }

    // 同じ木に属しているか
    public boolean isSame(int x, int y) {
        return getRoot(x) == getRoot(y);
    }

    // 木に属しているノードのサイズ
    public int getSize(int i) {
        int size = 0;
        for (int p: parent) {
            if (p == i) {
                size++;
            }
        }
        return size;
    }
}
