import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt(), ans = 1;
        long[] a = new long[n + 1];
        for (int i = 1; i <= n; i++)
            a[i] = scanner.nextInt();
        Arrays.sort(a);
        Arrays.parallelPrefix(a, Long::sum);
        while (--n > 0 && a[n + 1] - a[n] <= a[n] * 2)
            ans++;
        System.out.println(ans);
    }
}