import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// Kの入力
		int K = sc.nextInt();
		
		// hiの評価
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int h = sc.nextInt();
			if (h >= K) {
				sum++;
			}
		}
		
		// 結果の出力
		System.out.println(sum);
		
		sc.close();
	}
}
