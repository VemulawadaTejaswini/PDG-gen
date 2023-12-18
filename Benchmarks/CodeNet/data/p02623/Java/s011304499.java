
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(); long k = sc.nextLong();
        int[] a = new int[n];
        long[] pa = new long[n+1];
        int[] b = new int[m];
        long[] pb = new long[m+1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            pa[i] = pa[i-1] + a[i-1];
        }
        for (int i = 1; i <= m; i++) {
            pb[i] = pb[i-1] + b[i-1];
        }
        int lo = 0, hi = n + m, bans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            boolean can = false;
            for (int ba = 0; ba <= Math.min(n, mid); ba++) {
                if (mid - ba <= m && pa[ba] + pb[mid - ba] <= k) {
                    can = true;
                    break;
                }
            }
            if (can) {
                bans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        System.out.println(bans);

    }
}
