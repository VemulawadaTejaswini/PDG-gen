import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] a = new BigInteger[n];
        BigInteger aa = new BigInteger("1000000000000000000");
        BigInteger sum = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextBigInteger();
        }
        for (int i = 0; i < n; i++) {
            sum = sum.multiply(a[i]);
        }
        if(sum.compareTo(aa) > 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
        }
    }
}