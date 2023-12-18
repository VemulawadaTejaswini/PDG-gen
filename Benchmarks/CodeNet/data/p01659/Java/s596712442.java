import java.util.Scanner;
import java.util.Stack;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int N = sc.nextInt();
		int height[] = new int[N + 1];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			height[i] = sc.nextInt();
		}
		Stack<Rect> stack = new Stack<Rect>();
		height[N] = 0;
		for (int i = 0; i <= N; i++) {
			Rect rect = new Rect(height[i], i);
			if (stack.isEmpty() || stack.peek().height < height[i]) {
				stack.push(rect);
			} else if (stack.peek().height > height[i]) {
				while (!stack.isEmpty() && stack.peek().height > height[i]) {
					stack.pop();
					ans++;
				}
				if (stack.isEmpty() || stack.peek().height != rect.height) {
					stack.push(rect);
				}
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	class Rect {
		long height;
		int pos;

		Rect(long height, int pos) {
			this.height = height;
			this.pos = pos;
		}
	}
}