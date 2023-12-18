import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		if (s.substring(2, 3).contentEquals(s.substring(3, 4))
				&& s.substring(4, 5).contentEquals(s.substring(5, 6))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scan.close();

	}

}
