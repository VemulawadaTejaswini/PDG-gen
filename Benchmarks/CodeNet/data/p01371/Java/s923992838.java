
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
	public static void pr(Object o) {
		System.out.println(o);
	}

	static class Point {
		int x;
		int y;

		public Point() {

		}

		public Point(int x, int y) {
			this.x = Math.max(Math.min(x, 30), -30);
			this.y = Math.max(Math.min(y, 30), -30);
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Point) {
				Point p = (Point) obj;
				return x == p.x && y == p.y;
			}
			return false;
		}

		public int hashCode() {
			return x + 37 * y;
		}

		public String toString() {
			return x + "," + y;
		}
	}

	int[][] t;

	int n;

	Queue<Integer> q;

	int getValue() {
		Queue<Integer> buki = new LinkedList<Integer>();
		buki.add(0);
		int sum = 0;
		Integer[]_q=q.toArray(new Integer[0]);
		for (int i = 0; i < _q.length; i++) {
			int a = _q[i];
			int min = Integer.MAX_VALUE;
			for (int b : buki) {
				min=Math.min(min,t[a][b]);
			}
			buki.add(a);
			sum += min;
		}
		return sum;
	}

	int min;

	public void search() {
		if (q.size() == n) {
			min = Math.min(min, getValue());
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!q.contains(i)) {
				q.add(i);
				search();
				q.remove(i);
			}
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			min=Integer.MAX_VALUE;
			if (n == 0) {
				break;
			}
			t = new int[n + 1][n + 1];
			for (int i = 1; i <= n; i++)
				for (int j = 0; j <= n; j++) {
					t[i][j] = sc.nextInt();
				}
			q = new LinkedList<Integer>();
			search();
			pr(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}