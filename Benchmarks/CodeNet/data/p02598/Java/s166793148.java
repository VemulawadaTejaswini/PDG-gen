
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());

        int longest = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
            longest = Math.max(longest, a[i]);
        }
        scan.close();

        int ok = longest;
        int ng = 0;
        while (ok - ng > 1) {
            int mid = (ok + ng) / 2;
            if (isOK(k, a, mid)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }

        System.out.println(ok);
    }

    private static boolean isOK(int k, int[] a, int bound) {
        int count = 0;
        for (int ai : a) {
            if (ai % bound == 0) {
                count += ai / bound - 1;
            } else {
                count += ai / bound;
            }
        }
        return count <= k;
    }
}
