import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();

		String ans = "";

		if (input.equals("22")) {
			System.out.println("Christmas Eve Eve Eve");
		} else if (input.equals("23")) {
			System.out.println("Christmas Eve Eve");
		} else if (input.equals("24")) {
			System.out.println("Christmas Eve");
		} else {
			System.out.println("Christmas");
		}

	}

}