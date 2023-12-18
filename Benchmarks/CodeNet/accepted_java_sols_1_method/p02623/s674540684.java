import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextInt();
        long[] a = new long[n + 1];
        for (int i = 0; i < n; i++) {
            a[i + 1] = a[i] + sc.nextLong();
        }
        long[] b = new long[m + 1];
        for (int i = 0; i < m; i++) {
            b[i + 1] = b[i] + sc.nextLong();
        }

        int best = m;
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > k) {
                break;
            }
            while (b[best] > k - a[i]) {
                best--;
            }
            res = Math.max(res, i + best);
        }
        
        System.out.println(res);

        sc.close();
    }
}