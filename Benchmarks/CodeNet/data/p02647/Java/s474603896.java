import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] aArr = new int[n];
		int[] countLight = new int[n];

		for (int i = 0; i < n; i++) {
			aArr[i] = sc.nextInt();
			countLight[i] = 0;
		}

		while (k > 0) {
			for (int i = 1; i <= aArr.length; i++) {
				// 電球の照らす範囲
				int lightD = i - aArr[i - 1];
				int lightU = i + aArr[i - 1];
				// 照らされている数を数える
				for (int j = lightD; j <= lightU; j++) {
					if (0 < j && j <= n) {
						countLight[j - 1]++;
					}
				}
				aArr[i - 1] = countLight[i - 1];
			}
			k--;
			for (int i = 0; i < n; i++) {
				aArr[i] = countLight[i];
				countLight[i] = 0;
			}
		}

		// 出力
		for (int i = 0; i < aArr.length - 1; i++) {
			System.out.print(aArr[i] + " ");
		}
		System.out.println(aArr[n - 1]);
	}
}