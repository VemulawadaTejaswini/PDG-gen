import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        BigInteger ans = BigInteger.ONE ;
        BigInteger b[] = new BigInteger[n] ;
        BigInteger cmp = new BigInteger("1000000000000000000") ;
        Boolean zero = false ;
        for (int i = 0 ; i < n ; i ++) {
            b[i] = sc.nextBigInteger() ;
            if(b[i].compareTo(BigInteger.ZERO) == 0) zero = true ;
        }
        if(zero) System.out.println(0);
        else {
            Boolean con = true ;
            for (int i = 0 ; i < n ; i ++) {
                ans = ans.multiply(b[i]) ;
                if(ans.compareTo(cmp) == 1) {
                    con = false ;
                    break ;
                }
            }
            if(con) System.out.println(ans);
            else System.out.println(-1);
        }
    }
}
