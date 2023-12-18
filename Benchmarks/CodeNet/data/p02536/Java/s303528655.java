import java.io.PrintWriter;
import java.util.*;

public class Main {

    static Scanner sc;
    static PrintWriter out;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        new Main().solve();
        out.flush();
    }

    public void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        UF uf = new UF(n);
        for(int i=0; i<m; i++) {
            uf.join(sc.nextInt()-1, sc.nextInt()-1);
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            set.add(uf.root(i));
        }
        out.println(set.size() -1);

    }

    static class UF {
        int[] p;
        int n;
        UF(int n) {
            this.n = n;
            p = new int[n];
            for(int i=0; i<n; i++){
                p[i] = i;
            }
        }
        int root(int a) {
            if(p[a] == a) {
                return a;
            }
            int res =  root(p[a]);
            p[a] = res;
            return res;
        }
        void join(int a ,int b) {
            p[root(a)] = p[root(b)];
        }
    }

}