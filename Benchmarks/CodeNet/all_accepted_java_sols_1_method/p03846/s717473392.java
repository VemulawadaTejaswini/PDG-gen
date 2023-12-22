import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        if (n % 2 == 0) {
            int[] b = new int[n];
            for (int i = 0 ; i < n / 2; i++) {
                b[2* i] = 2 * i + 1;
                b[2* i + 1] = 2 * i + 1;
            }
            for (int i = 0 ; i < n ; i++) {
                if (a[i] == b[i]) {

                } else {
                    System.out.println(0);
                    return;
                }
            }
        } else {
            int[] b = new int[n];
            for (int i = 1 ; i <= n / 2; i++) {
                b[2* i - 1] = 2* i;
                b[2 * i] = 2 * i;
            }
            for (int i = 0 ; i < n ; i++) {
                if (a[i] == b[i]) {

                } else {
                    System.out.println(0);
                    return;
                }
            }
        }
        long ans = 1;
        long mod = 1000000007;
        for (int i = 0 ; i < n / 2 ; i++) {
            ans *= (long) 2;
            ans %= mod;
        }
        System.out.println(ans);
    }

}