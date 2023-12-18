import java.util.*;
import java.lang.*;

public class Main {
    static final int INF = (1 << 31) - 1;             
    static final int MAXN = 11111;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int x0, y0, x1, y1, x2, y2;
        int q;
        x0 = input.nextInt();
        y0 = input.nextInt();
        x1 = input.nextInt();
        y1 = input.nextInt();        
        q = input.nextInt();
        for (int i = 0; i < q; ++i) {
            x2 = input.nextInt();
            y2 = input.nextInt();
            int d = ccw(x1 - x0, y1 - y0, x2 - x1, y2 - y1);
            if (d > 0) System.out.println("COUNTER_CLOCKWISE");
            else if (d < 0) System.out.println("CLOCKWISE");            
            else {
                int a2, b2, a1, b1;
                a1 = x1 - x0;
                b1 = y1 - y0;
                a2 = x2 - x0;
                b2 = y2 - y0;
                if (a1 * a2 <= 0 && b1 * b2 <= 0 && (a1 * a1 + b1 * b1 != 0 && a2 * a2 + b2 * b2 != 0)) System.out.println("ONLINE_BACK");
                else if (Math.hypot(a1, b1) < Math.hypot(a2, b2)) System.out.println("ONLINE_FRONT");                                    
                else System.out.println("ON_SEGMENT");
            }                    
        }
    }
    
    static int ccw(int a0, int b0, int a1, int b1) {
        int d = a0 * b1 - a1 * b0;
        return d;
    }
}