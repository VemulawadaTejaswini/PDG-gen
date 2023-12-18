import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while( T-->0 ) {
			int a[] = new int[10];
			for(int i = 0; i < 10; i++) a[i] = sc.nextInt();
			boolean res = solve(a);
			if( res ) System.out.println("YES");
			else System.out.println("NO");
			
		}
	}
	
	static boolean solve(int a[]) {
		int left = -99999;
		int right = -99999;
		for(int i = 0; i < a.length; i++) {
			if( a[i] < left && a[i] < right ) return false;
			if( a[i] > left && a[i] > right ) {
				if( left > right ) left = a[i];
				else right = a[i];
			}
			else if( a[i] > left ) left = a[i];
			else right = a[i];
		}
		return true;
	}
}