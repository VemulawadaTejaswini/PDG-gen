import java.util.*;
public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        UnionFind uf = new UnionFind(n);
        for(int i=0; i<m; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            uf.unite(a,b);
        }
        
        System.out.println(uf.groupCount() - 1);
    }
}

class UnionFind{
    int n;
    int[] par;
    int[] size;
    
    public UnionFind(int n){
        this.n = n;
        par = new int[n];
        for(int i=0; i<n; i++){
            par[i] = i;
        }
        size = new int[n];
        Arrays.fill(size, 1);
    }
    
    public int find(int x){
        if(par[x] == x){
            return x;
        }else{
            par[x] = find(par[x]);
            return par[x];
        }
    }
    
    public boolean unite(int x, int y){
        x = find(x);
        y = find(y);
        if(x==y) return false;
        
        if(size[x]<size[y]){
            int tmp = x;
            x = y;
            y = tmp;
        }
        size[x] += size[y];
        par[y] = x;
        return true;
    }
    
    public boolean same(int x, int y){
        return find(x)==find(y);
    }
    
    public int size(int x){
        return size[find(x)];
    }
    
    public int groupCount(){
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<n; i++){
            s.add(this.find(i));
        }
        return s.size();
    }
}
