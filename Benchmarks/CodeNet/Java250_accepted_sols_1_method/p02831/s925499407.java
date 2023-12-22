import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BigInteger c = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
        int d = a % b;
        while(d != 0) {
            a = b;
            b = d;
            d = a % b;
        }
        System.out.println(c.divide(BigInteger.valueOf(b)));
    }
}
