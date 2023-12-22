import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);

		int W = kb.nextInt();
		int H = kb.nextInt();
		int x = kb.nextInt();
		int y = kb.nextInt();
		int r = kb.nextInt();
		
		
		if( 0<=(x-r) && (x+r)<=W ) {
			if( 0<=(y-r) && (y+r)<=H ) {
				System.out.println( "Yes" );	
			} else {
				System.out.println( "No" );
			}
		} else {
			System.out.println( "No" );	
		}
	}
}