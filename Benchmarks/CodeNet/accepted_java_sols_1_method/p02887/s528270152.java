import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextInt();
			char[] s = scanner.next().toCharArray();
			int count = 0;
			char prev = ' ';
			for (char c : s) {
				if (c != prev) {
					count++;
				}
				prev = c;
			}
			System.out.println(count);
		}
	}
}
