import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        double b = scanner.nextDouble();

        BigDecimal aa = new BigDecimal(a);
//        BigDecimal bb = new BigDecimal((long)(b * 100));
        BigDecimal bb = new BigDecimal(b);

//        BigDecimal result = aa.multiply(bb).divide(new BigDecimal(100));
        BigDecimal result = aa.multiply(bb).setScale(0, BigDecimal.ROUND_DOWN);
        System.out.println(result.longValue());

    }
}