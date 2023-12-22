import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		String str = s.next();

		if (str.matches("[0-9]" + "{" + A + "}-[0-9]{" + B + "}")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
