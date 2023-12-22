import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[m];

        long[] aruiseki = new long[n];
        long[] bruiseki = new long[m];
        int aMaxIndex = - 1;
        int bMaxIndex = - 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            aruiseki[i] = a[i];
            if (i > 0) {
                aruiseki[i] += aruiseki[i - 1];
            }
            if (aruiseki[i] <= k) {
                aMaxIndex = i;
            }
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            bruiseki[i] = b[i];
            if (i > 0) {
                bruiseki[i] += bruiseki[i - 1];
            }
            if (bruiseki[i] <= k) {
                bMaxIndex = i;
            }
        }

        if (aMaxIndex == - 1) {
            System.out.println(bMaxIndex + 1);
            return;
        }
        int lastIndex = m - 1;
        int ans = aMaxIndex + 1;
        parent: for (int i = 0; i <= aMaxIndex; i++) {
            long nokori = k - aruiseki[i];
            for (int j = lastIndex; j >= 0; j--) {
                if (bruiseki[j] <= nokori) {
                    lastIndex = j;
                    ans = Math.max(ans, i + j + 2);
                    continue parent;
                }
            }
            ans = Math.max(i + 1, ans);
        }
        System.out.println(Math.max(ans, bMaxIndex + 1));
    }
}