import java.util.Scanner;

public class Main {
	
	// we can assume that a is always greater than b
	
	public static int gcd(int a, int b) {
		return (b == 0)?  a : gcd(b, a % b);
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = 0, b = 0;
		
		a = cin.nextInt();
		b = cin.nextInt();
		
		int c = Math.min(a,b);
		a = Math.max(a, b);
		
		System.out.println(gcd(a , c));
		
	
	}
}