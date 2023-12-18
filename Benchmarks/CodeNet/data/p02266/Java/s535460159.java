import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int n = str.length();

		Stack<Integer> stack1 = new Stack<>();
		Stack<Pair> stack2 = new Stack<>();

		int sum = 0;

		for (int i=0; i<n; i++) {
			if (str.charAt(i)=='\\') {
				stack1.push(i);
			} else if (str.charAt(i)=='/') {
				if (!stack1.isEmpty()) {
					int j = stack1.pop();
					int a = i - j;
					sum += a;
					while (!stack2.isEmpty()&&stack2.peek().left>j) {
						a += stack2.pop().area;
					}
					stack2.push(new Pair(j, a));
				}
			}
		}

		System.out.println(sum);

		int size = stack2.size();
		int[] areas = new int[size];
		for (int i=size-1; i>=0; i--) {
			areas[i] = stack2.pop().area;
		}
		System.out.print(size);
		for (int i=0; i<size; i++) {
			System.out.print(" "+areas[i]);
		}
		System.out.println();

		sc.close();
	}

	static class Pair {
		int left, area;
		public Pair (int left, int area) {
			this.left = left;
			this.area = area;
		}
	}

}