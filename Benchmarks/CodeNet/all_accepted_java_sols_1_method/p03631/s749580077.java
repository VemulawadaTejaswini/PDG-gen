import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();

		StringBuffer sb = new StringBuffer(input);
		String reverse = sb.reverse().toString();

		if (input.equals(reverse)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}