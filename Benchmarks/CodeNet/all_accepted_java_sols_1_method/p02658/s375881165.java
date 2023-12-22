import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger[] a = new BigInteger[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextBigInteger();
            if(a[i].equals(BigInteger.valueOf(0))) {
                System.out.println(0);
                System.exit(0);
            }
        }
        sc.close();
        java.util.Arrays.sort(a, Collections.reverseOrder());

        BigInteger ans = BigInteger.valueOf(1);
                   //1000000000000000000
        BigInteger limit = BigInteger.valueOf(1000000000000000000L);
        for(int i=0; i<n; i++) {
            ans = ans.multiply(a[i]);
            if(ans.compareTo(limit) > 0) {
                System.out.println(-1);
                System.exit(0);
            }
        }
        System.out.println(ans);
    }
}
