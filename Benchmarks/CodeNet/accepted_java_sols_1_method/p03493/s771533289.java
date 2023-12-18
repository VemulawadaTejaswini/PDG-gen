import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s;
		try (Scanner scanner = new Scanner(System.in)) {
			s = scanner.next();
		}

		System.out.println(s.replace("0", "").length());
	}
}