import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String N = scanner.next();
		String result = "No";

		if (N.substring(0, 1).equals(N.substring(2, 3))) {
			result = "Yes";
		}
		System.out.println(result);
	}

}