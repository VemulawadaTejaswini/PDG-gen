
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        Arrays.sort(a, Collections.reverseOrder());
        long ans = a[0];
        int limit = (n - 2) / 2;
        for (int i = 1; i <= limit; i++) {
            ans += 2 * a[i];
        }
        if ((n - 2) % 2 != 0) {
            ans += a[limit + 1];
        }

        System.out.println(ans);
    }
}
