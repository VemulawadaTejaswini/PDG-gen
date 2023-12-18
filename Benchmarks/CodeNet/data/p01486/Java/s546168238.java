import java.util.Scanner;

public class Main {
	private static final int MAX = 100000;
	private static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		sc.close();
		String mew = string;
		while (mew.indexOf("mew") != -1 && !mew.equals("mew")) {
			mew = mew.replaceAll("mew", "");
		}
		if (!mew.equals("mew")) {
			System.out.println("Rabbit");
			return;
		}
		System.out.println("Cat");
		return;
	}

	static void WarshallFloyd() {
		// 任意の2点間の最小時間を入れる
		int n = map.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 0) {
					map[i][j] = MAX;
				}
			}
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i != j) {
						map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
					}
				}
			}
		}
	}
}