import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int H = sc.nextInt();
		int N = sc.nextInt();
		
		// 必殺技のダメージ合計値
		int sum = 0;
		for (int i=0; i<N; i++) {
			sum += sc.nextInt();
		}
		
		// 結果の出力
		System.out.println(H - sum > 0? "No": "Yes");
		
		sc.close();
	}

}
