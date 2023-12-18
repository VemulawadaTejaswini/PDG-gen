import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger().subtract(BigInteger.ONE);
		
		BigInteger base = new BigInteger("26");
		while( n.compareTo(BigInteger.ZERO) > 0 ) {
			BigInteger[] divideAndRemainder = n.divideAndRemainder(base);
			n=divideAndRemainder[0];
			char ch = (char) ('a'+divideAndRemainder[1].intValue());
			System.out.print( ch );
		}
		System.out.println();
	}

}

