import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String value = sc.next();
            if("0".equals(value)) {
                System.out.println("0");
                return;
            } else {
                list.add(new BigDecimal(value));
            }

        }
        BigDecimal x = BigDecimal.valueOf(Math.pow(10, 18));
        BigDecimal result = BigDecimal.valueOf(1);
        for (BigDecimal decimal : list) {
            if (result.compareTo(x) > 0) {
                break;
            } else {
                result = result.multiply(decimal);
            }
        }
        if (result.compareTo(x) > 0) {
            System.out.println("-1");
        } else {
            System.out.println(result.stripTrailingZeros().toPlainString());
        }
    }
}
