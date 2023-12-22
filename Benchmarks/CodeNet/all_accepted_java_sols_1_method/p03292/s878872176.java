import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// A1-A3を受け付ける
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// 3通りの絶対値を格納する配列Xを作成する

		int x[] = new int[3];
		x[0] = Math.abs(a[0] - a[1]);
		x[1] = Math.abs(a[1] - a[2]);
		x[2] = Math.abs(a[2] - a[0]);
		// 3通りの絶対値を合計する
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		// 3通りの中で最も大きいものを合計から引く
		int max1 = Math.max(x[0], x[1]);
		int trueMax = Math.max(max1, x[2]);
		int min_cost = sum - trueMax;
		// 最低コストmin_costを出力する
		System.out.println(min_cost);
	}
}
