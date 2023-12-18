import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[m];
        long[] asum = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (i == 0) {
                asum[i] += a[i];
            } else {
                asum[i] += asum[i - 1] + a[i];
            }
        }
        long[] bsum = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
            if (i == 0) {
                bsum[i] += b[i];
            } else {
                bsum[i] += bsum[i - 1] + b[i];
            }
        }
        int aend = 0;
        for (int i = 0; i < n; i++) {
            if (asum[i] > k) {
                break;
            }
            aend = i + 1;
        }
        int bend = 0;
        for (int i = 0; i < m; i++) {
            if (bsum[i] > k) {
                break;
            }
            bend = i + 1;
        }
        int ans = Math.max(aend, bend);
        int j = 0;
        for (int i = aend - 1; i >= 0; i--) {
            while (j < bend - 1 && asum[i] + bsum[j + 1] <= k) {
                j++;
            }
            if (j == bend - 1 && asum[i] + bsum[j] > k) {
                break;
            }
            if (asum[i] + bsum[j] <= k) {
                ans = Math.max(i + j + 2, ans);
            }
        }
        System.out.println(ans);
    }

}
