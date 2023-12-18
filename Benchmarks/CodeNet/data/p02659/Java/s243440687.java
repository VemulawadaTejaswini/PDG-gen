import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author : Ritchie Zhang
 * @date : 2020/5/10
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = scanner.nextBigDecimal();
        BigDecimal b = scanner.nextBigDecimal();

        BigDecimal c = a.multiply(b);
        long d = c.longValue();
        System.out.println(d);
    }

}
