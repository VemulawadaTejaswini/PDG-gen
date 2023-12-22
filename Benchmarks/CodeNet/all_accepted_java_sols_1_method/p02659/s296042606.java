import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal a = new BigDecimal(scanner.nextLong());
        String tmp = scanner.next().replace(".","");
        BigDecimal b = new BigDecimal(Long.valueOf(tmp));

        System.out.println(a.multiply(b).divide(new BigDecimal(100)).longValue());

    }
}