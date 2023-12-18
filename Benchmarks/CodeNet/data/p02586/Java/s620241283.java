import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var r = sc.nextInt();
		var c = sc.nextInt();
		var k = sc.nextInt();
		var list = new ArrayList<Item>();
		for (var i = 0; i < k; i++) {
			list.add(new Main().new Item(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		sc.close();

		var v = new int[r][c];
		for (var i = 0; i < k; i++) {
			var item = list.get(i);
			v[item.getR() - 1][item.getC() - 1] = item.getV();
		}
		for (var i = 0; i < r; i++) {
			var rv = new int[c][5];
			for (var j = 0; j < c; j++) {
				for (var ic = 0; ic < 4; ic++) {
					if (ic == 0) {
						var rv1 = (i > 0 ? v[i - 1][j] : 0);
						var rv2 = (j > 0 ? rv[j - 1][0] : 0);
						var rv3 = (j > 0 ? rv[j - 1][1] : 0);
						if (v[i][j] > 0) {
							rv[j][1] = Math.max(Math.max(rv1 + v[i][j], rv2 + v[i][j]), rv3);
						} else {
							rv[j][0] = Math.max(rv1, rv2);
						}
					} else if (j > 0 && rv[j - 1][ic] > 0) {
						var rv2 = rv[j - 1][ic];
						if (v[i][j] > 0) {
							var rv3 = rv[j - 1][ic + 1];
							rv[j][ic + 1] = Math.max(rv2 + v[i][j], rv3);
						} else {
							rv[j][ic] = rv2;
						}
					}
				}
			}

			for (var j = 0; j < c; j++) {
				//System.out.printf("%d %d %d %d\r\n", rv[j][0], rv[j][1], rv[j][2], rv[j][3]);
				v[i][j] = Math.max(Math.max(Math.max(rv[j][0], rv[j][1]), rv[j][2]), rv[j][3]);
			}
			//System.out.println("----------");
		}
		System.out.println(v[r - 1][c - 1]);
	}

	public class Item {
		private int r;
		private int c;
		private int v;

		public Item(int r, int c, int v) {
			this.r = r;
			this.c = c;
			this.v = v;
		}

		public int getR() {
			return r;
		}

		public int getC() {
			return c;
		}

		public int getV() {
			return v;
		}
	}
}
