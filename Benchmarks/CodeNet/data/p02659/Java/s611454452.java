import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = BigDecimal.valueOf(sc.nextLong());
        BigDecimal b = BigDecimal.valueOf(sc.nextDouble());
        System.out.println(a.multiply(b).longValue());
        sc.close();

    }

}
