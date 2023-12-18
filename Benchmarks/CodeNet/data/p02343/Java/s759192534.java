import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        
        UnionFind uf = new UnionFind(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < q; i++){
            if(Integer.parseInt(sc.next()) == 0){
                uf.unite(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
            }else{
                if(uf.same(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()))){
                    sb.append(1).append(System.lineSeparator());
                }else{
                    sb.append(0).append(System.lineSeparator());
                }
            }
        }
        
        System.out.print(sb);
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
