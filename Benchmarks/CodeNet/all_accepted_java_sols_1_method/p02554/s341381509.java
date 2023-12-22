import java.math.BigInteger;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger a = BigInteger.TEN.pow(n);
        BigInteger b = BigInteger.valueOf(9).pow(n).multiply(BigInteger.valueOf(2));
        BigInteger c = BigInteger.valueOf(8).pow(n);
        BigInteger d = BigInteger.TEN.pow(9).add(BigInteger.valueOf(7));

        System.out.println(
                c.subtract(b).add(a).remainder(d)
        );
    }
}
