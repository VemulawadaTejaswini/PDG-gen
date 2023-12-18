import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            BigInteger c = a.add(b);
            BigInteger limit = new BigInteger("100000000000000000000000000000000000000000000000000000000000000000000000000000000");
            System.out.println(c.compareTo(limit) < 0 ? c : "overflow");
        }
    }
}