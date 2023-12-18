import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();

        BigDecimal A = new BigDecimal(strA);
        BigDecimal B = new BigDecimal(strB);

        BigDecimal result = A.multiply(B).setScale(0, RoundingMode.DOWN);

        System.out.println(result);
    }
}