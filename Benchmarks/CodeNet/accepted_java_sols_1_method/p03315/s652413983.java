import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		int result = 0;

		for (int i = 0; i < input.length(); ++i) {
			if (input.charAt(i) == '+') {
				result++;
			} else {
				result--;
			}
		}
		System.out.println(result);
		in.close();
	}

}