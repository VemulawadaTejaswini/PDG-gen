import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	Pair map[][];
	int n;
	int ts[];
	int fs[];
	int dx[] = { 1, -1, 0, 0 };
	int dy[] = { 0, 0, 1, 1 };
	final int center = 100;
	int anss[];

	void init() {
		map = new Pair[center * 2 + 1][center * 2 + 1];
		for (int i = 0; i < map.length; i++) {
			Arrays.fill(map[i], new Pair(-1, 0));
		}
		ts = new int[n];
		fs = new int[n];

		for (int i = 0; i < n; i++) {
			ts[i] = sc.nextInt();
			fs[i] = sc.nextInt();
		}
		anss = new int[7];
	}

	void count() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				int m = map[i][j].top;
				if (m > 0)
					anss[m]++;
			}
		}
	}

	Dice[][] dm = new Dice[7][7];

	void run() {
		Dice d = new Dice();
		for (int i = 0; i < 4; i++) {
			d = d.North();
			for (int j = 0; j < 4; j++) {
				d = d.Right();
				dm[d.top][d.south] = d;
			}
		}

		d = new Dice().East();
		for (int j = 0; j < 4; j++) {
			d = d.Right();
			dm[d.top][d.south] = d;
		}
		d = d.East().East();
		for (int j = 0; j < 4; j++) {
			d = d.Right();
			dm[d.top][d.south] = d;
		}
		//System.out.println(Arrays.toString(dm));
		//System.out.println(dm.length);

		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			init();
			for (int i = 0; i < n; i++) {
				int top = ts[i];
				int front = fs[i];
				roll(top, front, map[center][center].height + 1, center, center);
			}
			count();
			boolean start = true;
			for (int i = 1; i <= 6; i++) {
				if (start)
					start = false;
				else
					System.out.print(" ");
				System.out.print(anss[i]);
			}
			System.out.println();
		}
	}

	// 続けて転がることができるかどうか返っす
	void roll(int top, int front, int height, int x, int y) {
		// System.out.println(x + " " + y + " " + height + " " + top);
		// 0,1,2,3 東西南北
		int m = -1; // 転がる方向の目
		int d = -1; // 転がる方向
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			// 転がる方向にあるサイコロ
			Pair nd = map[ny][nx];
			if (height - nd.height > 1) {
				int nm = dm[top][front].ds[i];
				if (m < nm) {
					m = nm;
					d = i;
				}
			}
		}
		if (m < 4) {
			map[y][x] = new Pair(top, height);
			// System.out.println("end");
			// System.out.println(x + " " + y + " " + height + " " + top);
			return;
		}
		int ntop = 7 - dm[top][front].ds[d];
		int nfront = 0;
		if (d == 0 || d == 1)
			nfront = front;
		else if (d == 2)
			nfront = top;
		else
			nfront = 7 - top;
		int nx = x + dx[d];
		int ny = y + dy[d];
		int nheight = map[ny][nx].height + 1;

		roll(ntop, nfront, nheight, nx, ny);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

class Pair {
	public int top;
	public int height;

	Pair(int t, int h) {
		top = t;
		height = h;
	}

	public String toString() {
		return "( " + top + " , " + height + " )";
	}

	public boolean equals(Pair q) {
		Pair p = this;
		return p.top == q.top && p.height == q.height;
	}
}

class Dice {
	public int top;
	public int bottom;
	public int east;
	public int west;
	public int south;
	public int north;
	public int[] ds = new int[4];

	Dice() {
		top = 1;
		south = 2;
		east = 3;
		bottom = 7 - top;
		west = 7 - east;
		north = 7 - south;
	}

	Dice(int t, int s, int e) {
		top = t;
		south = s;
		east = e;
		bottom = 7 - top;
		west = 7 - east;
		north = 7 - south;
		ds[0] = east;
		ds[1] = west;
		ds[2] = south;
		ds[3] = north;
	}

	public Dice North() {
		int south = bottom;
		int top = this.south;
		return new Dice(top, south, east);
	}

	public Dice East() {
		int east = this.top;
		int top = west;
		return new Dice(top, south, east);
	}

	public Dice West() {
		int east = bottom;
		int top = this.east;
		return new Dice(top, south, east);
	}

	public Dice South() {
		int south = this.top;
		int top = north;
		return new Dice(top, south, east);
	}

	public Dice Right() {
		int east = north;
		int south = this.east;
		return new Dice(top, south, east);
	}

	public Dice Left() {
		int south = west;
		int east = this.south;
		return new Dice(top, south, east);
	}

	public String toString() {
		return "east: " + east + "west: " + west + "top: " + top + "bottom: "
				+ bottom + "north: " + north + "south: " + south;
	}
}