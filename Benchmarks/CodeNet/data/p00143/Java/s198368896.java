import java.util.Scanner;

public class Main {
	static class Pos {
		int x, y;

		Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}

		static Pos vector(Pos a1, Pos a2) {
			return new Pos(a2.x - a1.x, a2.y - a1.y);
		}

		static int cross(Pos a, Pos b) {
			return a.x * b.y - a.y * b.x;
		}

		static int check(Pos a, Pos t, Pos x) {
			int cross1 = cross(a, t);
			int cross2 = cross(a, x);

			return cross1 * cross2;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Pos p[] = new Pos[3];
		Pos x;
		Pos y;

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				p[j] = new Pos(sc.nextInt(), sc.nextInt());
			}
			x = new Pos(sc.nextInt(), sc.nextInt());
			y = new Pos(sc.nextInt(), sc.nextInt());

			boolean in1 = true;
			boolean in2 = true;
			for (int j = 0; j < 3; j++) {
				Pos v1 = Pos.vector(p[j], p[(j + 1) % 3]);
				Pos v2 = Pos.vector(p[j], p[(j + 2) % 3]);
				Pos v3 = Pos.vector(p[j], x);
				Pos v4 = Pos.vector(p[j], y);
				if (Pos.check(v1, v2, v3) <= 0) {
					in1 = false;
				}
				if (Pos.check(v1, v2, v4) <= 0) {
					in2 = false;
				}
			}

			if (in1 != in2) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}
}