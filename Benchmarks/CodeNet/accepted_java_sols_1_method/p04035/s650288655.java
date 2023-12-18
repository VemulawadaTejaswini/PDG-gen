import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int ok = -1;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] + a[i] >= l) {
                ok = i;
            }
        }
        if (ok == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println("Possible");
            for (int i = 1; i < ok; i++) {
                System.out.println(i);
            }
            for (int i = n - 1; i > ok; i--) {
                System.out.println(i);
            }
            System.out.println(ok);
        }
    }
}