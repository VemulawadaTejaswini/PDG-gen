import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in );
		String A = scan.nextLine();
		String B = scan.nextLine();
		String C = scan.nextLine();
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		boolean status = true;
		char winner = 'A';
		char next = 'a';
		while( status ){
			switch ( next ){
			case 'a':
				if( a == A.length() ) 
				{
					winner = 'A';
					status = false;
					break;
				};
				next = A.charAt(a);
				a++;
				break;
			case 'b':
				if( b == B.length() ) 
				{
					winner = 'B';
					status = false;
					break;
				};
				next = B.charAt(b);
				b++;
				break;
			case 'c':
				if( c == C.length() ) 
				{
					winner = 'C';
					status = false;
					break;
				};
				next = C.charAt(c);
				c++;
				break;
			}
				
		}
		System.out.println( winner );
	}
}