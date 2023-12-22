import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();

		if (string.charAt(2) == string.charAt(3) && string.charAt(4) == string.charAt(5)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}