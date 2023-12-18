import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            long ans = 0;
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (a[j] == b) {
                    a[j] = c;
                }
                ans += a[j];
            }
            System.out.println(ans);
        }
    }
}