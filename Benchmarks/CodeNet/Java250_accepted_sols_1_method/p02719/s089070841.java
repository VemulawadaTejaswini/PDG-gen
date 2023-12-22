import java.util.*;
import java.math.BigInteger;

public class Main {

	public static void main(String [] args) {
		Scanner in =new Scanner(System.in);
		String N=in.next();
		String K=in.next();
		BigInteger b =new BigInteger(N);
		BigInteger jian =new BigInteger(K);
		b=b.mod(jian);
		  b=b.min(b.subtract(jian).abs());
		System.out.print(b.toString());

		
	}
}