
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long a = s.nextLong();
		
		String b_s = s.next();
		
		long b = 0;
		int base = 1;
		for ( int i = b_s.length()-1; i >= 0; i-- ) {
		    char c = b_s.charAt(i);
		    if (c != '.') {
		        b += Character.getNumericValue(b_s.charAt(i)) * base;
		        base *= 10;
		    }
		}
		
		long mul = (long)(a * b);
		

		System.out.println(mul/100);

		

	}

}
