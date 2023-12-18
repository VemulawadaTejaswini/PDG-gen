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
		while (true) {
			var flag = false;
			for (var i = 0; i < h; i++) {
				for (var j = 0; j < w; j++) {
					if (s[i][j] == number) {
						//System.out.printf("%d %d %d\r\n", i, j, number);
						check(s, i, j, number);
						flag = true;
					}
				}
			}
			if (!flag) {
				break;
			}
			number++;
		}

//		for (var i = 0; i < h; i++) {
//			for (var j = 0; j < w; j++) {
//				System.out.print(s[i][j] == -1 ? "*" : s[i][j]);
//			}
//			System.out.print("\r\n");
//		}

		var result = s[dh - 1][dw - 1] < 0 ? -1 : s[dh - 1][dw - 1] - 1;
		System.out.println(result);
	}

	public static void check(int[][] s, int i, int j, int number) {
		if (i > 0 && (s[i - 1][j] == 0 || s[i - 1][j] == number + 1)) {
			s[i - 1][j] = number;
			check(s, i - 1, j, number);
		}
		if (j > 0 && (s[i][j - 1] == 0 || s[i][j - 1] == number + 1)) {
			s[i][j - 1] = number;
			check(s, i, j - 1, number);
		}
		if (i < s.length - 1 && (s[i + 1][j] == 0 || s[i + 1][j] == number + 1)) {
			s[i + 1][j] = number;
			check(s, i + 1, j, number);
		}
		if (j < s[0].length - 1 && (s[i][j + 1] == 0 || s[i][j + 1] == number + 1)) {
			s[i][j + 1] = number;
			check(s, i, j + 1, number);
		}
		for (var x = i - 2; x <= i + 2; x++) {
			for (var y = j - 2; y <= j + 2; y++) {
				if (x >= 0 && x < s.length && y >= 0 && y < s[0].length && s[x][y] == 0) {
					s[x][y] = number + 1;
					//System.out.printf("***** %d %d %d %d %d\r\n", i, j, x, y, number + 1);
				}
			}
		}
	}
}
