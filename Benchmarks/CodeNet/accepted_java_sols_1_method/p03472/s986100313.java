import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int aMax = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            aMax = Math.max(aMax, a[i]);
        }

        Arrays.sort(b);
        for (int i = n - 1; i >= 0 && h > 0 && b[i] > aMax; i--) {
            h -= b[i];
            ans++;
        }

        if (h > 0) ans += Math.ceil((double)h / aMax);

        System.out.println(ans);
    }
}