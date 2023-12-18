import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String inputData = sc.nextLine();

		for (int i = inputData.length(); i > 0; i--) {
			System.out.print(inputData.charAt(i - 1));
		}
	}
}