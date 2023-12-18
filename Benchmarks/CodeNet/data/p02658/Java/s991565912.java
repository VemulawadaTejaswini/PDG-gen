import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        BigInteger ans = BigInteger.ONE ;
        for (int i = 0 ; i < n ; i ++) {
            BigInteger tm = sc.nextBigInteger() ;
            ans = ans.multiply(tm) ;
        }
        BigInteger cmp = new BigInteger("1000000000000000000") ;
        if(ans.compareTo(cmp) == 1) System.out.println("-1");
        else System.out.println(ans);
    }
}