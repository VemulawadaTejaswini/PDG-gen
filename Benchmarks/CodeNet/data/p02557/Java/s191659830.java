import java.util.Scanner;

public class Main {
	static int N;
	static int[] A;
	static int[] B;
	static int[] C;
	static int[] countArr;
	static int[] countArrA;

	// Shojin
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			N = sc.nextInt();
			A = new int[N];
			B = new int[N];
			C = new int[N];
			countArr = new int[10];
			countArrA = new int[10];
			for (int i = 0; i < N; i++) {
				int next = sc.nextInt();
				A[i] = next;
				countArrA[next]++;
			}
			for (int i = 0; i < N; i++) {
				int next = sc.nextInt();
				B[i] = next;
				countArr[next]++;
			}
			for (int i = 1; i <= N; i++) {
				if (countArr[i] + countArrA[i] > N) {
					System.out.println("No");
					return;
				}
			}
			int idx = 0;
			if (dfs(idx)) {
				System.out.println("Yes");
				for (int i = 0; i < N; i++) {
					System.out.print(C[i]);
					System.out.print(' ');
				}
			} else {
				System.out.println("No");
			}
		}
	}

	static boolean dfs(int idx) {
		if (idx == N) {
			return true;
		}
		for (int i = 1; i < 10; i++) {
			if (i == A[idx] || countArr[i] == 0) {
				continue;
			}
			countArr[i]--;
			C[idx] = i;
			idx++;
			if (!dfs(idx)) {
				countArr[i]++;
				idx--;
			} else {
				return true;
			}
		}
		return idx == N;
	}
}