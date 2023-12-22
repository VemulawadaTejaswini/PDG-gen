import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if ("s".equals(String.valueOf(s.charAt(s.length() - 1)))) {
			System.out.println(s + "es");
		} else {
			System.out.println(s + "s");
		}

		sc.close();

	}
}
