import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);	
		int x,y;
		
		while( true ) {
			x=kb.nextInt();
			y=kb.nextInt();
			
			if( 0==x && 0==y ) { break; }
			if( x <= y ) {
				System.out.println( x+" "+y );
			} else {
				System.out.println( y+" "+x );
			}
		}
	}
}