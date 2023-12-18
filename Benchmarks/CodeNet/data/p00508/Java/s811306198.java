import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 全ての点を読み込む
		int n = sc.nextInt();
		long[][] points = new long[n][n];
		for (int i = 0; i < n; i++) {
			points[i][0] = sc.nextInt();
			points[i][1] = sc.nextInt();
		}
		// xの値でソート
		Arrays.sort(points, new Comparator<long[]>(){
			@Override
			public int compare(long[] p1, long[] p2) {
				return Long.compare(p1[0], p2[0]);
			}
		});
		// 初期の最大値
		double l = Float.MAX_VALUE;
		long sq = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++){
				long[] p1 = points[i];
				long[] p2 = points[j];
				if (p2[0] - p1[0] > l) break;
				long dx = p2[0] - p1[0];
				long dy = p2[1] - p1[1];
				long sq_tmp = dx * dx + dy * dy;
				if (sq_tmp < sq) {
					sq = sq_tmp;
					l = Math.sqrt(sq);
				}
			}
		}
		System.out.println(sq);
	}
}

