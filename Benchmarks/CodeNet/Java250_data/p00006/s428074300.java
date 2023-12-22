import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			for(int i=0; i<str.length(); i++) {
				System.out.print(str.charAt(str.length()-1-i));
			}
			System.out.println();
			

			
		}
	}
}




