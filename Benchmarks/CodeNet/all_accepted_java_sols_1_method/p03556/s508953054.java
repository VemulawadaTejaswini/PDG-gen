import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int sqrt = (int) Math.sqrt(scanner.nextInt());
			System.out.println(sqrt * sqrt);
		}
	}
}
