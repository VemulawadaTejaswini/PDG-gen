import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        if (a.compareTo(b) > 0) {
            System.out.println("GREATER");
        } else if (a.compareTo(b) < 0) {
            System.out.println("LESS");
        } else {
            System.out.println("EQUAL");
        }
    }
}
