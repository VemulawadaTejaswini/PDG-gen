import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    final BigInteger mod = BigInteger.valueOf(1000000007L);

    private static int taskOne(int n, int k) {


        return 0;
    }

    private static int taskTwo() {
        return 0;
    }

    private static int taskThree() {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println(n / 2 + 1);
        } else {
            System.out.println(n / 2);
        }
    }
}