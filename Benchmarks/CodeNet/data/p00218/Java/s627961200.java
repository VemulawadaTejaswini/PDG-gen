
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			while (n-- > 0) {
				int pm = scanner.nextInt();
				int pe = scanner.nextInt();
				int pj = scanner.nextInt();
				int ave = (pm + pe + pj) / 3;
				if (pm == 100 || pe == 100 || pj == 100 || (pm + pe) / 2 >= 90
						|| ave >= 80)
					System.out.println("A");
				else if (ave >= 70 || (ave >= 50) && (pm >= 80 || pe >= 80))
					System.out.println("B");
				else
					System.out.println("C");
			}
		}
	}
}