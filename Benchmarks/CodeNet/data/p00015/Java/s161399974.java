import java.math.BigInteger;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static Scanner sc = new Scanner(System.in);
	
	
	void run() {
		int n;
		n = sc.nextInt();
		
		BigInteger a, b, c;
		
		for (int i = 0; i < n; i++) {
			a = sc.nextBigInteger();
			b = sc.nextBigInteger();
			c = a.add(b);
			if (c.toString().length() > 80)
				System.out.println("overflow");
			else
				System.out.println(c);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}