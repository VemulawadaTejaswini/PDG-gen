import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		int[][] a = new int[h][w];
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		for(int i = 0 ; i < q ; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		// 値がどの盤面の値かをメモ
		long[] px = new long[h * w + 1];
		long[] py = new long[h * w + 1];
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				int value = a[i][j];
				px[value] = i;
				py[value] = j;
			}
		}
		// 盤面上の各値それぞれに対する魔力の合計値を求める
		long[] ruisekiwa = new long[90001];
		for(int i = d + 1 ; i <= h * w ; i++) {
			ruisekiwa[i] = ruisekiwa[i - d] + Math.abs(px[i] - px[i - d]) + Math.abs(py[i] - py[i - d]);
		}
		for(int i = 0 ; i < q ; i++) {
			System.out.println(ruisekiwa[r[i]] - ruisekiwa[l[i]]);
		}
	}
}
