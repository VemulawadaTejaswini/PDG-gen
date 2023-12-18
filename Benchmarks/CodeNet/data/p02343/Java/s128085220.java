import java.util.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;             
    static final int MAXN = 111111; 
    static int[] parentOf;
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n, q;
        n = input.nextInt();
        q = input.nextInt();
        parentOf = new int[n];
        for (int i = 0; i < n; ++i) parentOf[i] = -1;
        for (int i = 0; i < q; ++i) {
            int op = input.nextInt();
            int u, v;
            u = input.nextInt();
            v = input.nextInt();
            if (op == 0) {
                union(u, v);
            } else {
                if (rootOf(u) == rootOf(v)) System.out.println("1");
                else System.out.println("0");
            }
        }
    }                  
    
    static void union(int u, int v) {
        u = rootOf(u);
        v = rootOf(v);
        if (parentOf[u] < parentOf[v]) {
            parentOf[u] = v;
            --parentOf[v];
        } else {
            parentOf[v] = u;
            --parentOf[u];
        }
    }
    
    static int rootOf(int x) {
        if (parentOf[x] < 0) return x;
        parentOf[x] = rootOf(parentOf[x]);
        return parentOf[x];
    }
}