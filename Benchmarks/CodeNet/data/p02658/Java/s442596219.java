import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nextInt(scanner);
        BigInteger a = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            a = a.multiply(scanner.nextBigInteger());
            if (a.compareTo(new BigInteger("1000000000000000000")) == 1) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(a.toString());
    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

}



