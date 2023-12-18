import java.util.*;
import java.math.*;

public class Main {
  
  	private static final BigInteger MAX 
      = new BigInteger("1000000000000000000");
  
	public static void main (String[] args) throws Exception {
      
		final Scanner in = new Scanner(System.in);
      	final int N = in.nextInt();
      	BigInteger product = BigInteger.ONE;
       boolean hasZero = false;
        boolean tooLarge = false;

        for (int i = 0; i < N; ++i) {
            final BigInteger next = in.nextBigInteger();
            if (next.compareTo(BigInteger.ZERO) == 0) {
                hasZero = true;
            }
            if (!tooLarge) {
                product = product.multiply(next);
                if (product.compareTo(MAX) > 0) {
                    tooLarge = true;
                }
            }            
        }
        
        if (hasZero) {
            System.out.println(0);
        } else if (tooLarge) {
            System.out.println(-1);
        } else {
            System.out.println(product);
        }      

		
	}
}