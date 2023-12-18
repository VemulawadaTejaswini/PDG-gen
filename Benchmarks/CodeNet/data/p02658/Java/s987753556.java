import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        BigDecimal result = new BigDecimal(1);
        for(long i = 0; i<N; i++) {
            BigDecimal _result = result.multiply(sc.nextBigDecimal());
            result = _result;
        }
        if (result.compareTo(new BigDecimal(1000000000).multiply(new BigDecimal(1000000000)))==1) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
