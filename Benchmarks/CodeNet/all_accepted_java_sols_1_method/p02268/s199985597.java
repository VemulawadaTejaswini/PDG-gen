import java.util.*;
import java.lang.*;

/**
 * BinarySearch
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(sc.next());
        }

        int q = Integer.parseInt(sc.next());
        int ans = 0;

        for (int i = 0; i < q; i++) {
            int t = Integer.parseInt(sc.next());
            // ここで二分探索
            if (Arrays.binarySearch(s, t) >= 0) {
                ans++;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
