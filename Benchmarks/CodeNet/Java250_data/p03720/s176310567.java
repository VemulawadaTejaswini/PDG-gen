import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
		return;
	}

	private void solve() {
		// 入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int roads[] = new int[N + 1];
		for (int i = 0; i < M; i++) {
			roads[sc.nextInt()]++;
			roads[sc.nextInt()]++;
		}
		sc.close();

		// 出力
		for (int i = 1; i < roads.length; i++) {
			System.out.println(roads[i]);
		}

		return;
	}
}
