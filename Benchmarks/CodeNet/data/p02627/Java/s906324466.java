import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String A = scanner.next();
		
		scanner.close();
		
		boolean result = Pattern.matches("^[A-Z]+$", A);
		
		if (result) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}

}
