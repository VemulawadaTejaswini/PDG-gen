import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String[] firstLine = scan.nextLine().split(" ");
		int a = Integer.valueOf(firstLine[0]);
		int b = Integer.valueOf(firstLine[1]);
		int ans = a + b;
		if (ans < a - b) {
			ans = a - b;
		}
		if (ans < a * b) {
			ans = a * b;
		}

		System.out.println(ans);
	}
}
