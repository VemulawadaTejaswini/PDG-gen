import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ans = 10_000_000;
        for (int t = -100; t <= 100; t++) {
            int cost = 0;
            for (int i = 0; i < n; i++) {
                cost += (t - a[i]) * (t - a[i]);
            }
            ans = Math.min(ans, cost);
        }
        System.out.println(ans);
    }
}