import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String s = sc.next();

		System.out.print(s.charAt(0));
		System.out.print(s.length() - 2);
		System.out.print(s.charAt(s.length() - 1));

	}
}