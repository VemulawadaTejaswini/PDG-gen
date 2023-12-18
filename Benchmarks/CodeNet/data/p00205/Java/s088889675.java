
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
			b[a] = true;
			for (int i = 1; i < 5; i++) {
				map[i] = scanner.nextInt();
				b[map[i]] = true;
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
				slove(map, 2);
			} else if (!b[2]) {
				slove(map, 3);
			} else {
				slove(map, 1);
			}
		}
	}

	private void slove(int[] map, int i) {
		for (int a : map)
			if (a == i)
				System.out.println(1);
			else
				System.out.println(2);
	}
}