import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static int[] dx = { 0, 1, 0,-1};
	static int[] dy = { 1, 0,-1, 0};
	
	static void rec(ArrayList[][] list, Dice d, int y, int x) {
		int dir = -1, max = 0;
		for (int k=0; k<4; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (d.face[k] >= 4 && list[ny][nx].size() < list[y][x].size() && max < d.face[k]) {
				max = d.face[k];
				dir = k;
			}
		}
		if (dir == -1) {
			list[y][x].add(d);
		} else {
			d.rotate(dir);
			rec(list, d, y + dy[dir], x + dx[dir]);
		}
	}

	static boolean solve() {
		int n = in.nextInt();
		if (n == 0) return false;

		ArrayList<Dice>[][] list = new ArrayList[100][100];

		for (int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				list[i][j] = new ArrayList<Dice>();
			}
		}

		for (int i=0; i<n; i++) {
			int t = in.nextInt();
			int f = in.nextInt();
			rec(list, new Dice(t, f), 50, 50);
		}

		int[] cnt = new int[6];

		for (int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				if (list[i][j].size() > 0) {
					Dice d = list[i][j].get(list[i][j].size()-1);
					cnt[d.face[Dice.TOP] - 1]++;
				}
			}
		}

		for (int i=0; i<5; i++) {
			out.print(cnt[i] + " ");
		}
		out.println(cnt[5]);

		return true;
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.currentTimeMillis();

		while(solve());
		out.flush();

		long end = System.currentTimeMillis();
		dump((end-start) + "ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}

class Dice implements Cloneable{

	public static final int TOP = 4;
	public static final int BOTTOM = 5;
	public static final int FRONT = 2;
	public static final int BACK = 0;
	public static final int LEFT = 3;
	public static final int RIGHT = 1;

	public static final int[][] roll = {
		{TOP,FRONT,BOTTOM,BACK},//+y
		{TOP,LEFT,BOTTOM,RIGHT},//+x
		{TOP,BACK,BOTTOM,FRONT},//-y
		{TOP,RIGHT,BOTTOM,LEFT},//-x

		{FRONT,RIGHT,BACK,LEFT},//cw
		{FRONT,LEFT,BACK,RIGHT},//ccw
	};

	public static final int[] dx = {1,0,-1,0};
	public static final int[] dy = {0,1,0,-1};

	final int[] face;

	public Dice() {
		this.face = new int[6];
		this.face[TOP] = 1; this.face[BOTTOM] = 6; this.face[FRONT] = 2;
		this.face[BACK] = 5; this.face[LEFT] = 4; this.face[RIGHT] = 3;
	}
	public Dice(int top, int front) {
		this.face = new int[6];
		this.face[TOP] = top; this.face[FRONT] = front;
		this.face[BOTTOM] = 7 - top; this.face[BACK] = 7 - front;

		if (top == 1 && front == 2) {
			this.face[LEFT] = 4; this.face[RIGHT] = 3;
		} else if (top == 1 && front == 3) {
			this.face[LEFT] = 2; this.face[RIGHT] = 5;
		} else if (top == 1 && front == 4) {
			this.face[LEFT] = 5; this.face[RIGHT] = 2;
		} else if (top == 1 && front == 5) {
			this.face[LEFT] = 3; this.face[RIGHT] = 4;
		} else if (top == 2 && front == 1) {
			this.face[LEFT] = 3; this.face[RIGHT] = 4;
		} else if (top == 2 && front == 3) {
			this.face[LEFT] = 6; this.face[RIGHT] = 1;
		} else if (top == 2 && front == 4) {
			this.face[LEFT] = 1; this.face[RIGHT] = 6;
		} else if (top == 2 && front == 6) {
			this.face[LEFT] = 4; this.face[RIGHT] = 3;
		} else if (top == 3 && front == 1) {
			this.face[LEFT] = 5; this.face[RIGHT] = 2;
		} else if (top == 3 && front == 2) {
			this.face[LEFT] = 1; this.face[RIGHT] = 6;
		} else if (top == 3 && front == 5) {
			this.face[LEFT] = 6; this.face[RIGHT] = 1;
		} else if (top == 3 && front == 6) {
			this.face[LEFT] = 2; this.face[RIGHT] = 5;
		} else if (top == 4 && front == 1) {
			this.face[LEFT] = 2; this.face[RIGHT] = 5;
		} else if (top == 4 && front == 2) {
			this.face[LEFT] = 6; this.face[RIGHT] = 1;
		} else if (top == 4 && front == 5) {
			this.face[LEFT] = 1; this.face[RIGHT] = 6;
		} else if (top == 4 && front == 6) {
			this.face[LEFT] = 5; this.face[RIGHT] = 2;
		} else if (top == 5 && front == 1) {
			this.face[LEFT] = 4; this.face[RIGHT] = 3;
		} else if (top == 5 && front == 3) {
			this.face[LEFT] = 1; this.face[RIGHT] = 6;
		} else if (top == 5 && front == 4) {
			this.face[LEFT] = 6; this.face[RIGHT] = 1;
		} else if (top == 5 && front == 6) {
			this.face[LEFT] = 3; this.face[RIGHT] = 4;
		} else if (top == 6 && front == 2) {
			this.face[LEFT] = 3; this.face[RIGHT] = 4;
		} else if (top == 6 && front == 3) {
			this.face[LEFT] = 5; this.face[RIGHT] = 2;
		} else if (top == 6 && front == 4) {
			this.face[LEFT] = 2; this.face[RIGHT] = 5;
		} else if (top == 6 && front == 5) {
			this.face[LEFT] = 4; this.face[RIGHT] = 3;
		}
	}
	public Dice(int[] nums) {
		this.face = nums.clone();
	}

	public void rotate(int dir) {
		int temp = face[roll[dir][0]];
		for (int i=0; i<3; i++) {
			face[roll[dir][i]] = face[roll[dir][i+1]];
		}
		face[roll[dir][3]] = temp;
	}

	static void swap(Dice d1, Dice d2) {
		for (int i=0; i<6; i++) {
			int temp = d1.face[i];
			d1.face[i] = d2.face[i];
			d2.face[i] = temp;
		}
	}

	public boolean equals(Dice d) {
		return  this.face[TOP] == d.face[TOP] && this.face[BOTTOM] == d.face[BOTTOM]
			&& this.face[FRONT] == d.face[FRONT] && this.face[BACK] == d.face[BACK]
			&& this.face[LEFT] == d.face[LEFT] && this.face[RIGHT] == d.face[RIGHT];
	}

	public String toString() {
		return Arrays.toString(face);
	}

	@Override
	public Dice clone() {
		return new Dice(this.face);
	}
}