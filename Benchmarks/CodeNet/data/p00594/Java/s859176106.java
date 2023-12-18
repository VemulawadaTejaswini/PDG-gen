import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] A = new int[1000000];
	static int[] stack = new int[1000000];

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			sc.nextLine();
			int ans = solve(N);
			if (ans == -1) {
				System.out.println("NO COLOR");
			} else {
				System.out.println(ans);
			}
		}
	}

	static int solve(int N) {
		String[] val = sc.nextLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(val[i]);
		}
		int pos = 0;
		for (int i = 0; i < N; ++i) {
			if (pos == 0 || stack[pos - 1] == A[i]) {
				stack[pos++] = A[i];
			} else {
				--pos;
			}
		}
		if (pos == 0) return -1;
		int count = 0;
		for (int i = 0; i < N; ++i) {
			if (A[i] == stack[0]) ++count;
		}
		return count > N / 2 ? stack[0] : -1;
	}

}