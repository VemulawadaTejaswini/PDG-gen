import java.util.*;
import java.lang.*;

public class Main {
    static final int INF = (1 << 31) - 1;             
    static final int MAXN = 111111; 
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n, q;
        n = input.nextInt();
        q = input.nextInt();        
        int[] it = new int[n * 5];
        for (int i = 0; i < n * 5; ++i) it[i] = (1 << 31) - 1;
        for (int i = 0; i < q; ++i) {
            int op = input.nextInt();
            if (op == 0) {
                int u, x;
                u = input.nextInt();
                x = input.nextInt();
                update(1, 0, n - 1, u, x, it);
            } else {
                int u, v;
                u = input.nextInt();
                v = input.nextInt();
                System.out.println(get(1, 0, n - 1, u, v, it));                
            }
        }
    }                  
    
    static void update(int seg, int lo, int hi, int x, int g, int[] it) {
        if (x < lo || x > hi) return;
        if (x == lo && hi == x) {            
            it[seg] = g;
            return;
        }
        int mid = (lo + hi) / 2;
        update(seg * 2, lo, mid, x, g, it);
        update(seg * 2 + 1, mid + 1, hi, x, g, it);
        it[seg] = Math.min(it[seg * 2], it[seg * 2 + 1]);
    }
    
    static int get(int seg, int lo, int hi, int u, int v, int[] it) {
        //System.out.println(lo + " " + hi + " " + u + " " + v);
        if (v < lo || hi < u) return INF;
        if (u <= lo && hi <= v) return it[seg];
        int mid = (lo + hi) / 2;
        int min1 = get(seg * 2, lo, mid, u, Math.min(v, mid), it);
        int min2 = get(seg * 2 + 1, mid + 1, hi, Math.max(u, mid + 1), v, it);
        return Math.min(min1, min2);
    }
}