import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        double b = sc.nextDouble();


        BigDecimal total = BigDecimal.valueOf(a);
        BigDecimal result = total.multiply(BigDecimal.valueOf(b));

        System.out.println(result.setScale(0, RoundingMode.DOWN));
    }
}