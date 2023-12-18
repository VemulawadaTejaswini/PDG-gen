import java.math.BigInteger;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
 
        var n = sc.nextInt();
        var limit = BigInteger.valueOf(10).pow(18);

        BigInteger[] list = new BigInteger[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextBigInteger();
        }

        BigInteger ans = list[0];
        for (int i = 1; i < n; i++) {
            ans = ans.multiply(list[i]);
        }

        if (ans.compareTo(limit) > 0) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
 
        sc.close();
    }
}