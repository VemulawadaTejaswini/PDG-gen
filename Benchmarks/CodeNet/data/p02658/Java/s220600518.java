import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<BigDecimal> list = IntStream.range(0, n).mapToObj(m -> BigDecimal.valueOf(sc.nextDouble())).collect(Collectors.toList());
        BigDecimal x = BigDecimal.valueOf(Math.pow(10, 18));
        BigDecimal result = BigDecimal.valueOf(1);
        for (BigDecimal decimal : list) {
            if (result.compareTo(x) > 0) {
                break;
            } else {
                result = result.multiply(decimal);
            }
        }
        if (result.compareTo(x) > 1) {
            System.out.println("-1");
        } else {
            System.out.println(result.stripTrailingZeros().toPlainString());
        }
    }
}
