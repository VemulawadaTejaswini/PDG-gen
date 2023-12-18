import java.util.*;
import java.math.BigDecimal;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        BigDecimal a, b, c, d, e, f;

        while(true){
            try {
                a = new BigDecimal(sc.next());
                b = new BigDecimal(sc.next());
                c = new BigDecimal(sc.next());
                d = new BigDecimal(sc.next());
                e = new BigDecimal(sc.next());
                f = new BigDecimal(sc.next());
            } catch (NoSuchElementException ex) {
                break;
            }


            BigDecimal det = a.multiply(e).subtract(b.multiply(d));
            BigDecimal x = (c.multiply(e).subtract(b.multiply(f))).divide(det, 3, BigDecimal.ROUND_HALF_UP);
            BigDecimal y = (a.multiply(f).subtract(c.multiply(d))).divide(det, 3, BigDecimal.ROUND_HALF_UP);

            System.out.print(x);
            System.out.print(" ");
            System.out.println(y);
        }

    }
}