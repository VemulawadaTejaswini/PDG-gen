import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// K, Xの入力
		int K = sc.nextInt();
		int X = sc.nextInt();
		
		// startとendの判定
		int start = Math.max(X-K+1, -1000000);
		int end = Math.min(X+K-1, 1000000);
		
		// 結果の出力
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
