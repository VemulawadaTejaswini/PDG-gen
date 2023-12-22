import java.io.IOException;
import java.util.Scanner;

public class Main {
	/**
	 * Main method.
	 */
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		boolean check = false;
		for (int i = 0; i < N; i++) {
			String color = s.next();
			if (color.equals("Y")) {
				check = true;
				break;
			}
		}
		
		System.out.println(check ? "Four" : "Three");
 
	}
}