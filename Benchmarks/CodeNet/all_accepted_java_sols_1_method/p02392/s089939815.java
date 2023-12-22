import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);
		int a=kb.nextInt();
		int b=kb.nextInt();
		int c=kb.nextInt();
		
		if( a < b ) {
			if( b < c ) {
				System.out.println( "Yes");		
			} else {
				System.out.println( "No");	
			}
		} else {
			System.out.println( "No");		
		}
	}
}