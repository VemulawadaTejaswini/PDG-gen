import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();

            BigInteger gcd = a.gcd(b);
            BigInteger lcm = a.multiply(b).divide(gcd);
            System.out.println(gcd + " " + lcm);
        }
    }
}