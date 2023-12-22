import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal ll = sc.nextBigDecimal();
        BigDecimal ans2 = ll.divide(new BigDecimal(3.0), 7, BigDecimal.ROUND_HALF_UP);
        BigDecimal ans3 = ans2.multiply(ans2).multiply(ans2);
        System.out.println(ans3);
    }
}
