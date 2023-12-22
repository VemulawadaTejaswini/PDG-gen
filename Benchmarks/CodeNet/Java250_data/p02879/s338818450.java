import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());
        sc.close();

        BigInteger C = new BigInteger("10");
        if (A.compareTo(C)==-1 && B.compareTo(C)==-1) {
            System.out.println(A.multiply(B));
        } else {
            System.out.println("-1");
        }
    }
}