import java.util.*;

public class Main {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        long a[] = new long[n+1];
        long b[] = new long[m+1];
        long asum[] = new long[n+1];
        long bsum[] = new long[m+1];

        for (int i=1; i<=n; i++) {
            a[i] = scan.nextLong();

            asum[i] = asum[i-1] + a[i];
        }
        for (int i = 1; i<=m; i++) {
            b[i] = scan.nextLong();

            bsum[i] = bsum[i-1] + b[i];
        }

        int sum = 0;
        int j = m;

        for (int i=0; i<=n; i++) {

            if (a[i] > k) {
                continue;
            }

            while (b[j] > k - a[i]) {
                j--;
            }
            sum = Math.max(sum, i + j);
        }

        System.out.println(sum);

    }
}
