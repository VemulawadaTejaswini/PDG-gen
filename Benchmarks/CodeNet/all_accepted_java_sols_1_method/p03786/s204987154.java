import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        long[] a = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        Arrays.parallelPrefix(a, Long::sum);

        int ans = 1;
        for (int i = n; i > 0; i--) {
            if (a[i] - a[i - 1] <= a[i - 1] * 2) {
                ans++;
            } else {
                break;
            }
        }

        System.out.println(ans);
    }
}