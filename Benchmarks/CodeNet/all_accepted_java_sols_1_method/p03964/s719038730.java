import java.util.Scanner;

/**
 * 解説通り実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long nowT = 1, nowA = 1;
			for (int i = 0; i < n; i++) {
				int t = scanner.nextInt(), a = scanner.nextInt();
				long m = Math.max((nowT - 1 + t) / t, (nowA - 1 + a) / a);
				nowT = m * t;
				nowA = m * a;
			}
			System.out.println(nowT + nowA);
		}
	}
}
