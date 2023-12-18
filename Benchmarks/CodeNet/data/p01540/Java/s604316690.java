import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		int N = nextInt();
		int M = nextInt();

		int[] x = new int[N];// x座標でソートした時の宝物の座標
		int[] y = new int[N];// y座標でソートした時の宝物の座標

		int[][] map = new int[N + 1][N + 1];
		Treasure[] treasure = new Treasure[N];

		for (int i = 0; i < N; i++) {
			treasure[i] = new Treasure(nextInt(), nextInt());
		}

		// x座標でソートしてindexをつける
		Arrays.sort(treasure, new ComparatorX());
		for (int i = 0; i < N; i++) {
			x[i] = treasure[i].x * 2;
			treasure[i].xindex = i;
		}

		// y座標でソートしてインデックスをつける
		Arrays.sort(treasure, new ComparatorY());
		for (int i = 0; i < N; i++) {
			y[i] = treasure[i].y * 2;
			treasure[i].yindex = i;
		}

		for (int i = 0; i < N; i++) {
			map[treasure[i].xindex + 1][treasure[i].yindex + 1]++;
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] += map[i - 1][j];
			}
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] += map[i][j - 1];
			}
		}
		for (int i = 0; i < M; i++) {
			int x1 = nextInt() * 2;
			int y1 = nextInt() * 2;
			int x2 = nextInt() * 2;
			int y2 = nextInt() * 2;
			x1 = binarySearch(x, x1 - 1) + 1;
			y1 = binarySearch(y, y1 - 1) + 1;
			x2 = binarySearch(x, x2 + 1) + 1;
			y2 = binarySearch(y, y2 + 1) + 1;
			System.out.println(map[x2][y2] - map[x2][y1] - map[x1][y2] + map[x1][y1]);
		}
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	static int binarySearch(int[] array, int num) {
		int first = 0;
		int last = array.length - 1;
		int center = (first + last) / 2;
		while (first <= last) {
			if (center < array.length - 1) {
				if (array[center] < num) {
					if (num < array[center + 1]) {
						return center;
					} else {
						// num >= array[center + 1]なので前端をcenter+1にする
						first = center + 1;
					}
				} else {
					// array[center] >= numなので後端をcenter-1にする
					last = center - 1;
				}
			} else {
				return array.length - 1;
			}
			center = (first + last) / 2;
		}
		return -1;
	}

}

class Treasure {
	int x = 0;
	int y = 0;
	int xindex = 0;
	int yindex = 0;

	public Treasure(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ComparatorX implements Comparator<Treasure> {
	public int compare(Treasure t1, Treasure t2) {
		return t1.x - t2.x;
	}
}

class ComparatorY implements Comparator<Treasure> {
	public int compare(Treasure t1, Treasure t2) {
		return t1.y - t2.y;
	}
}