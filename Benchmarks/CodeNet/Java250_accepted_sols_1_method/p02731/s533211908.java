
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double L = scanner.nextInt();

        System.out.println(BigDecimal.valueOf(Math.pow(L / 3.0, 3)).toPlainString());
    }
}
