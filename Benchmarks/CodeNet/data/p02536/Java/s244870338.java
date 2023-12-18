import java.util.*;

public class Main{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    UF uf = new UF(N);
    for(int i=0;i<M;i++) {
        int a = scan.nextInt() - 1;
        int b = scan.nextInt() - 1;
        uf.unite(a, b);
    }

    scan.close();

    HashSet<Integer> st = new HashSet<>();
    for ( int i=0;i<N;i++) {
        st.add(uf.root(i));
    }
    
    System.out.println((st.size() - 1));
}

    static class UF {
        static int[] par;
        UF(int n) {
            par = new int[n];
            for (int i=0;i<n;i++) {
                par[i] = i;
            }
        }
        int root(int x) {
            if (par[x] == x) return x;
            return par[x] = root(par[x]);
        }
        void unite(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx == ry) return;
            par[rx] = ry;
        }

        boolean same(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            return rx == ry;
        }
    }
}
