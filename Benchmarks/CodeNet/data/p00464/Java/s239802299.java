
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			int n = scanner.nextInt();
			if ((h | w | n) == 0)
				break;
			int[][] map = new int[h][w ];
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++)
					map[i][j] = scanner.nextInt();
			int px = 0;
			int py = 0;
			n--;
			while (px < w && py < h) {
				if ((n + map[py][px]) %2==1)
					px++;
				else
					py++;
				n /= 2;
			}
			System.out.println((py + 1 )+ " " +( px + 1));
		}
	}
}