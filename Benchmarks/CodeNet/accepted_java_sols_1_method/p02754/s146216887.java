import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        BigInteger a_blue = new BigInteger(sc.next());
        BigInteger b_red = new BigInteger(sc.next());
        BigInteger absum = a_blue.add(b_red);
        BigInteger div = n.divide(absum);
        BigInteger rem = n.remainder(absum);
        BigInteger answer = div.multiply(a_blue).add(rem.min(a_blue));
        System.out.println(answer);
        sc.close();
    }
}
