import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;				// 参加人数
		long k;						// 初期持ち点
		long[] points = new long[100000];	// 各参加者の持ち点
		int question;			// 問題数

		// 入力の受け取り
		num = scan.nextInt();
		k = scan.nextLong();
		question = scan.nextInt();
		k -= question;		// 実質的な初期持ち点 ここに正解数を足し、1以上なら勝ち抜けと考える

		// 参加者全員の持ち点を初期化
		for(int i = 0; i < num; i++) {
			points[i] = k;
		}

		// 正解者リストを受け取り、点数計算を行う
		for(int i = 0; i < question; i++) {
			points[scan.nextInt() - 1] += 1;
		}

		// 結果を表示する
		for(int i = 0; i < num; i++) {
			if(points[i] >= 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
}
