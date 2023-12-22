import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		if (s.substring(s.length() - 1, s.length()).equals("s")) {
			System.out.println(s + "es");

		} else {
			System.out.println(s + "s");
		}

	}
}