import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int K = sc.nextInt();
		Set<Integer> kids = new HashSet<>();
		for (int i = 0; i < K; i++) {
			int d = sc.nextInt();
			for (int j = 0; j < d; j++) {
				kids.add(sc.nextInt());
			}
		}
		// 結果の出力
		System.out.println(N - kids.size());

		sc.close();
	}
}
