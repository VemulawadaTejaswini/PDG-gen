import java.util.Scanner;

public class Main {
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		int n = sc.nextInt();
		long x = 1 ;
		
		for ( int i = 1 ; i <= n ; i++ ){
			
			 x = x * i ;
			
		}
		
		System.out.println( x );

	}

}