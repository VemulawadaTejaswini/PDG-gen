import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, K;
	static int[][] g;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			int[] stack = new int[N + 1];
			int top = 0;
			int color = sc.nextInt();
			for (int i = 1; i < N; ++i) {
				int cur = sc.next().charAt(0) - '0';
				if (color == cur) continue;
				color = cur;
				if (i % 2 == 0) {
					stack[top++] = i;
				} else {
					if (top > 0) --top;
				}
			}
			stack[top++] = N;
			int ans = 0;
			int cur = 0;
			for (int i = 0; i < top; ++i) {
				if (i % 2 == 0) ans += stack[i] - cur;
				cur = stack[i];
			}
			if (color == 0 ^ top % 2 != 0) ans = N - ans;
			System.out.println(ans);
		}
	}

}