
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        // for (int i = 0; i < n; i++) {
        // a[i] = 0;
        // }
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextInt();
        }

        int ans = 0;
        a[0] = b[0];
        for (int i = 0; i < n - 1; i++) {
            a[i + 1] = Math.max(a[i], b[i]);
            if (i < n - 2) {
                a[i + 1] = Math.min(a[i + 1], b[i + 1]);// point
            }

        }

        for (int i = 0; i < n; i++) {
            ans += a[i];
        }
        System.out.println(ans);
        sc.close();
    }

}
