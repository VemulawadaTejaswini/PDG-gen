import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int[] L = new int[N];
		
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					if (L[i] == L[j] || L[i] == L[k] || L[j] == L[k]) {
						continue;
					}
					if (L[i] + L[j] > L[k] && L[i] + L[k] > L[j] && L[j] + L[k] > L[i]) {
						count++;
					}
				}
			}
		}
		
		// 結果の出力
		System.out.println(count);
		
		sc.close();
	}
}
