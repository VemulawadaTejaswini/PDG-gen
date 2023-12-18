
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = Long.parseLong(scan.next());
        String bstr = scan.next();
        BigDecimal bde = new BigDecimal(bstr);
        scan.close();

        long b100 = bde.multiply(new BigDecimal(100)).longValue();

        long ans = a * b100 / 100;
        System.out.println(ans);
    }

}
