import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (input.equals("AAA") || input.equals("BBB")) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
