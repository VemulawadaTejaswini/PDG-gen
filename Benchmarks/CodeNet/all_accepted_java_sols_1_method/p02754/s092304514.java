import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        
        if (a == 0) {
            System.out.println(a);
            return;
        }
        if (n - (a + b) >= 0) {
            // 数える数がボール投入数より多い場合
            long c = n / (a + b);
            long d = n % (a + b);
            if (d - a > 0) {
                System.out.println((c * a) + a);
            } else {
                System.out.println((c * a) + d);
            }
        } else {
            // 数える数がボール投入数より少ない場合
            if (n - a >= 0) {
                System.out.println(a);
            } else {
                System.out.println(n);
            }

        }
        sc.close();
    }
}
