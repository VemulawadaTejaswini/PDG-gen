import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int x, y;
	static int px, py;
	static int mem;
	static int dir;
	static int loop[][][][];
	static String s[];

	static Queue<Q> queue = new LinkedList<Q>();

	static class Q {
		int px, py, mem, dir;

		Q(int px, int py, int mem, int dir) {
			this.px = px;
			this.py = py;
			this.mem = mem;
			this.dir = dir;
		}
	}

	public static boolean f(int px_, int py_, int mem_, int dir_) {
		if (loop[px_][py_][mem_][dir_] == 1) {
			return false;
		}
		if (s[py_].charAt(px_) == '@') {
			return true;
		}
		
		boolean f = false;
		while (true) {
			if (loop[px_][py_][mem_][dir_] == 1) {
				break;
			}
			if (s[py_].charAt(px_) == '@') {
				f = true;
				break;
			}
			loop[px_][py_][mem_][dir_] = 1;
			px = px_;
			py = py_;
			mem = mem_;
			dir = dir_;
			move();
			px_ = px;
			py_ = py;
			mem_ = mem;
			dir_ = dir;
			if (dir_ == 0) {
				px_ = (px_ + 1) % x;
			} else if (dir_ == 1) {
				py_ = (py_ + 1) % y;
			} else if (dir_ == 2) {
				px_ = (px_ + x - 1) % x;
			} else if (dir_ == 3) {
				py_ = (py_ + y - 1) % y;
			}
		}
		if (f) {
			return true;
		}
		while (!queue.isEmpty()) {
			Q q = queue.poll();
			if (f(q.px, q.py, q.mem, q.dir)) {
				return true;
			}
		}
		return false;
	}

	public static void move() {
		if (s[py].charAt(px) == '<') {
			dir = 2;
		} else if (s[py].charAt(px) == '>') {
			dir = 0;
		} else if (s[py].charAt(px) == '^') {
			dir = 3;
		} else if (s[py].charAt(px) == 'v') {
			dir = 1;
		} else if (s[py].charAt(px) == '_') {
			if (mem == 0) {
				dir = 0;
			} else {
				dir = 2;
			}
		} else if (s[py].charAt(px) == '|') {
			if (mem == 0) {
				dir = 1;
			} else {
				dir = 3;
			}
		} else if (s[py].charAt(px) == '?') {
			queue.add(new Q((px + 1) % x, py, mem, 0));
			queue.add(new Q((px + x - 1) % x, py, mem, 2));
			queue.add(new Q(px, (py + 1) % y, mem, 1));
			queue.add(new Q(px, (py + y - 1) % y, mem, 3));
		} else if ('0' <= s[py].charAt(px) && s[py].charAt(px) <= '9') {
			mem = s[py].charAt(px) - '0';
		} else if (s[py].charAt(px) == '+') {
			mem = (mem + 1) % 16;
		} else if (s[py].charAt(px) == '-') {
			mem = (mem + 15) % 16;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		y = sc.nextInt();
		x = sc.nextInt();
		s = new String[y];
		for (int i = 0; i < y; i++) {
			s[i] = sc.next();
		}
		px = py = 0;
		mem = 0;
		dir = 0;
		loop = new int[x + 1][y + 1][16][4];

		if (f(px, py, mem, dir)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}