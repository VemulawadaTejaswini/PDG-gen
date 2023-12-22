
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
		BigInteger n = sc.nextBigInteger();
		
		BigInteger base = new BigInteger("26");
		StringBuilder buf = new StringBuilder();
		while( n.compareTo(BigInteger.ZERO) > 0 ) {
			BigInteger[] divideAndRemainder = n.subtract(BigInteger.ONE).divideAndRemainder(base);
			n=divideAndRemainder[0];
			char ch = (char) ('a'+divideAndRemainder[1].intValue());
			
			buf.append(ch);
			
		}
		System.out.println(buf.reverse().toString());
	}

}

