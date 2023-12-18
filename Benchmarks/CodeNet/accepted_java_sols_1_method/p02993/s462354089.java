import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String input = s.next();

		for (int i = 0; i < 3; i++) {

			char c = input.charAt(i);
			char c2 = input.charAt(i+1);

			if(c==c2) {
				System.out.println("Bad");
				return;
			}

		}
		System.out.println("Good");
	}

}
