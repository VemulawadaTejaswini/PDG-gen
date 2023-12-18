import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();

        BigDecimal a = new BigDecimal(A);
        BigDecimal b = new BigDecimal(B);

        BigDecimal ans = a.multiply(b);


        System.out.println(ans.longValue());
    }
}