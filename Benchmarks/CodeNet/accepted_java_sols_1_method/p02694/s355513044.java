import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String to = scan.nextLine();

        BigDecimal money = new BigDecimal(100);

        BigDecimal moneyTo = new BigDecimal(to);

        BigDecimal moneyMax = new BigDecimal(1000000000000000000L);

        int i = 1;

        while (money.compareTo(moneyMax) == -1) {

            money = money.multiply(new BigDecimal(1.01));
            money = money.setScale(0, BigDecimal.ROUND_DOWN);
            if (money.compareTo(moneyTo) >= 0) {
                break;
            }
            i++;
        }

        System.out.println(i);
    }
}
