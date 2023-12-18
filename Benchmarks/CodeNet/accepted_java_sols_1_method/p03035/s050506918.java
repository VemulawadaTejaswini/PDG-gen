import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = 0;
			
			if (a <= 5) {
				c = 0;
			}
			else if (5 < a && a <= 12) {
				c = b/2;
			} else if (12 < a) {
				c = b;
			}
			System.out.println(c);		
		}
	}
}