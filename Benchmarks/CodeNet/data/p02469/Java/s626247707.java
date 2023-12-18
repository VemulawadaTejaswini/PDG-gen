import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long base = sc.nextInt();
        for (int i = 1; i < n; i++) {
            base = getLCM(base, sc.nextInt());
        }
        System.out.println(base);
     }
     
    static long getLCM(long x, long y) {
        return x / getGCD(x, y) * y;
    }
    
    static long getGCD(long x, long y) {
        if (x % y == 0) {
            return y;
        } else {
            return getGCD(y, x % y);
        }
    }
}
