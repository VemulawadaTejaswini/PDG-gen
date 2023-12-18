import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int idx = 0;
        int num = 1;
        if (n % 2 != 0) {
            if (a[idx] != 0) {
                System.out.println(0);
                return;
            }
            idx++;
            num = 2;
        }
        long ans = 1;
        while (idx < n) {
            if (a[idx] != num || a[idx + 1] != num) {
                System.out.println(0);
                return;
            }
            idx += 2;
            num += 2;
            ans *= 2;
            ans %= MOD;
        }
        System.out.println(ans);
    }

}
