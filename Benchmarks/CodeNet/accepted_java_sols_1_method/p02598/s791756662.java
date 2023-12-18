import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scan.nextInt();
        int ans = Integer.MAX_VALUE;
        int low = 1, high = 1000000000;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cnt = 0;
            for (int i = 0; i < n; i++) cnt += (a[i] - 1) / mid;
            if (cnt <= k) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        System.out.println(ans);
    }
}
