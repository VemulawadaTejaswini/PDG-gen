import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final String str = s.next();

			if(str.chars().sorted().distinct().count() != 2) {
				System.out.println("No");
				return;
			}

			if(str.chars().filter(c -> c == str.charAt(0)).count() != 2) {
				System.out.println("No");
				return;
			}

			System.out.println("Yes");
		}
	}
}
