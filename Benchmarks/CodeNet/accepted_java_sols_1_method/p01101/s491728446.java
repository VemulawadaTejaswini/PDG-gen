import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, m;
		Scanner src = new Scanner(System.in);

		while(true) {
			n = src.nextInt();
			m = src.nextInt();
			if(n == 0 && m == 0)	break;
			int[] item = new int[1100];	// 全アイテム
			int[][] vertex = new int[1100][1100];
			int maxSum = 0;

			//	アイテムを入力
			for(int i = 0; n > i; i++) {
				item[i] = src.nextInt();
			}

			//	組み合わせの決定（表を作る）
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i == j)	continue;	// 同じものは表中で0になる
					vertex[j][i] = item[j] + item[i];
				}
			}

			//	合計金額の最大値を求める
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(m >= vertex[j][i] && maxSum < vertex[j][i]) {
						//	最大値の更新
						maxSum = vertex[j][i];
					}
				}
			}
			//	NONEの判定
			if(maxSum == 0) {
				System.out.println("NONE");
				continue;
			}
			System.out.println(maxSum);
		}

	}

}

