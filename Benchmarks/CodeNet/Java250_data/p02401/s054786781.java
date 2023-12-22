import java.util.Scanner;


class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);	
		double a,b;
		String op;
		
		while( true ) {
			a=kb.nextDouble();
			op=kb.next();
			b=kb.nextDouble();
			
			if( "?".equals( op) ) { break; }
			
			if( "+".equals( op) ) {
				System.out.printf( "%d\n", (int)a+(int)b );
			} else if( "-".equals( op) ) {
				System.out.printf( "%d\n", (int)a-(int)b );
			} else if( "*".equals( op) ) {
				System.out.printf( "%d\n", (int)a*(int)b );
			} else if( "/".equals( op) ) {
				System.out.printf( "%d\n", (int)a/(int)b );
			}
		}
			
	}
}