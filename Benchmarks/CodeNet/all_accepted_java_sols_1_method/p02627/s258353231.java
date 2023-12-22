import java.util.Scanner;

// ABC171-A
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char alphabet = input.charAt(0);

		if (Character.isUpperCase(alphabet)) {
			System.out.println('A');
		} else {
			System.out.println('a');
		}

		sc.close();
	}
}
