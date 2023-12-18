import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner( System.in );
	
	static int n, s, count;
	static boolean num[] = new boolean[10];
	
	public static void main(String[] args) {
		
		while ( read() ) {
			count = 0;
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
			while ( current < 10 ) {
				solve( select + 1, current + 1, sum + current );
				
				current++;
			}
		} else {
			if ( s == sum ) {
				count++;
			}
		}
		
	}

}