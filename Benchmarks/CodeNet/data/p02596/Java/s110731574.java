import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int K = sc.nextInt();
		
		// Kが偶数なら -1 を出力して終了
		if (K % 2 == 0 || K % 5 == 0) {
			System.out.println(-1);
			sc.close();
			return;
		}
		
		int rem = 7;
		int index = 1;
		while (true) {
			if (rem % K == 0) {
				break;
			}
			rem = (rem % K) * 10 + 7;
			index++;
		}
		
		// 結果の出力
		System.out.println(index);
		
		sc.close();
	}
}
