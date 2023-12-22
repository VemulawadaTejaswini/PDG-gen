import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal A = new BigDecimal(scanner.next());
        BigDecimal B = new BigDecimal(scanner.next());
        BigDecimal C = A.multiply(B).setScale(0, RoundingMode.DOWN);
        System.out.println(C);
    }
}
