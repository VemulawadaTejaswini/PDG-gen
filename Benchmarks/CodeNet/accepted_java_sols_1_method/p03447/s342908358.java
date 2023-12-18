import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int X = scanner.nextInt();
		    int A = scanner.nextInt();
		    int B = scanner.nextInt();
		    
			System.out.println( (X - A ) % B );
		    scanner.close(); }
		  }