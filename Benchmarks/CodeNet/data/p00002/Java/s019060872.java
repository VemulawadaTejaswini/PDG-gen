import java.util.Scanner;

public class Main {
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		while ( sc.hasNext() ){
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		int s = a + b ;
		String str = Integer.toString( s );
		
		System.out.println( str.length() );
	
		}

	}

}