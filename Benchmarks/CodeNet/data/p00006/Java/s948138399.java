import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String inputData = sc.nextLine();

		for (int i = 1; i <= inputData.length(); i++) {
			System.out.print(inputData.charAt(inputData.length() - i));
		}
	}
}