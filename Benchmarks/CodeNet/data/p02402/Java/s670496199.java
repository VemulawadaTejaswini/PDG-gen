import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();//整数の数
		int n[] = new int[num];//配列
		long sum = 0;
		int max = n[0];//最大値
		int min = n[0];//最小値

		//配列の格納
		for (int i = 0; i < n.length; i++) {
			int x = sc.nextInt();//格納する数字
			n[i] = x;

		}

		for (int i = 0; i < n.length; i++) {

			//最大値
			if (max < n[i]) {
				max = n[i];

			}

			//最小値
			if (min > n[i]) {
				min = n[i];

			}

			//初回のみ最大値と最小値の入力
			if (i == 0) {
				max = n[i];
				min = n[i];
			}

			//合計
			sum = sum + n[i];
		}
		//出
		System.out.println(min + " " + max + " " + sum);
	}
}

