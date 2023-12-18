import java.util.*;


public class Main{
	public static void main( String args[] ) {

		int counter  = 0;
		int input[];
		boolean isOdd;
		Scanner scan = new Scanner( System.in );
		
		input = new int[scan.nextInt()];
		
		
		for( int i = 0; i < input.length;  i++) {
			input[i] = scan.nextInt();

		}
		
		
		while(true){
			isOdd = false;
			
			for(int i = 0; i < input.length; i++ ) {
				if( input[i] % 2 != 0 ) {
					isOdd = true;
				
					break;
				}
				else {
					input[i] = input[i] /2;
				}
			}
			
			if( isOdd == true ) {
				break;
			}
			else {
				counter++;
			}
			
		}
		
		System.out.println( counter );
		
		scan.close();
		
	}
}