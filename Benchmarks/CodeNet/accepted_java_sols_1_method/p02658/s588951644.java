import java.math.BigInteger;
import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        BigInteger aaa = BigInteger.ONE;
        long check = 1000000000000000000L;
        long[] y = new long[x];
        boolean flag = false;
        for (int i = 0; i < x; i++) {
            y[i] = Long.parseLong(sc.next());
            if (y[i] == 0) {
                flag = true;
            }
        }
        for (int i = 0; i < x; i++) {
            if (flag) {
                aaa = BigInteger.valueOf(0);
                break;
            } else if (aaa.multiply(BigInteger.valueOf(y[i])).subtract(BigInteger.valueOf(check)).signum() == 1) {
                aaa = BigInteger.valueOf(-1);
                break;
            } else {
                aaa = aaa.multiply(BigInteger.valueOf(y[i]));
            }
        }
        System.out.println(aaa);
    }
}