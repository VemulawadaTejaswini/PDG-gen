import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
			String c1 = scanner.nextLine();
			String c2 = scanner.nextLine();
			String c3 = scanner.nextLine();
			
			System.out.println(c1.substring(0, 1) + c2.substring(1, 2)
									+ c3.substring(2, 3));
		    scanner.close(); }
		  }