import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n+1];
        long[] b = new long[m+1];
        a[0] = 0;
        b[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = a[i-1] + sc.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            b[i] = b[i-1] + sc.nextInt();
        }
        int j = m, count = 0;
        for (int i = 0; i <= n; i++) {
            if (a[i] > k) {
                break;
            }
            while (b[j] > k - a[i]) {
                j--;
            }
            count = Math.max(count, i+j);
        }

        System.out.println(count);
    }
}