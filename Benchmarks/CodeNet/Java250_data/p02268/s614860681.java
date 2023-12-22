
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(scan.next());
        }
        int q = Integer.parseInt(scan.next());
        int[] t = new int[q];
        for (int i = 0; i < q; i++) {
            t[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        int ans = 0;
        for (int i = 0; i < q; i++) {
            ans += binarySearch(s, t[i]);
        }
        System.out.println(ans);
    }

    private static int binarySearch(int[] s, int t) {
        int left = -1;
        int right = s.length;

        while (right - left > 1) {
            int mid = (right + left) / 2;
            if (s[mid] >= t) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (right == s.length) {
            return 0;
        }

        if (s[right] == t) {
            return 1;
        } else {
            return 0;
        }
    }
}

