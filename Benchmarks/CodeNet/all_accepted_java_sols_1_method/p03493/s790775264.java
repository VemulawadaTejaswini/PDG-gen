import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			System.out.println(s.chars().filter(x -> x == '1').count());
		}
	}
}
