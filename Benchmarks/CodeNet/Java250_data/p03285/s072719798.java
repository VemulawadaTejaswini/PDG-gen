import java.util.Scanner;

public class Main {

	static int N;
	static boolean match;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		dfs(0, 0);
		System.out.println(match ? "Yes" : "No");
	}

	static void dfs(int x, int y) {
		if (x * 4 + y * 7 > N)
			return;
		if (x * 4 + y * 7 == N) {
			match = match || true;
		}
		dfs(x + 1, y);
		dfs(x, y + 1);
	}
}
