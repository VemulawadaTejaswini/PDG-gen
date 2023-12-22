import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        BigDecimal a = new BigDecimal(String.valueOf(A));
        BigDecimal b = new BigDecimal(String.valueOf(B));
        BigDecimal result = a.multiply(b);
        System.out.println(result.longValue());
    }
}