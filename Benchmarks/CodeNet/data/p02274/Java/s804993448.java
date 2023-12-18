import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			list.add(a[i]);
		}
		Collections.sort(list);
		sc.close();
		BinaryIndexedTree tree = new BinaryIndexedTree(N);

		int ans = 0;
		for (int i = 0; i < N; i++) {
			int idx = Collections.binarySearch(list, a[i]) + 1;
			ans += i - tree.sum(idx);
			tree.add(idx, 1);
		}
		System.out.println(ans);

	}

	static class BinaryIndexedTree {
		int N;
		int[] bit;

		public BinaryIndexedTree(int N) {
			this.N = N;
			bit = new int[N + 1];

		}

		public int sum(int i) {
			int sum = 0;
			while (i > 0) {
				sum += bit[i];
				i -= i & -i;
			}
			return sum;
		}

		public void add(int i, int x) {
			while (i <= N) {
				bit[i] += x;
				i += i & -i;
			}
		}
	}

}