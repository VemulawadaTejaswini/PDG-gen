import java.util.*;

public class Main{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int Q = scan.nextInt();

    UF uf = new UF(N);
    
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<Q;i++) {
        int t = scan.nextInt();
        int u = scan.nextInt();
        int v = scan.nextInt();
        if (t == 0) {
            uf.unite(u,v);
        } else {
            int ret = uf.same(u,v) ? 1 : 0;
            sb.append(String.valueOf(ret) + "\n");
        }
    }
    scan.close();

    System.out.print(sb);
}

    private static class UF {
        int []par;
        private UF(int n) {
            par = new int[n];
            for(int i=0;i<n;i++) {  
                par[i] = i;
            }
        }
        public boolean same(int i, int j) {
            int ri = root(i); 
            int rj = root(j); 
            return ri == rj;
        }

        public void unite(int i, int j) {
            int ri = root(i);
            int rj = root(j);
            if (ri == rj) return;
            par[ri] = rj;
        }
        public int root(int x) {
            if (par[x] == x) return x;
            return par[x] = root(par[x]);
        }
    }
}
