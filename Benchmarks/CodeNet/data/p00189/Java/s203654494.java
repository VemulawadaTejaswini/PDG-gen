
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;

			int[][] num = new int[n][3];
			int size = 0;
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c = scanner.nextInt();
				num[i][0] = a;
				num[i][1] = b;
				num[i][2] = c;
				size = Math.max(size, Math.max(a, b));
			}
			size++;
			int[][] cost = new int[size][size];
			for (int[] t : cost)
				Arrays.fill(t, 1 << 24);
			for (int i = 0; i < n; i++) {
				int a = num[i][0];
				int b = num[i][1];
				int c = num[i][2];
				cost[a][b] = c;
				cost[b][a] = c;

			}
			for (int i = 0; i < size; i++) {
				cost[i][i] = 0;

			}
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (i == j)
						continue;
					for (int k = j + 1; k < size; k++) {
						cost[j][k] = cost[k][j] = Math.min(cost[j][k],
								cost[i][j] + cost[i][k]);

					}
				}
			}
			int ans = 0;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < size; i++) {
				int sum = 0;
				for (int j = 0; j < size; j++) {
					sum += cost[i][j];
				}
				if (sum < min) {
					min = sum;
					ans = i;
				}
			}
			System.out.println(ans + " " + min);
		}

	}

	private void slove(int x, int[][] cost) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for (int i = 0; i < cost.length; i++) {
			if (cost[i][x] != 1 << 24) {
				deque.offer(i);
			}
		}
		cost[x][x] = 0;
		while (!deque.isEmpty()) {
			int pri = deque.poll();
			for (int i = 0; i < cost.length; i++) {
				if (pri == i)
					continue;
				if (cost[pri][i] != 1 << 24
						&& cost[x][i] > cost[pri][i] + cost[x][pri]) {
					cost[x][i] = cost[pri][i] + cost[x][pri];
					cost[i][x] = cost[pri][i] + cost[x][pri];
					if (!deque.contains(i))
						deque.offer(i);
				}
			}
		}

	}
}