import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        long ans = 0;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] > a[i]) {
                ans += a[i - 1] - a[i];
                a[i] = a[i - 1];
            }
        }
        System.out.println(ans);
    }
}