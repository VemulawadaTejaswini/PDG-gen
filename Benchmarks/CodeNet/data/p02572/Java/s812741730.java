import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextBigInteger();
        }
        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                BigInteger tmp1 = a[i].mod(new BigInteger("1000000007"));
                BigInteger tmp2 = a[j].mod(new BigInteger("1000000007"));
                BigInteger tmp3 = tmp1.multiply(tmp2);
                ans = ans.add(tmp3);
            }
        }
        ans = ans.mod(new BigInteger("1000000007"));
        System.out.println(ans);
    }
}