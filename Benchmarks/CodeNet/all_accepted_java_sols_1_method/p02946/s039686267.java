
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();
			int x = sc.nextInt();
			boolean first = true;

			for(int i = x - k + 1; i < x + k; i++) {
				if (!first) {
					System.out.print(" ");
				}
				System.out.print(i);
				first = false;
			}
			System.out.println("");
		}
	}
}
