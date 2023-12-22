import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int gcd = 1, n;
		scan.close();
		
		if ( x == y) {
			gcd = x;
		} else {
			if (x > y) {
				n = x % y;
				gcd = Gcd(y,n);
			}else {
				n = y % x;
				gcd = Gcd(x,n);
			}
		}
		
		System.out.println(gcd);
		
	}
	
	public static int Gcd(int a, int b) {
		int gcd = 1;
		int n;
		
		n = Math.min(a, b);
		
		for (int i = n; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
				break;
			}
			
		}
		
		return gcd;
	}
}

