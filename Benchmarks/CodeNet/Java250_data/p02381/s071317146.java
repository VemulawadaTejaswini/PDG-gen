import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int n = sc.nextInt();
            if(n == 0) break;
            int [] xs = new int[n];
            long s = 0;
            for(int i = 0; i < n; i++) {
                xs[i] = sc.nextInt();
                s += xs[i];
            }
            double m = s / (double) n;
            double d = 0;
            for(int i = 0; i < n; i++) {
                d += (xs[i] - m) * (xs[i] - m);
            }
            d /= n;
            NumberFormat format = NumberFormat.getInstance();
            format.setMaximumFractionDigits(5);
            format.setMinimumFractionDigits(5);
            format.setGroupingUsed(false);
            System.out.println("" + format.format(Math.sqrt(d)));
        }
    }
}