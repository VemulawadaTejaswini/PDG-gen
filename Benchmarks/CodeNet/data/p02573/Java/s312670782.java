import java.util.*;

public class Main{
    int[] parent;
    int[] size;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        parent = new int[n];
        size = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
            size[i] = 1;
        }
        for(int i = 0; i < m; i++){
            int a = scan.nextInt() - 1;
            int b = scan.nextInt() - 1;
            unite(a, b);
        }
        int out = -1;
        for(int i = 0; i < n; i++){
            out = Math.max(out, size[i]);
        }
        System.out.println(out);
    }
    
    int root(int x){
        if(parent[x] == x) return x;
        return parent[x] = root(parent[x]);
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
    
    public static void main(String[] args){
        new Main().solve();
    }
}
