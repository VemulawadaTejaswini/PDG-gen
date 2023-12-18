import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Long[] a = new Long[n];
        Long limit = (long)Math.pow(10,18);

        if (n > 100000 | n < 2) {
            System.exit(0);
        }

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
            if (a[i] > limit) {
                System.exit(0);
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                a[i] = a[i] * a[i-1];
            }
        }

        if (a[n-1] <= limit) {
            System.out.print(a[n - 1]);
        } else {
            System.out.print(-1);
        }
    }
}
