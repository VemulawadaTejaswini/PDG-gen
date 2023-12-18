import java.util.Scanner;
import java.math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gcd(a,b));
	}
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else if(a ==0 ) {
			return b;
		}
		else if(a>=b) {
			return gcd(b,a%b);
		}else {
			return gcd(a,b%a);
		}
	}

}
