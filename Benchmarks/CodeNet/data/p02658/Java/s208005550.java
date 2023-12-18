import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {

            a[i] = BigInteger.valueOf(Long.valueOf(sc.next()));
            if(a[i] == BigInteger.ZERO) {
                System.out.println("0");
                return;
            }
        }

        BigInteger total = BigInteger.ONE;
        BigInteger limit = BigInteger.valueOf(1000000000000000000L);

        for (BigInteger i : a) {
            total = total.multiply(i);
            if(total.compareTo(limit) > 0) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(total);
    }
}