import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");

	}

}
