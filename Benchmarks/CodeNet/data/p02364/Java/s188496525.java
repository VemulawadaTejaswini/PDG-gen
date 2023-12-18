import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        Edge[] edges = new Edge[E];
        for(int i = 0; i < E; i++){
            edges[i] = new Edge(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
        
        System.out.println(kruskal(V, edges));
    }
    
    static int kruskal(int V, Edge[] edges){
        
        Arrays.sort(edges);
        UnionFind uf = new UnionFind(V);
        int totalCost = 0;
        for (Edge e : edges) {
            if (!uf.same(e.s, e.t)) {
                uf.unite(e.s, e.t);
                totalCost += e.w;
            }
        }
        return totalCost;
    }
    
    static class Edge implements Comparable<Edge>{
        int s;
        int t;
        int w;
        
        public Edge(int s, int t, int w) {
            this.s = s;
            this.t = t;
            this.w = w;
        }
        
        @Override
        public int compareTo(Edge e) {
            return this.w - e.w;
        }
    }
    
    static class UnionFind {
        int[] parent;
        int[] rank;
        
        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for(int i = 0; i < n; i++){
                parent[i] = i;
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

            if(rank[x] < rank[y]){
                parent[x] = y;
            }else{
                parent[y] = x;
                if(rank[x] == rank[y]){
                    rank[x]++;
                }
            }
        }
        boolean same(int x, int y){
            return root(x) == root(y);
        }
    }
}
