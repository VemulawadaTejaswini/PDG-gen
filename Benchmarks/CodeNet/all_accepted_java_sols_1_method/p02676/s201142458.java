import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String strings = sc.nextLine();

		if (strings.length() <= num) {
			System.out.println(strings);
		} else {
			System.out.println(strings.substring(0, num) + "...");
		}

	}
}