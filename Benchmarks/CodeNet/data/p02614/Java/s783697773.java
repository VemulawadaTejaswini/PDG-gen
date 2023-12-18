import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var h = sc.nextInt();
		var w = sc.nextInt();
		var k = sc.nextInt();
		var c = new int[h][w];
		for (var i = 0; i < h; i++) {
			var text = sc.next();
			for (var j = 0; j < w; j++) {
				c[i][j] = text.substring(j, j + 1).equals("#") ? 1 : 0;
			}
		}
		sc.close();

		var result = 0;
		for (var i = 0; i < Math.pow(2, h); i++) {
			for (var j = 0; j < Math.pow(2, w); j++) {
				if (count(c, i, j) == k) {
					result++;
				}
			}
		}

		System.out.println(result);
	}

	private static int count(int[][] c, int wi, int wj) {
		var count = 0;
		for (var i = 0; i < c.length; i++) {
			if (!getBit(wi, i)) {
				continue;
			}
			for (var j = 0; j < c[i].length; j++) {
				if (!getBit(wj, j)) {
					continue;
				}
				if (c[i][j] == 1) {
					count++;
				}
			}
		}
		return count;
	}

	public static boolean getBit(int n, int d) {
		return ((n % (int) Math.pow(2, d + 1)) / ((int) Math.pow(2, d))) != 0;
	}
}
