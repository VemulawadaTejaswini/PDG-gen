import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String output;

		Scanner scanner = new Scanner(System.in);

		String string = scanner.next();

		output = String.valueOf(string.charAt(0)) + String.valueOf(string.length()-2) + String.valueOf(string.charAt(string.length()-1));

		System.out.println(output);

		scanner.close();
	}

}
