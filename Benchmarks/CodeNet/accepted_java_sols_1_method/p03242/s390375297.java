
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String n = sc.nextLine();

			for (char c : n.toCharArray()) {
				if (c == '1') {
					System.out.print("9");
				} else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}
