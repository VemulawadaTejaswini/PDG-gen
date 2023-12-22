import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] a = new long[n][2];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextLong();
            a[i][1] = sc.nextLong();
        }
        Arrays.sort(a, (x, y) -> Long.compare(x[0], y[0]));
        for (int i = 0; i < n; i++) {
            if (a[i][1] < m) {
                ans += a[i][0] * a[i][1];
                m -= a[i][1];
            } else {
                ans += a[i][0] * m;
                break;
            }
        }
        System.out.println(ans);
    }
}
