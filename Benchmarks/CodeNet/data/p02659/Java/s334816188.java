import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        BigDecimal ans = null;
        BigDecimal bda = new BigDecimal(a);
        bda.setScale(0);
        BigDecimal bdb = new BigDecimal(b);
        bdb.setScale(2, RoundingMode.DOWN);
        ans = bda.multiply(bdb);
        System.out.println(ans.longValue());
    }
}