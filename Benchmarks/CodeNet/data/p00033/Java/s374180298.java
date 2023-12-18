import java.util.Scanner;
import java.util.Stack;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		for (int i = 0;i < t;i++) {
			solve();
		}
	}

	private static void solve() {
		int[] a = new int[10];
		for (int i = 0;i < 10;i++) {
			a[i] = sc.nextInt();
		}

		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		s1.push(a[0]);
		s2.push(a[1]);

		for (int i = 2;i < 10;i++) {
			int n1 = s1.peek();
			int n2 = s2.peek();
			int v = a[i];
			if (n1>n2) {
				if (v>n1) {
					s1.push(v);
				} else if (v>n2){
					s2.push(v);
				} else {
					System.out.println("NO");
					return;
				}
			} else {
				if (v>n2) {
					s2.push(v);
				} else if (v>n1){
					s1.push(v);
				} else {
					System.out.println("NO");
					return;
				}
			}
		}

		System.out.println("YES");
	}
}