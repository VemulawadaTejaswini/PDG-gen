import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int K = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();
		char[] T = sc.next().toCharArray();
		char[] takahashi = new char[N];

		long sum = 0;
		for (int i = 0; i < N; i++) {
			if (i >= K) {
				if (T[i - K] == T[i]) {
					boolean judge = false;
					switch (T[i]) {
					case 'r':
						if (takahashi[i - K] == 'p') {
							takahashi[i] = 'r';
							judge = true;
						}
						break;
					case 's':
						if (takahashi[i - K] == 'r') {
							takahashi[i] = 's';
							judge = true;
						}
						break;
					case 'p':
						if (takahashi[i - K] == 's') {
							takahashi[i] = 'p';
							judge = true;
						}
						break;
					}
					if (judge) {
						continue;
					}
				}
			}
			switch (T[i]) {
			case 'r':
				sum += P;
				takahashi[i] = 'p';
				break;
			case 's':
				sum += R;
				takahashi[i] = 'r';
				break;
			case 'p':
				sum += S;
				takahashi[i] = 's';
				break;
			}
		}

		// 結果の出力
		System.out.println(sum);

		sc.close();
	}
}
