import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();

        long min = Integer.MAX_VALUE;
        long lim = Math.min(r, l + 4038);
        for (long i = l; i <= lim; ++i) {
            for (long j = i + 1; j <= lim; ++j) {
//                System.out.println(String.format(">> %d, %d -- %d", i, j, (i * j) % 2019));
                long m = (i * j) % 2019L;
                if (min > m) {
                    min = m;
                }
            }
        }
        System.out.println(min);
    }
}
