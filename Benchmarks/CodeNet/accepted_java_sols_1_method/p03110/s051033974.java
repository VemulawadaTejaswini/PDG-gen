
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double money = 0;
        for (int i = 0; i < n; ++i) {
            double x = scanner.nextDouble();
            String currency = scanner.next();
            if ("BTC".equals(currency)) {
                money += 380000.0 * x;
            } else {
                money += x;
            }
        }
        System.out.println(money);
    }
}
