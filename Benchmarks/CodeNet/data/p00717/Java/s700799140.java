import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			Polyline base = new Polyline(sc);
			for (int i = 1; i <= N; ++i) {
				Polyline it = new Polyline(sc);
				if (equal(base, it) || equal(base, it.rev())) {
					System.out.println(i);
				}
			}
			System.out.println("+++++");
		}
	}

	static boolean equal(Polyline pa, Polyline pb) {
		if (!Arrays.equals(pa.len, pb.len)) return false;
		for (int i = 0; i < 4; ++i) {
			boolean ok = true;
			for (int j = 0; j < pa.dir.length; ++j) {
				if (pa.dir[j] != (pb.dir[j] + i) % 4) {
					ok = false;
					break;
				}
			}
			if (ok) return true;
		}
		return false;
	}

	static class Polyline {

		int[] dir;
		int[] len;

		Polyline(Scanner sc) {
			int m = sc.nextInt();
			dir = new int[m - 1];
			len = new int[m - 1];
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int i = 0; i < m - 1; ++i) {
				int nx = sc.nextInt();
				int ny = sc.nextInt();
				if (nx < x) {
					dir[i] = 0;
				} else if (ny < y) {
					dir[i] = 1;
				} else if (x < nx) {
					dir[i] = 2;
				} else {
					dir[i] = 3;
				}
				len[i] = Math.abs(x - nx) + Math.abs(y - ny);
				x = nx;
				y = ny;
			}
		}

		Polyline() {
		}

		Polyline rev() {
			Polyline ret = new Polyline();
			int m = this.dir.length;
			ret.dir = new int[m];
			ret.len = new int[m];
			for (int i = 0; i < m; ++i) {
				ret.dir[i] = (this.dir[m - 1 - i] + 2) % 4;
				ret.len[i] = this.len[m - 1 - i];
			}
			return ret;
		}
	}

}