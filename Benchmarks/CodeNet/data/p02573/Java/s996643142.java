import java.util.*;

class UnionFind {
    int[] parent, size;

    public UnionFind(int n) {
        parent = new int[n];
        size = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }
    int root(int x){
        if(parent[x] == x){
            return x;
        }else{
            return parent[x] = root(parent[x]);
        }
    }
    void unite(int x, int y){
        x = root(x);
        y = root(y);
        if(x == y) return;

        if(size[x] < size[y]){
            parent[x] = y;
            size[y] += size[x];
        }else{
            parent[y] = x;
            size[x] += size[y];
        }
    }
    boolean same(int x, int y){
        return root(x) == root(y);
    }
}

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        UnionFind uF = new UnionFind(N);
        for(int i=0;i<M;i++){
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            uF.unite(A,B);
        }
        int ans = 0;
        for(int i = 0; i < N; i++){
            ans = Math.max(uF.size[i], ans);
        }
        System.out.println(ans);

    }

}


