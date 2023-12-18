import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int first	= 0;
		int second	= 0;
		int third	= 0;
		
		if ( a < b ) {
			first	= a;
			second	= b;
			
			if ( b < c ) {
				third = c;
				
			} else {
				third	= b;
				second	= c;
			}
		} else if ( b < c ) {
			first	= b;
			second	= c;
			
			if ( c < a ) {
				third = a;
				
			} else {
				second	= a;
				third	= c;
			}
			
		} else if ( c < a ) {
			first	= c;
			second	= a;
			
			if ( a <  b ) {
				third = b;
			
			} else {
				second = b;
				third  = a;
			}
		}
		
		//System.out.printf("%d %d %d", first, second,third);
		System.out.println(first + "" + second + "" + third);
		
	}
}