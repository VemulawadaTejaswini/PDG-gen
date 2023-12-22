import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int N = sc.nextInt();
		
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		
		// 入力チェック
		/*
		if (error) {
			System.out.println("無効な入力値です");
			return;
		}
		*/
		// 答えを出力
		int ans = 0;
		ans += h[0];
		for (int i = 1; i < N; i++) {
			if(h[i] > h[i-1]) {
				ans += h[i] - h[i-1];
			}
		}
		System.out.println(ans);
	}
}
