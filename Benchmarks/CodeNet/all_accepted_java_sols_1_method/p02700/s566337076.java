import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); //health
		int b = scanner.nextInt(); //strengh
		int c = scanner.nextInt(); 
		int d = scanner.nextInt(); 
		
		while(true) {
			c = c - b;
			if (c <= 0) {
				System.out.println("Yes");
				break;
			} 
			a = a - d;
			if (a <= 0) {
				System.out.println("No");
				break;
			}
			
		}
		return;
	} 
}