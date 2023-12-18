import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        int tmp = 0;
        int ans = sum * 2;
        for (int i = 0; i < n - 1; i++) {
            tmp += a[i];
            ans = Math.min(Math.abs(sum - 2 * tmp), ans);
        }
        System.out.println(ans);
    }
}