import java.util.HashSet;
import java.util.Scanner;

public class Main {
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
		s[ch - 1][cw - 1] = 1;
		var set = new HashSet<Integer>();
		set.add((ch - 1) * w + cw - 1);
		while (!set.isEmpty()) {
			var set2 = new HashSet<Integer>();
			for (var index : set) {
				check(s, index / w, index % w, number, set2);
			}
			number++;
			set = set2;
		}

		var result = s[dh - 1][dw - 1] < 0 ? -1 : s[dh - 1][dw - 1] - 1;
		System.out.println(result);
	}

	public static void check(int[][] s, int i, int j, int number, HashSet<Integer> set) {
		if (i > 0 && (s[i - 1][j] == 0 || s[i - 1][j] == number + 1)) {
			s[i - 1][j] = number;
			set.remove(i * s[0].length + j);
			check(s, i - 1, j, number, set);
		}
		if (j > 0 && (s[i][j - 1] == 0 || s[i][j - 1] == number + 1)) {
			s[i][j - 1] = number;
			set.remove(i * s[0].length + j);
			check(s, i, j - 1, number, set);
		}
		if (i < s.length - 1 && (s[i + 1][j] == 0 || s[i + 1][j] == number + 1)) {
			s[i + 1][j] = number;
			set.remove(i * s[0].length + j);
			check(s, i + 1, j, number, set);
		}
		if (j < s[0].length - 1 && (s[i][j + 1] == 0 || s[i][j + 1] == number + 1)) {
			s[i][j + 1] = number;
			set.remove(i * s[0].length + j);
			check(s, i, j + 1, number, set);
		}
		for (var x = i - 2; x <= i + 2; x++) {
			for (var y = j - 2; y <= j + 2; y++) {
				if (x >= 0 && x < s.length && y >= 0 && y < s[0].length && s[x][y] == 0) {
					s[x][y] = number + 1;
					set.add(x * s[0].length + y);
				}
			}
		}
	}
}
