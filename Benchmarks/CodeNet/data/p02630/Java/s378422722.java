import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            ans += a[i];
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (a[j] == b) {
                    ans -= a[j];
                    ans += c;
                    a[j] = c;
                }
            }
            System.out.println(ans);
        }
    }
}