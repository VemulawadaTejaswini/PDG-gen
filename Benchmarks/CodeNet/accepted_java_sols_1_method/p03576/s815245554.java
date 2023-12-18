import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        long[][] p = new long[n][2];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            p[i] = new long[]{x[i], y[i]};
        }
        Arrays.sort(x);
        Arrays.sort(y);
        Arrays.sort(p, (a,b)->Long.compare(a[0], b[0]));
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            long ty = p[i][1];
            for (int j = 0; j < n; j++) {
                if(0 < i) a[i][j] += a[i-1][j];
                if(0 < j) a[i][j] += a[i][j-1];
                if(0 < i && 0 < j) a[i][j] -= a[i-1][j-1];
                if(ty == y[j]) a[i][j]++;
            }
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i <= n-k; i++) {
            for (int j = 0; j <= n-k; j++) {
                for (int ii = k-1; ii < n-i; ii++) {
                    for (int jj = k-1; jj < n-j; jj++) {
                        int c = a[i+ii][j+jj];
                        if(0 < i) c -= a[i-1][j+jj];
                        if(0 < j) c -= a[i+ii][j-1];
                        if(0 < i && 0 < j) c += a[i-1][j-1];
                        if(c < k)continue;
                        long tmp = (x[i+ii] - x[i]) * (y[j+jj] - y[j]);
                        if(tmp < ans) ans = tmp;
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
