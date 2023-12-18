import java.util.Scanner;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			BigInteger a = scan.nextBigInteger();
			BigInteger b = scan.nextBigInteger();
			BigInteger c = a.add(b);
			if(c.toString().length() > 80 ) {
				System.out.println("overflow");
			}
			else {
				System.out.println(c);
			}
		}
	}
}