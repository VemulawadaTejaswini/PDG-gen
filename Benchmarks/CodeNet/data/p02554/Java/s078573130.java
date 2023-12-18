import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger mod = new BigInteger("1000000007");
        if(n == 1) {
            System.out.println(0);
        } else {
            BigInteger ans = BigInteger.ONE;
            BigInteger tmp1 = null;

            for (int i = 1; i <= n; i++) {
                //ans = (ans * i) % 1000000007;
                tmp1 = ans.multiply(new BigInteger(Integer.toString(i)));
                //BigInteger tmp2 = tmp1.divide(new BigInteger("2"));
                ans = tmp1.mod(mod);
            }
            System.out.println(ans);
        }
    }
}