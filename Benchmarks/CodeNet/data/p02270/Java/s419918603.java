import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] w = new int[n];
        int ttl = 0;
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
            ttl += w[i];
        }
        int lo = 1;
        int hi = ttl;
        int p = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (canLoad(w, k, mid)) {
                p = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(p);
    }

    private static boolean canLoad(int[] w, int k, int p) {
        int t = 0;
        int ck = 0;
        for (int cw : w) {
            if (cw > p) {
                return false;
            }
            if (t + cw > p) {
                ck++;
                if (ck == k) {
                    return false;
                }
                t = 0;
            }
            t += cw;
        }
        return true;
    }
}