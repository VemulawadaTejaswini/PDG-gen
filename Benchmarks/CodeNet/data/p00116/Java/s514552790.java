import java.util.Scanner;
import java.util.Stack;

public class Main {
	static class S {
		int pos;
		int height;

		S(int pos, int height) {
			this.pos = pos;
			this.height = height;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack<S> stack = new Stack<S>();
		int a[][];
		int h, w;
		int max;

		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}

			a = new int[h][w];
			max = 0;
			for (int i = 0; i < h; i++) {
				String s = sc.next();
				for (int j = 0; j < w; j++) {
					if (s.charAt(j) == '*') {
						a[i][j] = 0;
					} else if (s.charAt(j) == '.') {
						if (i == 0) {
							a[i][j] = 1;
						} else {
							a[i][j] = a[i - 1][j] + 1;
						}
					}
				}
			}

			stack.clear();
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					S s = new S(j, a[i][j]);
					if (stack.isEmpty()) {
						stack.push(s);
					} else if (stack.peek().height < s.height) {
						stack.push(s);
					} else if (s.height < stack.peek().height) {
						while (!stack.isEmpty() && s.height <= stack.peek().height) {
							S s2 = stack.pop();
							int sum = s2.height * (j - s2.pos);
							s.pos = s2.pos;
							max = (max < sum) ? sum : max;
						}
						stack.push(s);
					}
				}
				int fPos = w;
				while (!stack.isEmpty()) {
					S s = stack.pop();
					int sum = s.height * (fPos - s.pos);
					max = (max < sum) ? sum : max;
				}
			}

			System.out.println(max);
		}
	}
}