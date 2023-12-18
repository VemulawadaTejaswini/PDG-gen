import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		
		Set<String> S = new HashSet<>();
		for (int i = 0; i < N; i++) {
			S.add(sc.next());
		}
		
		// 結果の出力
		System.out.println(S.size());

		sc.close();
	}
}
