import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        switch (a.compareTo(b)) {
            case 0:
                System.out.println("EQUAL");
                break;
            case 1:
                System.out.println("GREATER");
                break;
            default:
                System.out.println("LESS");
                break;
        }
    }
}
