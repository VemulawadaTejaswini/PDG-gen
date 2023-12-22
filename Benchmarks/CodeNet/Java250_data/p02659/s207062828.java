import java.util.Scanner;
import java.math.BigDecimal;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = sc.nextBigDecimal();
        double b = sc.nextDouble();
        sc.close();
 
        BigDecimal ans = a.multiply(BigDecimal.valueOf(b));
        System.out.println(ans.longValue());
    }
}
