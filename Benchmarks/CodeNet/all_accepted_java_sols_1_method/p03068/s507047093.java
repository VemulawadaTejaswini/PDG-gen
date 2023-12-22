import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt( sc.nextLine() );
		final String N = sc.nextLine();
		int targetIndex = Integer.parseInt( sc.nextLine() );
		StringBuilder result = new StringBuilder();
		char targetChar = N.charAt(targetIndex-1);

		for( int i = 0; i < size; i++ ) {
			if( N.charAt(i) == targetChar ) {
				result.append(targetChar);
			} else {
				result.append("*");
			}
		}
		System.out.println( result.toString());
	    
		sc.close();
	}
}