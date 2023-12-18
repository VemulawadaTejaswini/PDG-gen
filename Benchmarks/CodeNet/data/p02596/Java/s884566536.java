import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long ans = -1l;
        if(k % 2 == 0) {
            System.out.println(-1);
            return;
        }
        if(k == 7 || k == 1) {
            System.out.println(1);
            return;
        }
        BigInteger tmp2 = new BigInteger("7");
        BigInteger kk = new BigInteger(Integer.toString(k));
        BigInteger k10 = new BigInteger("10");
        BigInteger k7 = new BigInteger("7");
        while(true) {
            if(tmp2.remainder(kk).equals(BigInteger.ZERO)) {
                String s = tmp2.toString();
                ans = s.length();
                break;
            }
            tmp2 = tmp2.multiply(k10);
            tmp2 = tmp2.add(k7);
        }
        System.out.println(ans);
    }
}