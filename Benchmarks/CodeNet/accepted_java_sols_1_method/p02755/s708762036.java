

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal a = new BigDecimal(scan.next());
        BigDecimal b = new BigDecimal(scan.next());
        scan.close();

        BigDecimal eight = new BigDecimal("0.08");
        BigDecimal ten = new BigDecimal("0.1");

        int aPriceMin = a.divide(eight, 0, RoundingMode.UP).intValue();
        int aPriceMax = a.add(new BigDecimal("1")).divide(eight, 0, RoundingMode.UP).intValue() - 1;

        int bPriceMin = b.divide(ten, 0, RoundingMode.UP).intValue();
        int bPriceMax = b.add(new BigDecimal("1")).divide(ten, 0, RoundingMode.UP).intValue() - 1;

        if (aPriceMax < bPriceMin) {
            System.out.println(-1);
        } else if (aPriceMin < bPriceMin && bPriceMin <= aPriceMax) {
            System.out.println(bPriceMin);
        } else if (aPriceMin <= bPriceMax && bPriceMax < aPriceMax) {
            System.out.println(aPriceMin);
        } else {
            System.out.println(-1);
        }
    }

}
