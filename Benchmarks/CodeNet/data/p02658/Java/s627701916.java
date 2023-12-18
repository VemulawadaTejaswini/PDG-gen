import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        BigInteger[] b = new BigInteger[a];
        BigInteger total = BigInteger.ONE;
        for(int i =0; i<a; i++) {
            b[i] = sc.nextBigInteger();
            if(BigInteger.ZERO.equals(b[i])) {
                System.out.println("0");
                return;
            }
        }
        BigInteger c = BigInteger.TEN.pow(18);
        for(int i =0; i<a; i++) {
            total = b[i].multiply(total);
            if(0 < total.compareTo(c) ) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(total);
    }
}