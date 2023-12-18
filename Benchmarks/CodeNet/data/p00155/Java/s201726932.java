
import java.awt.geom.Point2D;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			double[][] cost = new double[n][n];
			for (double[] c : cost) {
				Arrays.fill(c, -1);
			}
			int[] id = new int[n];
			Point2D.Double[] data = new Point2D.Double[n];
			for (int i = 0; i < n; i++) {
				id[i] = scanner.nextInt();
				data[i] = new Point2D.Double(scanner.nextDouble(),
						scanner.nextDouble());
				for (int j = i - 1; j >= 0; j--) {
					double dis = data[i].distance(data[j]);
					if (dis <= 50) {
						cost[i][j] = dis;
						cost[j][i] = dis;
					}
				}
			}
			int m = scanner.nextInt();
			int s = -1;
			int g = -1;
			for (int z = 0; z < m; z++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				for (int i = 0; i < n; i++) {
					if (a == id[i]) {
						s = i;
					}
					if (b == id[i]) {
						g = i;
					}
				}
				double[] min = new double[n];
				Arrays.fill(min, 1 << 24);
				min[s] = 0;
				int[] path = new int[n];
				Arrays.fill(path, -1);
				Deque<Integer> deque = new ArrayDeque<Integer>();
				deque.offer(s);
				while (!deque.isEmpty()) {
					int q = deque.pop();
					for (int i = 0; i < n; i++) {
						if (cost[q][i] != -1 && min[i] > min[q] + cost[q][i]) {
							min[i] = min[q] + cost[q][i];
							path[i] = q;
							deque.offer(i);
						}
					}
				}
				Deque<Integer> list = new LinkedList<Integer>();
				boolean flag = true;
				while (s != g) {
					if (g == -1) {
						flag = false;
						break;
					}
					
					list.push(path[g]);
					g = path[g];
				}
				if (flag) {
					for (int t : list) {
						System.out.print(id[t] + " ");
					}
					System.out.println(b);
				} else {
					System.out.println("NA");
				}
			}

		}
	}
}