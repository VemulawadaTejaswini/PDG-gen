import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final long[] a = new long[n];
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0L) {
                System.out.println(0);
                return;
            }
            if (i == 0) {
                ans = a[i];

            } else {
                ans = ans * a[i];
            }
        }
        if (ans > 1000000000000000000L) {
            System.out.println(-1);
            return;
        }
        System.out.println(ans);
    }
}