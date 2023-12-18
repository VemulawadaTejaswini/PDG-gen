import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Float result = 1F;
        Float max = 1000000000f * 1000000000f;
        for(long i = 0; i<N; i++) {
            Float f = sc.nextFloat();
            if (result > max) {
                if (f == 0) {
                    result = 0f;
                }
                continue;
            }
            result *= f;
        }
        if (result > max) {
            System.out.println(-1);
        } else {
            System.out.println(result.longValue());
        }
    }
}
