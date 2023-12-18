import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long max = (long) Math.pow(10, 18);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long ans = 1;
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            if (temp == 0) {
                System.out.println(0);
                return;
            }
            a[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            ans *= a[i];
            if (ans > max) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans);
    }
}