import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (stdIn.hasNextInt()) {
			int n = stdIn.nextInt();
			int a, b, c, d = 0;
			int count = 0;
			for (int w = 0; w < 10; w++) {
				for (int x = 0; x < 10; x++) {
					for (int y = 0; y < 10; y++) {
						for (int z = 0; z < 10; z++) {
							if (w + x + y + z == n)
								count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}