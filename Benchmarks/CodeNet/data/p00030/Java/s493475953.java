import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner( System.in );
	
	static int n, s, count, sum;
	static boolean num[] = new boolean[10];
	
	public static void main(String[] args) {
		
		while ( read() ) {
			count = 0;
			sum = 0;
			solve(0, 0, 0);
			System.out.println( count );
		}
	}
	
	public static boolean read() {
		
		n = sc.nextInt();
		s = sc.nextInt();
		
		if ( n == 0 && s == 0 ) {
			return false;
		}
		
		return true;
	}
	
	public static void solve( int select, int current, int sum ) {

		if ( select != n ) {
			//boolean flag = false;
			for ( int i=current; i < 10; i++ ) {
				sum += i;
				solve( select + 1, i + 1, sum );
			}
		} else {
			if ( s == sum ) {
				count++;
			}
		}
	}
	
	public static void sum() {
		
		int i=0 ;
		while ( i != n ) {
			
		}
		
	}

}