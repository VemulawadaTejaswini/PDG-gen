import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] a = new BigInteger[n];
        BigInteger sum = BigInteger.ZERO;
        BigInteger sum2 = BigInteger.ZERO;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextBigInteger();
            BigInteger tmp = a[i].multiply(a[i]);
            sum2 = sum2.add(tmp);
            sum = sum.add(a[i]);
        }
        BigInteger ans = BigInteger.ZERO;
        BigInteger tmp = sum.multiply(sum);
        BigInteger tmp2 = tmp.subtract(sum2);
        BigInteger tmp3 = tmp2.divide(new BigInteger("2"));
        ans = tmp3.mod(new BigInteger("1000000007"));
        System.out.println(ans);
    }
}