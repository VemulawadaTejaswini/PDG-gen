import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] da = new int[n];
        int[] db = new int[m];
        for (int i = 0; i < n; i++) {
            da[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            db[i] = scanner.nextInt();
        }
        long[] sa = new long[n + 1];
        long[] sb = new long[m + 1];
        for (int i = 1; i <= n; i++) {
            sa[i] = sa[i - 1] + da[i - 1];
        }
        for (int i = 1; i <= m; i++) {
            sb[i] = sb[i - 1] + db[i - 1];
        }
        int i = 0, j = m;
        int ans = 0;
        for (; i <= n; i++) {
            if (sa[i] > k) break;
            while (sb[j] > k - sa[i]) {
                j--;
            }
            ans = Math.max(ans, i + j);
        }
        System.out.println(ans);
    }
}