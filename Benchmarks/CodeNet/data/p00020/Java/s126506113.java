import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\n");
		String input = scanner.next();
		System.out.println(input.toUpperCase());
	}
}