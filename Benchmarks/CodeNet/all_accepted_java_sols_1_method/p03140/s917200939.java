import java.util.*;


public class Main{
	public static void main( String args[] ) {

		int N;
		String A,B,C;
		int counter;
		
		Scanner scan = new Scanner( System.in );
		N = scan.nextInt();
		A = scan.next();
		B = scan.next();
		C = scan.next();
		
		
		counter = 0;
		
		for( int i = 0; i < A.length(); i ++ ) {
			if( A.charAt(i) != B.charAt(i) && A.charAt(i) != C.charAt(i)) {
				if( B.charAt(i) != C.charAt(i))
					counter += 2;
				else {
					counter++;
				}
			}
			else if(A.charAt(i) != B.charAt(i) || A.charAt(i) != C.charAt(i) ) {
				counter++;
			}
			
			//System.out.println( i +":" + counter);
		}
		
				
		System.out.println( counter  );
		
		scan.close();
		
	}
}