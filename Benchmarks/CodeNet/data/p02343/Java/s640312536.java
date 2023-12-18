import java.util.*;
import java.math.*;
public class Main {
    //
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        UnionFind un = new UnionFind(n);
        int q = sc.nextInt();
        for(int i = 0;i < q;i++){
            int com = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(com==0){
                un.union(x, y);
            }else{
                if(un.same(x,y)){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
        }
       
    }
    static class UnionFind {
        private int[] parent;
        private int[] rank;
        private int[] nodenum;
    
        /**
         * コンストラクタ
         * 
         * @param size ノード数
         */
        public UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];
            nodenum = new int[size];
            for (int i = 0; i < size; i++)
                makeSet(i);
        }
    
        /**
         * ノードの作成 作成されたノードは根となる 元サイズよりも大きいノードを指定した場合エラー
         * 
         * @param x :ノード
         */
        public void makeSet(int x) {
            parent[x] = x;
            rank[x] = 0;
            nodenum[x] = 1;
        }
    
        /**
         * x,yの属している木の結合 同じ木の場合はなにもしない
         * 
         * @param x :ノード1
         * @param y :ノード2
         */
        public void union(int x, int y) {
            final int xRoot = find(x);
            final int yRoot = find(y);
            if (rank[xRoot] > rank[yRoot]) {
                parent[yRoot] = xRoot;
                nodenum[xRoot] += nodenum[yRoot];
            } else if (rank[yRoot] > rank[xRoot]) {
                parent[xRoot] = yRoot;
                nodenum[yRoot] += nodenum[xRoot];
            } else if (xRoot != yRoot) {
                parent[yRoot] = xRoot;
                nodenum[xRoot] += nodenum[yRoot];
                rank[xRoot]++;
            }
        }
        /**
         * 属している木の根を返す
         * 検索したノードは経路圧縮が行われる
         * @param x : ノード
         * @return int :根のノード
         */
        public int find(int x){
            if(x != parent[x]){
                parent[x] = find(parent[x]);//直接根に繋ぐ（経路圧縮）
            }
            return parent[x];
        }
        /**
         * 同じ木に属しているかどうかを返す
         * 同じ根かどうかで判別する
         * @param x :node
         * @param y :node
         * @return boolean :true ->同じ木
         */
        public boolean same(int x,int y){
            return find(x)==find(y);
        }
    
        public int getnodenum(int x){
            return nodenum[find(x)];
        }
    }
}




