import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        boolean flag = false;
        BigInteger result = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            BigInteger multiply = new BigInteger(in.next());
            result = result.multiply(multiply);
        }
        if (result.compareTo(new BigInteger("1000000000000000000")) == 1)
            System.out.println(-1);
        else
            System.out.println(result.toString());
    }
}