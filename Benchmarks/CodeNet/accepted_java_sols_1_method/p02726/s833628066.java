import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();

		int[] ans = new int[N - 1];
		for (int i = 1; i <= N - 1; i++) { // 始点
			for (int j = i + 1; j <= N; j++) { // 終点
				int normal = j - i;
				int warp = Math.abs(i - X) + 1 + Math.abs(j - Y);
				int min = Math.min(normal, warp);
				ans[min - 1]++;
			}
		}

		for (int i = 0; i < N - 1; i++) {
			System.out.println(ans[i]);
		}
	}
}
