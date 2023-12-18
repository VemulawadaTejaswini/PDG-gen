import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        BigDecimal result = BigDecimal.ONE;
        for (int i = 0; i < N; i++) {
            result = result.multiply(new BigDecimal(s.next()));
        }
        System.out.println(result.compareTo(new BigDecimal("1000000000000000000")) > 0 ? -1 : result);
    }
}