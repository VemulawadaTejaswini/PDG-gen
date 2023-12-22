import java.util.Scanner;

public class Main {

	private static final String ABC = "ABC";
	private static final String ARC = "ARC";

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			System.out.println((ABC.equals(s)) ? ARC : ABC);
		}
	}
}
