import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		
		if(a % 1000 == 0) {
			
			System.out.println((1000 * ((a / 1000))) - a);
		} else {
			System.out.println((1000 * ((a / 1000) + 1)) - a);
		}


	}


}

