import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String numberStr = scanner.next();
		

		if (numberStr.charAt(0) == '7' || numberStr.charAt(1) == '7' || numberStr.charAt(2) == '7') {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scanner.close();

	}

}
