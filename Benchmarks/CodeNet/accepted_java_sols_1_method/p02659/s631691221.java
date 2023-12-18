import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        BigDecimal a = BigDecimal.valueOf(sc.nextLong());
        BigDecimal b = BigDecimal.valueOf(sc.nextDouble());
        BigDecimal ans = b.multiply(a);
        System.out.println(ans.longValue());
    }
}
