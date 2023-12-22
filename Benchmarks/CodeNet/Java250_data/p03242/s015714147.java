
        import java.util.Comparator;
        import java.util.Scanner;


public class Main {
    Scanner sc = new Scanner(System.in);
    int n;
    public void run(){
        n = sc.nextInt();
        solve();
    }
    public void solve(){
        int ans = 0;

        int t = n % 10;
        n = n / 10;
        if(t == 9) t = 1;
        else t = 9;
        ans += t;

        t = n % 10;
        n = n / 10;
        if(t == 9) t = 1;
        else t = 9;
        ans += t * 10;

        t = n;
        if(t == 9) t = 1;
        else t = 9;
        ans += t * 100;

        System.out.println(ans);

    }

    public static void main(String[] args){
        new Main().run();
    }

    static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }
    static class Edge{
        int to, cost;
        public Edge(int a, int b){
            this.to = a;
            this.cost = b;
        }
    }
    class MyComparator implements Comparator {
        @Override
        public int compare (Object arg0, Object arg1) {
            int x = ((Pair)arg0).first;
            int y = ((Pair)arg1).first;

            if (x < y) {
                return 1;
            } else if (x > y) {
                return -1;
            } else{
                return 0;
            }
        }
    }
    static class UnionFind{
        int par[];
        int rank[];

        //n要素で初期化
        public UnionFind(int maxn){
            par = new int[maxn];
            rank = new int[maxn];

            for(int i = 0; i < maxn; i++){
                par[i] = i;
                rank[i] = 0;
            }
        }

        //木の根を求める
        int find(int x){
            if(par[x] == x){
                return x;
            }
            else {
                return par[x] = find(par[x]);
            }
        }

        // xとyの属する集合を併合
        void unite (int x, int y){
            x = find(x);
            y = find(y);
            if(x == y){
                return;
            }

            if(rank[x] < rank[y]){
                par[x] = y;
            }
            else{
                par[y] = x;
                if(rank[x] == rank[y]) rank[x]++;
            }
        }

        // xとyが同じ集合に属するか否か
        boolean same(int x, int y){
            return find(x) == find(y);
        }
    }

}