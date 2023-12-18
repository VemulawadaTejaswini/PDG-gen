import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			if(n == 0 && x == 0) break;
			System.out.println(search(n , x));
		}

	}

	static int search(int n , int x) {
		int c = 0;
		int k = n - 3 > x ? x - 3 : n ;
		int m = 2;
		while(true) {
			c += m / 2;
			m++;
			k--;
			if(m >= k ) break;
		}
		return c;
	}
}