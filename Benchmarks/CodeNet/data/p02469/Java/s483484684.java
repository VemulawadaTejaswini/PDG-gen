import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long ans = a[0];
        for (int i = 1; i < n; i++) {
            ans = gcm(ans, a[i]);
        }

        System.out.println(ans);
    }

    private static long lcd(final long a, final long b) {
        if (b == 0) return a;
        return lcd(b, a % b);
    }

    private static long gcm(final long a, final long b) {
        return a / lcd(a, b) * b;
    }
}

