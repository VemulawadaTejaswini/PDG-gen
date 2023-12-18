import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Long> base = new HashSet<>();
        for (int i = 0; i < n; i++) {
            HashSet<Long> next = new HashSet<>();
            long x = sc.nextInt();
            next.add(x);
            for (long y : base) {
                next.add(getLCD(x, y));
            }
            base.addAll(next);
        }
        System.out.println(base.size());
    }
    
    static long getLCD(long x, long y) {
        return x / getGCM(x, y) * y;
    }
    
    static long getGCM(long x, long y) {
        if (x % y == 0) {
            return y;
        } else {
            return getGCM(y, x % y);
        }
    }
}
