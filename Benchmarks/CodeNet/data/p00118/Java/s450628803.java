
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a == 0 && b == 0)
				break;
			char[][] map = new char[a + 2][b + 2];
			for (int i = 1; i <= a; i++) {
				String line = scanner.next();
				for (int j = 1; j <= b; j++) {
					map[i][j] = line.charAt(j - 1);
				}
			}
			int count = 0;
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= b; j++) {
					if (map[i][j] != ' ') {
						count++;
						solve(map[i][j], map, i, j);
					}
				}
			}
			System.out.println(count);
		}
	}

	private static void solve(char c, char[][] map, int y, int x) {
		int[] a = { -1, 0, 0, 1 };
		int[] b = { 0, -1, 1, 0 };
		Deque<int[]> deque = new ArrayDeque<int[]>();
		deque.push(new int[] { y, x });
		while (!deque.isEmpty()) {
			int[] p = deque.pop();
			int yp = p[0];
			int xp = p[1];
			map[yp][xp] = ' ';
			for (int i = 0; i < a.length; i++) {
				int yn = yp + a[i];
				int xn = xp + b[i];
				if (map[yn][xn] == c) {
					boolean flag = true;
					for (int[] t : deque) {
						if (t[0] == yn && t[1] == xn) {
							flag = false;
							break;
						}
					}
					if (flag) {
						deque.push(new int[] { yn, xn });
					}
				}
			}
		}
	}

}