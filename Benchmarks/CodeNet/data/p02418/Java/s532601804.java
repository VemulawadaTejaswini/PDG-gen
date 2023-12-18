import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLine()) {
			String s = scan.nextLine();
			String p = scan.nextLine();

			s = s.concat(s);

			if (s.contains(p))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		System.exit(0);
	}

}