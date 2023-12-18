
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();


        for (long x = 0; x <= n; ++x) {
            long tmpx = x * 10000L;
            if (tmpx > m) {
                break;
            }
            for (long y = 0; y <= n - x; ++y) {
                long tmpy = tmpx + y * 5000L;
                if (tmpy > m) {
                    break;
                }
                for (long z = 0; z <= n - x - y; ++z) {
                    long tmpz = tmpy + z * 1000L;
                    if (tmpz > m) {
                        break;
                    }
                    if (tmpz == m && x + y + z == n) {
                        System.out.println(String.format("%d %d %d", x, y, z));
                        return;
                    }
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
