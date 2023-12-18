// Cliff Climbing
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int w = sc.nextInt(), h = sc.nextInt();
			if ((w | h) == 0)
				break;
			int[][] cliff = new int[h][w];
			boolean[][] feeted = new boolean[h][w];
			for (int i = 0; i < h; i++)
				Arrays.fill(feeted[i], false);
			PriorityQueue<Node> queue = new PriorityQueue<Node>();
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++) {
					char c = sc.next().charAt(0);
					if (Character.isDigit(c))
						cliff[i][j] = c - '0';
					else if (c == 'S') {
						cliff[i][j] = 0;
						queue.add(new Node(j, i, 0, 'R'));
						queue.add(new Node(j, i, 0, 'L'));
					} else if (c == 'T')
						cliff[i][j] = -1;
					else if (c == 'X')
						cliff[i][j] = Integer.MAX_VALUE / 100;
				}
			int result = 1;
			while (!queue.isEmpty()) {
				Node node = queue.poll();
				int tx = node.x;
				int ty = node.y;
				int tc = node.cost;
				char tf = node.foot;
				feeted[ty][tx] = true;
				if (cliff[ty][tx] == -1) {
					result += tc;
					break;
				}
				if (tf == 'R') {
					for (int lx = -3; lx <= -1; lx++)
						for (int ly = -3 - lx; ly <= 3 + lx; ly++) {
							int x = tx + lx;
							int y = ty + ly;
							if (x >= 0 && x < w && y >= 0 && y < h
									&& !feeted[y][x])
								queue.add(new Node(x, y, tc + cliff[y][x], 'L'));
						}
				} else {
					for (int rx = 1; rx <= 3; rx++)
						for (int ry = -3 + rx; ry <= 3 - rx; ry++) {
							int x = tx + rx;
							int y = ty + ry;
							if (x >= 0 && x < w && y >= 0 && y < h
									&& !feeted[y][x])
								queue.add(new Node(x, y, tc + cliff[y][x], 'R'));
						}
				}
			}
			if (result < Integer.MAX_VALUE / 100)
				System.out.println(result);
			else
				System.out.println(-1);
		}
		sc.close();
	}

	static class Node implements Comparable<Node> {
		int x, y, cost;
		char foot;

		Node(int i, int j, int c, char f) {
			x = i;
			y = j;
			cost = c;
			foot = f;
		}

		public int compareTo(Node anotherNode) {
			if (this.foot == anotherNode.foot)
				return this.cost - anotherNode.cost;
			return this.foot - anotherNode.foot;
		}

	}
}