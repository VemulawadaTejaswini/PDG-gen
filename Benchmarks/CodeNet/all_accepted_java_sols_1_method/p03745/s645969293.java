import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt(), ans = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        for (int i = 0; i < n; ans++) {
            int j = i, k = i;
            while (++j < n && a[j - 1] <= a[j]);
            while (++k < n && a[k - 1] >= a[k]);
            i = Math.max(j, k);
        }
        System.out.println(ans);
    }
}