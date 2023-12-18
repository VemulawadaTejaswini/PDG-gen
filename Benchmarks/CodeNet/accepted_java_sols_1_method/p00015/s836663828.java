import java.math.BigInteger;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.next());
		while(n-- > 0) {
			String a1, a2;
			if(sc.hasNext()) {
				a1 = sc.next();
			} else {
				break;
			}
			if(sc.hasNext()) {
				a2 = sc.next();
			} else {
				break;
			}
			BigInteger b1 = new BigInteger(a1), b2 = new BigInteger(a2);
			BigInteger sum = b1.add(b2);
			if(sum.toString().length() > 80) {
				System.out.println("overflow");
			} else {
				System.out.println(sum);
			}
		}
	}
}