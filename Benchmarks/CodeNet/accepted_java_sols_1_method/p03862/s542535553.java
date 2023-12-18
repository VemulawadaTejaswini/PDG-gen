import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        long a[] = new long[n];
        long s[] = new long[n - 1];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }

        for (int i = 0; i < n - 1; i++) {
            s[i] = a[i] + a[i + 1];
        }

        long count = 0;
        for (int i = 0; i < n - 2; i++) {
            if (s[i] > x && s[i + 1] > x) {
                long sub = Math.min(a[i + 1], Math.min(s[i] - x, s[i + 1] - x));
                s[i] -= sub;
                s[i + 1] -= sub;
                count += sub;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (s[i] > x) {
                count += s[i] - x;
            }
        }

        System.out.println(count);

    }
}