import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger a = BigInteger.ZERO;
        for (int i = 0; i < n+1; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                a = a.add(new BigInteger(""+i));
            }
        }
        System.out.println(a.toString());

    }
}
