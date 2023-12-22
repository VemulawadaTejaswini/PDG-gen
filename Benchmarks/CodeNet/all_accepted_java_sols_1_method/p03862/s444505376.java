import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        long a[] = new long[n];
        long b[] = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }

        b = Arrays.copyOfRange(a, 0, n);

        if (a[0] > x) b[0] = x;

        for (int i = 0; i < n - 1; i++) {
            if (b[i] + b[i + 1] > x) {
                b[i + 1] -= (b[i] + b[i + 1]) - x;
            }
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i] - b[i];
        }

        System.out.println(ans);

    }
}