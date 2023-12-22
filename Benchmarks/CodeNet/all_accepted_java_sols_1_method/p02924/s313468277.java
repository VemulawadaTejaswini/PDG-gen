import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();

            BigInteger ans = BigInteger.valueOf(N).multiply(BigInteger.valueOf(N - 1)).divide(BigInteger.valueOf(2));

            System.out.println(ans);
        }
    }

}
