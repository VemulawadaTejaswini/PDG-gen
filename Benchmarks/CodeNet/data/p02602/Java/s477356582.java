import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n + 1];
        a[0] = 1;
        BigInteger[] e = new BigInteger[n + 1];
        e[0] = BigInteger.ONE;
        for (int i = 1; i < a.length; i++) {
            a[i] = sc.nextLong();
            BigInteger f = new BigInteger(String.valueOf(a[i]));

            e[i] = e[i - 1].multiply(f);
            if(i > k ) {
                BigInteger g = new BigInteger(String.valueOf(a[i - k]));
                e[i] = e[i].divide(g);
                if(e[i].compareTo(e[i - 1]) > 0) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
        }
    }
}