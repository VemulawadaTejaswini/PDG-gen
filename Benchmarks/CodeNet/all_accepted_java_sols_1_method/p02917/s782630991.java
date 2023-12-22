import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int)1e9 + 7;
        int n = sc.nextInt();
        int[] b = new int[n-1];
        for  (int i = 0; i < n-1; i++) {
            b[i] = sc.nextInt();
        }
        int[] a = new int[n];
        a[0] = b[0];
        int ans = a[0];
        for  (int i = 1; i < n; i++) {
            if (i == n-1) {
                a[i] = b[i-1];
            } else {
                a[i] = Math.min(b[i-1], b[i]);
            }
            ans += a[i];
        }
        System.out.println(ans);
    }

}
