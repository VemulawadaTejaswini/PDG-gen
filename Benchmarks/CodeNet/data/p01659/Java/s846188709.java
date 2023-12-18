import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;

	public static void main(String[] args) {
		int N = sc.nextInt();
		ArrayList<Integer> stack = new ArrayList<>();
		int ans = 1;
		stack.add(sc.nextInt());
		for (int i = 1; i < N; ++i) {
			int a = Integer.parseInt(sc.next());
			while (!stack.isEmpty()) {
				int top = stack.get(stack.size() - 1);
				if (top > a) {
					stack.remove(stack.size() - 1);
				} else {
					break;
				}
			}
			if (stack.isEmpty() || stack.get(stack.size() - 1) < a) {
				stack.add(a);
				++ans;
			}
		}
		System.out.println(ans);
	}
}