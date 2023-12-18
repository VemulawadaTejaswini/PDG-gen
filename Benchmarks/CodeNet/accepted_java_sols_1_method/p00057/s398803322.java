import java.util.Scanner;

public class Main {
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		while ( sc.hasNext() ){
		
		int n = sc.nextInt();
		int x = n * ( n + 1 ) / 2 + 1 ;
				
		System.out.println( x );
	
		}

	}

}