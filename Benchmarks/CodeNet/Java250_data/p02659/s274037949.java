import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        BigDecimal A = new BigDecimal(scanner.next());
        BigDecimal B = new BigDecimal(scanner.next());

        System.out.println(A.multiply(B).longValue());
    }

    public static void main(String[] args) {
        new Main();
    }
}
