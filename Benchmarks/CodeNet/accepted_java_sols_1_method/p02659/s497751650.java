import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        BigDecimal bd = new BigDecimal(sc.next());
        bd = bd.multiply(new BigDecimal("100.0"));
        BigInteger bi = bd.toBigInteger();
        long b = Long.parseLong(bi.toString());
        long ans = (a*b)/100;
        System.out.println(ans);
    }
}
