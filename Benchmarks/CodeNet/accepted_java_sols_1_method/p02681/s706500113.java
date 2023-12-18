import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String s1 = stdIn.next();
		String s2 = stdIn.next();

		boolean result = s2.startsWith(s1) && s2.length() - s1.length() == 1;

		System.out.println(result ? "Yes" : "No");

		stdIn.close();
	}
}
