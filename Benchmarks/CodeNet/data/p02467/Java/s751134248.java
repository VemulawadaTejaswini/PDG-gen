import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            long n = Long.parseLong(br.readLine());
            printFactor(n);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void printFactor(long n) {
        System.out.print(n + ":");
        factorize(n, 3);
    }

    private static void factorize(long n, long r) {
        if (n == 1) {
            System.out.println();
            return;
        }
        System.out.print(" ");
        if (n % 2 == 0) {
            System.out.print(2);
            n = n / (long) 2;
        } else {
            for (long i = r ; i <= Math.sqrt((double) n); i += 2) {
                if (n % i == 0) {
                    r = i;
                    System.out.print(i);
                    n = n / i;
                    break;
                }
            }
            System.out.print(n);
            System.out.println();
            return;
        }

        factorize(n, r);
    }
}