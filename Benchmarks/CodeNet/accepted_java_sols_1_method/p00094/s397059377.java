import java.util.Scanner;

public class Main{
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		
		while ( sc.hasNext() ){
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		
		double x = a * b ;
		double S = x / 3.305785 ;
		
				System.out.println( S );
	
		}

	}

}