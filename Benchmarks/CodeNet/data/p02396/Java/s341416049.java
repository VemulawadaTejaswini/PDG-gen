import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);	
		int data;
		for( int i=1; ; i++ ) {
			data=kb.nextInt();
			if( 0 != data ) {
				System.out.println( "Case "+i+": "+data );
			} else {
				break;
			}
		}
	}
}