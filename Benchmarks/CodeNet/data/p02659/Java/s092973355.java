import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        BigDecimal A = new BigDecimal(scanner.nextLong());
        BigDecimal B = new BigDecimal(scanner.nextDouble());

        BigDecimal ans = A.multiply(B);
        BigDecimal bd1 = ans.setScale(0, BigDecimal.ROUND_DOWN);


        System.out.println(bd1.toString());
    }
}
