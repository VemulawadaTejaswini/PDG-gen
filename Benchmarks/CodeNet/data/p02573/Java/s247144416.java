import java.util.*;

class UnionFindTree {

    int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納
    int[] rank; //parentと同様に、木の高さを格納
    int[] size;

    public UnionFindTree(int size) {
        this.parent = new int[size];
        this.rank = new int[size];
        this.size = new int[size];

        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    public void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0;
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;

        } else if(rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;

        } else if (xRoot != yRoot){
            parent[yRoot] = xRoot;
            rank[xRoot]++; 
        }
    }

    //引数の属する木のルートのidを返す
    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    //同じ木に属しているか
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }

    public int getMaxSize(){
        int ans=0;
        for(int i=0;i<parent.length;i++){
            size[parent[i]]++;
        }
        for(int i=0;i<size.length;i++){
            ans = Math.max(size[i],ans);
        }

        return ans;

    }
}

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        UnionFindTree uFT = new UnionFindTree(N);
        for(int i=0;i<M;i++){
            uFT.union(sc.nextInt()-1,sc.nextInt()-1);
        }
        System.out.println(uFT.getMaxSize());

    }

}


