import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		boolean[] bad = new boolean[N];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if (h[a] <= h[b]) {
				bad[a] = true;
			}
			if (h[a] >= h[b]) {
				bad[b] = true;
			}
		}
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (!bad[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
