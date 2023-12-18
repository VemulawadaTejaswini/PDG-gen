
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	long count = 0;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int min = Integer.MAX_VALUE;
		int[] A = new int[n];
		int max = -1;
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
			min = Math.min(min, A[i]);
			max = Math.max(max, A[i]);
		}
		int ans = 0;
		boolean[] V = new boolean[n];
		int[] B = Arrays.copyOf(A, A.length);
		Arrays.sort(B);
		int[] T = new int[max + 1];
		List<Integer> list  = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(B[i]);
		}
		for (int i = 0; i < n; i++) {
			int cur = i;
			int s = 0;
			int m = max;
			int an = 0;
			while (true) {
				V[cur] = true;
				an++;
				int v = A[cur];
				m = Math.min(m, v);
				s += v;
				cur = list.indexOf(v);
				if (V[cur])
					break;
			}
			int a = s + (an - 2) * m;
			int b = m + s + (an + 1) * min;
			ans += Math.min(a, b);
		}
		System.out.println(ans);
	}
}