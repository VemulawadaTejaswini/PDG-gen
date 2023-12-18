import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			// 入力が0以下なら終了する。
			if(n < 1) break;

			// 入力がいくつ来るか事前にわかっているので、配列を用意して入れる。
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}

			// i番目の要素までの合計値をsum[i]に入れる。
			int[] sum = new int[n];
			sum[0] = a[0];
			for(int i = 1; i < n; i++) {
				sum[i] = a[i] + sum[i - 1];
			}

			// 問題で求める最大値をmaxに入れるために、Integer.MIN_VALUE（intで格納できる値で一番小さい値）で初期化する。
			int max = Integer.MIN_VALUE;

			// j番目からi番目までの合計はsum[i] - sum[j]で求まるので、これとmaxを比較してmaxのほうが小さいならば更新する。
			for(int i = 0; i < n; i++) {
				max = max > sum[i] ? max : sum[i];
				for(int j = 0; j < i; j++) {
					max = max > sum[i] - sum[j] ? max : sum[i] - sum[j];
				}
			}
			System.out.println(max);
		}

		scan.close();
	}

}

