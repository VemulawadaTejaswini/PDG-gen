import java.util.*;
import java.lang.*;

public class Main {
    static final int INF = (1 << 31) - 1;             
    static final int MAXN = 11111;     
    static int a1, b1, c1;
    static int a2, b2, c2;
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int x0, y0, x1, y1, x2, y2, x3, y3;
        for (int i = 0; i < q; ++i) {
            x0 = input.nextInt();
            y0 = input.nextInt();
            x1 = input.nextInt();
            y1 = input.nextInt();
            x2 = input.nextInt();
            y2 = input.nextInt();
            x3 = input.nextInt();
            y3 = input.nextInt();            
            a1 = y0 - y1;
            b1 = x1 - x0;
            c1 = - a1 * x0 - b1 * y0;
            a2 = y2 - y3;
            b2 = x3 - x2;
            c2 = - a2 * x2 - b2 * y2;
            if (check1(x2, y2, x3, y3) && check2(x0, y0, x1, y1)) System.out.println("1");
            else System.out.println("0");
            
        }
    }             
    
    static boolean check1(int x1, int y1, int x2, int y2) {
        int d1 = a1 * x1 + b1 * y1 + c1;
        int d2 = a1 * x2 + b1 * y2 + c1;
        return d1 * d2 <= 0 && d1 * d1 + d2 * d2 != 0;
    }
    
    static boolean check2(int x1, int y1, int x2, int y2) {
        int d1 = a2 * x1 + b2 * y1 + c2;
        int d2 = a2 * x2 + b2 * y2 + c2;
        return d1 * d2 <= 0 && d1 * d1 + d2 * d2 != 0;
    }
}