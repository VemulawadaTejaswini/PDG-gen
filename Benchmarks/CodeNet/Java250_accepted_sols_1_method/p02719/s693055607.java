import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        String S = sc.next();
        BigInteger N = new BigInteger(S);
        S = sc.next();
        BigInteger K = new BigInteger(S);
        sc.close();

        BigInteger min = N;
        BigInteger MONE = new BigInteger("-1");
        boolean f = true;
        N = N.remainder(K);
        min = N;
        while(f){
            N = N.subtract(K);
            if(N.compareTo(BigInteger.ZERO) == -1)
                N = N.multiply(MONE);
            if(N.compareTo(min) == -1){
                min = N;
            }else{
                break;
            }
            if(min.compareTo(BigInteger.ZERO) == 0)
                break;
        }
        System.out.println(min.toString());
    }
}