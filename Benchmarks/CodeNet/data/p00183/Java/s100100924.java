
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line1 = scanner.next();
			if (line1.equals("0"))
				break;
			char[][] map = new char[3][3];
			map[0] = line1.toCharArray();
			for (int i = 1; i < 3; i++) {
				map[i] = scanner.next().toCharArray();
			}
			if (isTrue(map, 'b'))
				System.out.println('b');
			else if (isTrue(map, 'w'))
				System.out.println('w');
			else
				System.out.println("NA");
		}
	}

	private boolean isTrue(char[][] map, char c) {
		for (int i = 0; i < 3; i++) {
			if (map[i][0] == c && map[i][1] == c && map[i][2] == c)
				return true;
		}
		for (int i = 0; i < 3; i++) {
			if (map[0][i] == c && map[1][i] == c && map[2][i] == c)
				return true;
		}
		if (map[0][0] == c && map[1][1] == c && map[2][2] == c)
			return true;
		if (map[0][2] == c && map[1][1] == c && map[2][0] == c)
			return true;
		return false;
	}
}