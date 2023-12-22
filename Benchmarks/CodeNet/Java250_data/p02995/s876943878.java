import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long C = Long.parseLong(sc.next());
        long D = Long.parseLong(sc.next());
        long bcac;
        long bdac;
        long bacd;
        if(A % C == 0) {
            bcac = B/C - A/C + 1;
        }else {
            bcac = B/C - A/C;
        }
        if(A % D == 0) {
            bdac = B/D - A/D + 1;
        }else {
            bdac = B/D - A/D;
        }
        if(A % (C*D/saiyaku(C,D)) == 0) {
            bacd = B/(C*D/saiyaku(C,D)) - A/(C*D/saiyaku(C,D)) + 1;
        }else {
            bacd = B/(C*D/saiyaku(C,D)) - A/(C*D/saiyaku(C,D));
        }
        long count = bcac + bdac - bacd;
        System.out.println(B-A-count+1);

    }
    
    public static long max(long x, long y) {
        if(x <= y) {
            return y;
        }else {
            return x;
        }
    }
    
    public static long saiyaku(long x, long y) {
        long w = 0;
        if(x < y) {
            w = x;
            x = y;
            y = w;
            return saiyaku(x, y);
        }
        w = y;
        y = x % y;
        x = w;
        if(y == 0) {
            return x;
        }else {
            
            return saiyaku(x, y);
        }
    }
    
    
}