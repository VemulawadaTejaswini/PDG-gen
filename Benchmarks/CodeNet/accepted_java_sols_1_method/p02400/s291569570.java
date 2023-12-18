import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        BigDecimal b = new BigDecimal(a);
        BigDecimal c = new BigDecimal(2);
        BigDecimal d = new BigDecimal(3.14159265359);

//        Integer b = scanner.nextInt();

        BigDecimal x = b.multiply(c).multiply(d);
        BigDecimal y = b.multiply(b).multiply(d);
        System.out.println(y + " " + x);
    }
}
