import java.util.Scanner;

public class Main {
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		
		while ( sc.hasNext() ){
		
		double a = sc.nextDouble();
		
		double a2 = a * 2 ;
		double a3 = a2 / 3 ;
		double a4 = a3 * 2 ;
		double a5 = a4 / 3 ;
		double a6 = a5 * 2 ;
		double a7 = a6 / 3 ;
		double a8 = a7 * 2 ;
		double a9 = a8 / 3 ;
		double a10 = a9 * 2 ;
		
		double s = a + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 ;
		
		System.out.println( s );
	
		}
	}

}