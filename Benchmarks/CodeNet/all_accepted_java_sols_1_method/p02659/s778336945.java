import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        BigDecimal bd = BigDecimal.valueOf(a);
        bd = bd.multiply(BigDecimal.valueOf(b));
        bd = bd.setScale(0, RoundingMode.FLOOR);
        System.out.println(bd.longValue());
    }
}