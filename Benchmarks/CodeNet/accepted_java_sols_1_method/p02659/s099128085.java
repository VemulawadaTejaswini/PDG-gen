import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = Long.parseLong(scanner.next());
        double B = Double.parseDouble(scanner.next());
        scanner.close();

        BigDecimal num = BigDecimal.valueOf(A);
        num = num.multiply(BigDecimal.valueOf(B));
        num = num.setScale(0, BigDecimal.ROUND_DOWN);

        System.out.println(num.toString());
    }
}
