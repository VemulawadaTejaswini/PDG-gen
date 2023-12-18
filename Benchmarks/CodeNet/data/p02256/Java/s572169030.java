import java.util.*;
import java.math.*;

class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger n1, n2;
		n1 = new BigInteger(sc.next());
		n2 = new BigInteger(sc.next());
		
		BigInteger n3 = n1.gcd(n2);
		
		System.out.println(n3);
		
	}
}
