import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		//２つの自然数入力
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		
		int gcd;
		
		
		if ( x == y) {
			gcd = x;
		} else {
			if (x > y) {
				int n = x % y;
				gcd = Gcd(y,n);
			}else {
				int n = y % x;
				 gcd = Gcd(x,n);
			}
		}
		
		System.out.println(gcd);
		
	}
	
	//最大公約数を求める
	public static int Gcd(int x, int y) {
		
		int n = Math.min(x, y);
		
		for (int i = n; i >= 1; i--) {
			if (x % i == 0 && y % i == 0) {
				return i;
			}
		}
		
		return 1;
	}
}

