import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var v = new int[n][3];
		for (var i = 0; i < n; i++) {
			v[i][0] = sc.nextInt();
			v[i][1] = sc.nextInt();
			v[i][2] = sc.nextInt();
		}
		sc.close();

		for (var i = 0; i <= 101 * 101; i++) {
			var x = i / 101;
			var y = i % 101;
			var h = Integer.MAX_VALUE;
			for (var j = 0; j < n; j++) {
				h = Math.min(h, Math.abs(v[j][0] - x) + Math.abs(v[j][1] - y) + v[j][2]);
			}
			for (var j = 0; j < n; j++) {
				if (v[j][2] != Math.max(h - Math.abs(v[j][0] - x) - Math.abs(v[j][1] - y), 0)) {
					h = 0;
					break;
				}
			}
			if (h > 0) {
				System.out.printf("%d %d %d\r\n", x, y, h);
				break;
			}
		}
	}
}