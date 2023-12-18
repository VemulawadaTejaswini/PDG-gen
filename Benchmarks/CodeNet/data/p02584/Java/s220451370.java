import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        if (x > 0 && (x * 1.0 / k >= d)) {
            System.out.println(x - k * d);
            return;
        } else if (x < 0 && x * (-1.0) / k >= d) {
            System.out.println(x + k * d);
            return;
        }
        if (x > 0) {
            long num = (long)Math.ceil(x * 1.0 / d);
            long xx = x - ((num - 1) * d);
            if ((k - (num - 1)) % 2 == 0) {
                System.out.println(xx);
            } else {
                System.out.println(Math.abs(xx - d));
            }
        } else if (x < 0) {
            long num = (long)Math.ceil(x * (-1.0) / d);
            long xx = x + ((num - 1) * d);
            if ((k - (num - 1)) % 2 == 0) {
                System.out.println(Math.abs(xx));
            } else {
                System.out.println(xx + d);
            }
        } else {
            if (k % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(d);
            }
        }
    }
}