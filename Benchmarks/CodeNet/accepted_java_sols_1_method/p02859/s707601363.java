import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger r = new BigInteger(sc.next());
        sc.close();

        System.out.println(r.pow(2));
    }
}