import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D[] = new int[N];
		for (int i = 0; i < N; i++) {
			D[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int T[] = new int[M];
		for (int i = 0; i < M; i++) {
			T[i] = sc.nextInt();
		}

		Arrays.sort(D);
		Arrays.sort(T);

		int js = 0;
		String ans = "YES";
		LOOP: for (int i = 0; i < M; i++) {

			for (int j = js; j < N; j++) {
				if (D[j] == T[i]) {
					js = j+1;
					continue LOOP;
				}
			}
			ans = "NO";
			break;
		}

		System.out.println(ans);
	}
}
