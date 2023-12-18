import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            long a = sc.nextLong();
            if (a == 0L) {
                System.out.println(0);
                return;
            }
            if (i == 0) {
                ans = a;
            } else {
                ans = ans * a;
            }
        }
        if (ans > 1000000000000000000L) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}