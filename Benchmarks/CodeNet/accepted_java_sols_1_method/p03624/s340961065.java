import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String[] s = scanner.next().split("");

		for (char c = 'a'; c <= 'z'; c++) {
			if (!Arrays.asList(s).contains(String.valueOf(c))) {
				System.out.println(c);
				return;
			}
		}

		System.out.println("None");
	}
}
