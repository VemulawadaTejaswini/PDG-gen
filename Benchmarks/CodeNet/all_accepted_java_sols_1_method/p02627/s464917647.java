import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String a = scan.next();
			
			String b = a.toUpperCase();
			String s = a.toLowerCase();
			
			
			if(a.equals(s)) {
				System.out.println('a');
			}else {
				System.out.println('A');
			}
			
			
			
		}
		
		
	}
		

}
