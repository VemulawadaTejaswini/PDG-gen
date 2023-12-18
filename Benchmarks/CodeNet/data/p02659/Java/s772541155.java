import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = Long.parseLong(sc.next());
        double b = Double.parseDouble(sc.next());
        BigInteger bi = BigInteger.valueOf((long)(a * b));
        System.out.println(bi);
    }
}
