import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		// 計算
		int max = 0;
		for (int i = 1; i < N; i++) {
			String X = S.substring(0, i);
			String Y = S.substring(i);
			String[] split = X.split("");
			HashSet<String> mapX = new HashSet<String>();
			for (int j = 1; j < split.length; j++) {
				mapX.add(split[j]);
			}
			int count = 0;
			for (String charX : mapX) {
				if (Y.contains(charX)) {
					count++;
				}
			}
			if (count > max) {
				max = count;
			}
		}

		// 出力
		System.out.println(max);

		return;
	}
}
