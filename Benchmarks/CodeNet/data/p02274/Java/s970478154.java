import java.util.Scanner;

public class BIT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		BinaryIndexedTree tree = new BinaryIndexedTree(N);

		int ans = 0;
		for (int i = 0; i < N; i++) {
			ans += i - tree.sum(a[i]);
			tree.add(a[i], 1);
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