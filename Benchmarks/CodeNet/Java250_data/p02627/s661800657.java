import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		if(!s.equals(s.toLowerCase()))
			System.out.println("A");
		else
			System.out.println("a");
				
		

	}

}
