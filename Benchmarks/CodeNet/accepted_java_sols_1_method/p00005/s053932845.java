import java.util.Scanner;
import java.math.BigInteger;

class Main
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while( sc.hasNextBigInteger() ){
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			
			BigInteger gcd = a.gcd(b);
			BigInteger lcm = a.multiply(b).divide(gcd);
			
			System.out.println(gcd + " " + lcm);
		}
	}
}