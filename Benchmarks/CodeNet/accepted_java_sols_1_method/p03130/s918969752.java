import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[][] map = new int[4][4];
		int a, b;
		for (int i = 0; i < 3; i++) {
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;
			map[a][b]++;
			map[b][a]++;
		}
		boolean memo[];
		int tmp;
		boolean t;
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		for (int i = 0; i < 4; i++) {
			deque.add(i);
			memo = new boolean[4];
			memo[i] = true;
			t = true;
			while (!deque.isEmpty()) {
				tmp = deque.poll();
				for (int j = 0; j < 4; j++) {
					if (map[tmp][j] == 1 && !memo[j]) {
						memo[j] = true;
						deque.add(j);
						break;
					}
				}
			}
			for (int j = 0; j < 4; j++) {
				if (!memo[j]) {
					t = false;
					break;
				}
			}
			if (t) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}
