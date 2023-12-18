import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int gcd = 1;
		scan.close();
		
		if (x > y) {
			for ( int i = 1; i <= (x % y); i++) {
				if ( (x % y) % i == 0) {
					if ( y % i == 0) {
						gcd = i;
					}
				}
			}
		} else if (x < y){
			for ( int i = 0; i <= (y % x); i++) {
				if ( (y % x) % i == 0) {
					if ( x % i == 0) {
						gcd = i;
					}
				}
			}
		} else {
			gcd = x;
		}
		
		System.out.println(gcd);
		
	}
}

