import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("input.txt"));

        long a = in.nextLong();
        if (isPrime(a)) {
            System.out.println(1);
            return;
        }

        long b = 2;
        long count = 0;
        while (b <= a) {
            b = find(a, b);
            //System.out.println("b = " + b);
            a /= b;
            b++;
            count++;
            //System.out.println("a = " + a);
        }

        System.out.println(count);
    }

    private static long find(long n, long pos) {
        long max = (long) Math.sqrt(n);
        for (long i = pos; i <= max; i++) {
            if (n % i == 0 && (isPrime(i))) {
                return i;
            }
        }

        for (long i = 2; i <= max; i++) {
            if (n % (i * i) == 0 && isPrime(i)) {
                if (i * i >= pos) return i * i;
            }
        }

        return n + 1;
    }

    private static boolean isSquire(long n) {
        long max = (long) Math.sqrt(n);

        for (long i = 2; i <= max; i++) {
            if (i * i == n && isPrime(i)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }

        long max = (long) Math.sqrt(n);

        for (long i = 2; i <= max; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
