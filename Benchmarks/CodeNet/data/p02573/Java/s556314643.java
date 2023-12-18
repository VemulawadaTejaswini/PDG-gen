import java.util.Arrays;
import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        class UnionFind {
            private int parents[];		//parents[x] == ノードxの親

            //コンストラクタ
            public UnionFind(int capacity) {
                parents = new int[capacity];
                Arrays.fill(parents, -1);
            }

            //xの根を返す
            public int findRoot(int x) {
                if(parents[x] < 0) return x;
                return parents[x] = findRoot(parents[x]);
            }

            public void unite(int x, int y) {
                x = findRoot(x);
                y = findRoot(y);
                if (x == y) return;

                if (parents[x] > parents[y])
                    swap(parents, x, y);
                parents[x] += parents[y];
                parents[y] = x;
            }

            public boolean same(int x, int y) {
                return findRoot(x) == findRoot(y);
            }

            public int getSize(int x) {
                return -parents[findRoot(x)];
            }

            private void swap(int[] a, int idx1, int idx2) {
                int tmp = a[idx1];
                a[idx1] = a[idx2]; a[idx2] = tmp;
            }
        }


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        UnionFind uf = new UnionFind(N);
        for(int i = 0; i < M; i++)
        	uf.unite(sc.nextInt() - 1, sc.nextInt() - 1);
        
        int ans = 0;
        for(int i = 0; i < N; i++)
        	ans = Math.max(ans, uf.getSize(i));
        
        System.out.println(ans);
    }

}