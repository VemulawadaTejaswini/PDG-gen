import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        BigDecimal bd1 = BigDecimal.valueOf(a);
        BigDecimal bd2 = BigDecimal.valueOf(b);
        BigDecimal bd3 = bd1.multiply(bd2);
        BigDecimal sol = bd3.setScale(0, RoundingMode.DOWN);

        System.out.println(sol);
    }
}