import java.util.*;
import java.math.*;


public class Main {
    Scanner sc = new Scanner(System.in);

    int	f(BigInteger m) {
	int ans	= 0;
        while(true) {
            //      if(m.equals(BigInteger.ZERO)) break;                                   
            int c = m.bitCount();
            if(c == 0) break;
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
	BigInteger n = new BigInteger(X, 2);
        //      StringBuilder sb = new StringBuilder(X);                                   
        for(int i = 0; i < N; i++) {
            BigInteger m = n.flipBit(N-i-1);
	    //      System.out.println(m);                                                 
            int ret = f(m);
            System.out.println(ret);

        }
    }
    public static void main(String args[]) {
        new Main().doIt();
    }
}
