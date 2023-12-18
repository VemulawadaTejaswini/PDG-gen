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

		static int check(Pos a, Pos t, Pos x) {
			int cross1 = a.x * t.y - a.y * t.x;
			int cross2 = a.x * x.y - a.y * x.x;

			return cross1 * cross2;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Pos p[] = new Pos[3];
		Pos x[] = new Pos[2];

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				p[j] = new Pos(sc.nextInt(), sc.nextInt());
			}
			for (int j = 0; j < 2; j++) {
				x[j] = new Pos(sc.nextInt(), sc.nextInt());
			}

			boolean flag[] = {true, true};
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					Pos v1 = Pos.vector(p[k], p[(k + 1) % 3]);
					Pos v2 = Pos.vector(p[k], p[(k + 2) % 3]);
					Pos v3 = Pos.vector(p[k], x[j]);
					if (Pos.check(v1, v2, v3) <= 0) {
						flag[j] = false;
					}
				}
			}
			
			if (flag[0] != flag[1]) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}
}