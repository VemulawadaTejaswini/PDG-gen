import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		
		char[][] table = new char[H][W];
		for (int i = 0; i < H; i++) {
			table[i] = sc.next().toCharArray();
		}
		
		int count = 0;
		for (int i = 0; i < (1 << H); i++) {
			for (int j = 0; j < (1 << W); j++) {
				int black = 0;
				for (int k = 0; k < H; k++) {
					for (int l = 0; l < W; l++) {
						if (table[k][l] == '#' && (i >> k & 1) == 0 && (j >> l & 1) == 0) {
							black++;
						}
					}
				}
				if (black == K) {
					count++;
				}
			}
		}
		// 結果の出力
		System.out.println(count);
		
		sc.close();
	}
}
