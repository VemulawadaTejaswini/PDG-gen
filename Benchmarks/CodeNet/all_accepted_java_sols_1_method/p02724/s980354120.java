import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		scanner.close();
		
		if (num < 5) {
			System.out.println(0);
		} else {
			
			int a = num / 500;
			
			int c = num - (500 * a);
			
			int b = c / 5;
			
			System.out.println((1000 * a) + (5 * b));
		}
		
	}

}
