import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0) {
                System.out.println(0);
                return;
            }
        }

        BigDecimal bd = new BigDecimal(1);
        long th = (long) Math.pow(10, 18);
        for (int i = 0; i < n; i++) {
            int keta1 = String.valueOf(bd.longValue()).length()-1;
            int keta2 = String.valueOf(a[i]).length()-1;
            if (keta1 + keta2 >= 18) {
                System.out.println(-1);
                return;
            }

            bd = bd.multiply(BigDecimal.valueOf(a[i]));
            if (bd.longValue() > th) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(bd.longValue());
    }
}