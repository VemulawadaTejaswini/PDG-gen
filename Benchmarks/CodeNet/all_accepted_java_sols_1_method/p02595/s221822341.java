import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		long D = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			long X = sc.nextInt();
			long Y = sc.nextInt();
			if ((D * D) >= ((X * X) + (Y * Y))) {
				count++;
			}
		}
		
		// 結果の出力
		System.out.println(count);
		
		sc.close();
	}
}
