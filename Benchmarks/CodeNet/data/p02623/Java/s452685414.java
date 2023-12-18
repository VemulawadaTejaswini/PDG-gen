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
        int pa = 0, pb = 0;
        int ans = 0;
        for (int i = 0; i < n + m; i++) {
            if (pa == n) {
                if (k >= db[pb]) {
                    k -= db[pb++];
                    ans++;
                } else {
                    break;
                }
            } else if (pb == m) {
                if (k >= da[pa]) {
                    k -= da[pa++];
                    ans++;
                } else {
                    break;
                }
            } else {
                if (k < Math.min(da[pa], db[pb])) break;
                if (da[pa] < db[pb]) {
                    k -= da[pa++];
                } else {
                    k -= db[pb++];
                }
                ans++;
            }
        }
        System.out.println(ans);
    }
}