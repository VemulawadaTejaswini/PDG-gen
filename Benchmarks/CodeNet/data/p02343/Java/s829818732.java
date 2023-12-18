import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sets = scan.nextInt(), queries = scan.nextInt();
        UnionFind uf = new UnionFind(sets);
        for(int i = 0; i < queries; i++){
            if(scan.nextInt() == 0) uf.union(scan.nextInt(), scan.nextInt());
            else System.out.println(uf.same(scan.nextInt(), scan.nextInt()) ? 1 : 0);
        }
    }
}

class UnionFind{
    int ufarr[];
    UnionFind(int sets){
        ufarr = new int[sets];
        for(int i = 0; i < sets; i++) ufarr[i] = i;
    }

    int find(int x){
        while(ufarr[x] != x) x = ufarr[x];
        return x;
    }

    int union(int x, int y){
        int x_ = find(x), y_ = find(y);
        if(x_ != y_){
            ufarr[x_] = y_;
            return 0;
        }
        return 1;
    }

    boolean same(int x, int y){
        return find(x) == find(y);
    }
}