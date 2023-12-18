import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.next());

        ArrayList<BigInteger> aL = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            aL.add(BigInteger.valueOf(Long.valueOf(scanner.next())));
        }

        BigInteger r = BigInteger.valueOf(0);
        for (int i = 0; i < n; i++) {
            for (int j = i +1; j < n; j++) {
                r = r.add(aL.get(i).multiply(aL.get(j)).mod(BigInteger.valueOf(1000000007)));
            }
        }

        System.out.println(r.mod(BigInteger.valueOf(1000000007)));
    }
}
