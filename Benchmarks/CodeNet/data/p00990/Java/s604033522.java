import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] a;
	static boolean[] even = new boolean[7];
	static int[] evenV = new int[10];
	static int wildC = 0;
	static int ans = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			evenV[i] = i * 2;
			if (evenV[i] >= 10) {
				evenV[i] = evenV[i] - 9;
			}
		}
		int N = sc.nextInt();
		char[] ID = sc.next().toCharArray();
		int M = sc.nextInt();
		a = new int[M];
		for (int i = 0; i < M; ++i) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < N; ++i) {
			if (ID[N - 1 - i] != '*') {
				int v = ID[N - 1 - i] - '0';
				if (i % 2 != 0) {
					sum += evenV[v];
				} else {
					sum += v;
				}
			} else {
				even[wildC++] = i % 2 != 0;
			}
		}
		dfs(0, sum);
		System.out.println(ans);
	}

	static void dfs(int pos, int sum) {
		if (pos == wildC) {
			if (sum % 10 == 0) ++ans;
			return;
		}
		for (int i = 0; i < a.length; ++i) {
			dfs(pos + 1, sum + (even[pos] ? evenV[a[i]] : a[i]));
		}
	}

}