import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int N = sc.nextInt();
		int[] H = new int[N];
		boolean error = false;
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
			// 入力チェック
			if (H[i] > 100 || H[i] < 1) {
				error = true;
			}
		}
		
		// 入力チェック
		if (N > 20 || N < 1) {
			System.out.println("無効な入力値です");
			return;
		}
		if (error) {
			System.out.println("無効な入力値です");
			return;
		}
		
		// 答えを出力
		int count = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			if (max <= H[i]){
				max = H[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
