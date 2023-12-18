import java.math.BigDecimal;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        try {
            BigDecimal result = IntStream.range(0, n).mapToObj(m -> BigDecimal.valueOf(sc.nextDouble())).reduce((v1, v2) -> v1.multiply(v2)).get();
            BigDecimal x = BigDecimal.valueOf(Math.pow(10, 18));
            if (result.compareTo(x) == 1){
                System.out.println("-1");
            } else {
                System.out.println(result.stripTrailingZeros().toPlainString());
            }
        } catch (Exception e) {
            System.out.println("-1");
        }
    }
}