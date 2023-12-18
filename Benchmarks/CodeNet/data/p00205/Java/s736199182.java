
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			if (a == 0)
				break;
			int[] map = new int[5];
			boolean[] b = new boolean[4];
			map[0] = a;
			for (int i = 1; i < 5; i++) {
				map[i] = scanner.nextInt();
			}
			for (int aa : map) {
				b[aa] = true;
			}
			int sum = 0;
			for (int i = 1; i < 4; i++) {
				if (b[i])
					sum++;
			}
			if (sum == 3 || sum == 1)
				for (int i = 0; i < 5; i++)
					System.out.println(3);
			else if (!b[1]) {
				for (int i = 0; i < 5; i++) {
					if (map[i] == 2)
						System.out.println(1);
					else
						System.out.println(2);
				}
			} else if (!b[2]) {
				for (int i = 0; i < 5; i++) {
					if (map[i] == 3)
						System.out.println(1);
					else
						System.out.println(2);
				}
			} else {
				for (int i = 0; i < 5; i++) {
					if (map[i] == 1)
						System.out.println(1);
					else
						System.out.println(2);
				}
			}
		}
	}
}