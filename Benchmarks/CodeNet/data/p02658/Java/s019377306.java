import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        BigDecimal ans = new BigDecimal(1);
        boolean flg = false;
        long max = 1000000000;
        max *= 1000000000;
        BigDecimal bmax = new BigDecimal(max);
        for (int i = 0; i < n; i++) {
            ans = ans.multiply(new BigDecimal(a[i]));

            if (ans.compareTo(bmax) > 0 || ans.compareTo(new BigDecimal(0)) < 0) {
                flg = true;
            }
        }

        if (ans.compareTo(new BigDecimal(0)) == 0) ans = new BigDecimal(0);
        else if (flg) ans = new BigDecimal(-1);

        System.out.println(ans.longValue());
    }
}