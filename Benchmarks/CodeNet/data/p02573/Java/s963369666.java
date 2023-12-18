import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] rel = new int[n];
			int[] cnt = new int[n];
			Arrays.fill(rel, -1);
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int min = Math.min(a, b);
				int max = Math.max(a, b);
				int parent = max;
				int minparent = min;
				while (true) {
					int next = rel[parent];
					if (next == -1) {
						break;
					}
					parent = next;
				}
				while (true) {
					int next = rel[minparent];
					if (next == -1) {
						break;
					}
					minparent = next;
				}
				if (parent > minparent) {
					rel[parent] = minparent;
				} else if (parent < minparent) {
					rel[minparent] = parent;
				}
			}
			int max = 1;
			for (int i = n - 1; i >= 0; i--) {
				int parent = rel[i];
				if (parent == -1) {
					max = Math.max(max, cnt[i] + 1);
					continue;
				}
				cnt[parent] += cnt[i] + 1;
				max = Math.max(max, cnt[parent]);
			}
			System.out.println(max);
		}
	}
}