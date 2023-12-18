import java.util.HashSet;
import java.util.Scanner;

public class Main {
	private static final int MAX_WIDTH = 1000;

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var h = sc.nextInt();
		var w = sc.nextInt();
		var ch = sc.nextInt();
		var cw = sc.nextInt();
		var dh = sc.nextInt();
		var dw = sc.nextInt();
		var s = new int[h][w];
		for (var i = 0; i < h; i++) {
			var rs = sc.next();
			for (var j = 0; j < w; j++) {
				s[i][j] = rs.substring(j, j + 1).equals(".") ? 0 : -1;
			}
		}
		sc.close();

		var number = 1;
		var set = new HashSet<Integer>();
		set.add(getPosition(ch - 1, cw - 1));
		while (!set.isEmpty()) {
			var set2 = new HashSet<Integer>();
			for (var p : set) {
				s[getH(p)][getW(p)] = number;
			}
			for (var p : set) {
				check(s, p, number, set2);
			}
			number++;
			set = set2;
		}

		var result = s[dh - 1][dw - 1] < 0 ? -1 : s[dh - 1][dw - 1] - 1;
		System.out.println(result);
	}

	private static void check(int[][] s, int p, int number, HashSet<Integer> set) {
		var h = s.length;
		var w = s[0].length;
		var ph = getH(p);
		var pw = getW(p);
		for (var i = ph - 2; i <= ph + 2; i++) {
			for (var j = pw - 2; j <= pw + 2; j++) {
				if (i >= 0 && i < h && j >= 0 && j < w) {
					var d = Math.abs(i - ph) + Math.abs(j - pw);
					if (d == 1 && s[i][j] == 0) {
						s[i][j] = number;
						set.remove(getPosition(i, j));
						check(s, getPosition(i, j), number, set);
					} else if (d > 1 && s[i][j] == 0) {
						set.add(getPosition(i, j));
					}
				}
			}
		}
	}

	private static int getPosition(int h, int w) {
		return h * MAX_WIDTH + w;
	}

	private static int getH(int p) {
		return p / MAX_WIDTH;
	}

	private static int getW(int p) {
		return p % MAX_WIDTH;
	}
}
