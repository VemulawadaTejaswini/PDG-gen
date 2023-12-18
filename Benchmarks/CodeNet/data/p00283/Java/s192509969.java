
import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {
    int INF = 1 << 28;
    int d, n;
    int[] a, e, r;
    void run() {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            d = sc.nextInt(); n = sc.nextInt();
            if ((d|n) == 0) break;
            
            a = new int[n]; e = new int[n]; r = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt(); e[i] = sc.nextInt(); r[i] = sc.nextInt();
            }
            
            mem = new int[110][110];
            for (int[] a : mem) fill(a, -1);
            
            int ret = solve(0, d);
            if (ret == INF) {
                System.out.println("NA");
            } else {
                System.out.println(ret);
            }
        }
    }
    
    int[][] mem;
    int solve(int exp, int hp) {
        if (hp < 0) return 0; 
        if (mem[exp][hp] > 0) return mem[exp][hp];
        
        int min = INF;
        for (int i = 0; i < n; i++) if (r[i] <= exp){
            min = min(min, solve(exp + e[i], hp - a[i]) + 1);
        }
        
        return mem[exp][hp] = min;
    }
    
    void debug(Object...os) {
        System.out.println(deepToString(os));
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
}