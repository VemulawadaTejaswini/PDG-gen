import java.util.*;
import java.math.*;


public class Main {
    Scanner sc = new Scanner(System.in);

    int	f(String s) {
	int ans	= 0;
	BigInteger m = new BigInteger(s, 2);
        while(true) {
            if(m.equals(BigInteger.ZERO)) break;
            int c = m.bitCount();
            BigInteger n = new BigInteger(Integer.toString(c));
            BigInteger[] ret =	m.divideAndRemainder(n);
            m =	ret[1];
            ans++;
        }
        return ans;
    }

    void doIt() {
        int N =  sc.nextInt();
	String X = sc.next();
	StringBuilder sb = new StringBuilder(X);
        for(int i = 0; i < N; i++) {
            String m;
	    if(sb.charAt(i) == '1') {
                sb.setCharAt(i, '0');
                m = sb.toString();
                sb.setCharAt(i, '1');
            } else {
                sb.setCharAt(i, '1');
                m = sb.toString();
                sb.setCharAt(i, '0');

            }
            //      System.out.println(m);                                                 
            int ret = f(m);
            System.out.println(ret);

        }
    }
    public static void main(String args[]) {
        new Main().doIt();
    }
}

