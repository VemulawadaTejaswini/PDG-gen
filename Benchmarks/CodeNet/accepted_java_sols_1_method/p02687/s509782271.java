import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String prev = sc.next();
		sc.close();

		if (prev.contentEquals("ABC")) {
			System.out.println("ARC");
		} else {
			System.out.println("ABC");
		}

	}

}
