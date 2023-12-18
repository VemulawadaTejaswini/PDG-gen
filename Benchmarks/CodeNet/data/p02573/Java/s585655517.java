import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] ai;
    static int[] bi;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        ABC177DUnionFind unionFind = new ABC177DUnionFind(n);
        ai = new int[m + 1];
        bi = new int[m + 1];
        int[] directFriendCount = new int[n+1];
        for (int i = 1; i <= m; i++) {
            ai[i] = in.nextInt();
            bi[i] = in.nextInt();
            unionFind.unite(ai[i], bi[i]);
            directFriendCount[ai[i]]++;
            directFriendCount[bi[i]]++;
        }
        
        int[] groupSizes = new int[n+1];
        for(int i=1; i<=n; i++) {
            groupSizes[unionFind.root(i)]++;
        }
        int maxGroupSize = 1;
        for(int i=1; i<=n; i++) {
            maxGroupSize = Math.max(maxGroupSize, groupSizes[i]);
        }
        System.out.println(maxGroupSize);
    }
}
class ABC177DUnionFind {
    private int[] parent;
    public ABC177DUnionFind(int n) {
        this.parent = new int[n+1];
        for(int i=1; i<=n; i++) {
            this.parent[i] = i; // みんな、自分がroot
        }
    }
    public int root(int a) {
        if(this.parent[a] == a) {
            return a;
        }
        this.parent[a] = this.root(this.parent[a]);
        return this.parent[a];
    }
    public void unite(int a, int b) {
        int rootA = this.root(a);
        int rootB = this.root(b);
        if(rootA == rootB) {
            return;
        }
        this.parent[rootA] = rootB;
    }
    public boolean isInSameGroup(int a, int b) {
        return this.root(a) == this.root(b);
    }
}