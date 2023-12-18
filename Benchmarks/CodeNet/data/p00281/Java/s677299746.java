
import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {
    int INF = 1 << 28;
    E[] G;
    
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        E[] G = new E[(int)n];
        for (int i = 0; i < n; i++) G[i] = new E();
        for (;;) {
            long s = sc.nextInt(), t = sc.nextInt(), e = sc.nextInt();
            if ((s|t|e) == 0) break;
            s--; t--;
            G[(int)s].add(new P((int)t, e));
        }
        
        int l = sc.nextInt();
        long[] b = new long[m];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) b[j] = sc.nextInt();
            for (int k = 0; k < n; k++) {
                int sum = 0;
                for (P p : G[k]) sum += b[p.t] * p.c;
                System.out.print(sum + (k == n - 1 ? "\n" : " "));
            }
        }
    }
    
    class E extends ArrayList<P>{}
    
    class P {
        int t;
        long c;
        P(int t, long c) {
            this.t = t;
            this.c = c;
        }
    }
    
    void debug(Object...os) {
        System.out.println(deepToString(os));
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
}