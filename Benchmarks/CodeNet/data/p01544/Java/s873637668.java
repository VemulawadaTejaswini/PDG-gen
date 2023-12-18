import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	static int N;
	static int[] A;
	static int[] cum;

	void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];
		cum = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}
		cum[0] = A[0];
		for (int i = 1; i < N; ++i) {
			cum[i] = A[i] + cum[i - 1];
		}
		ArrayList<Array> arrs = new ArrayList<Array>();
		for (int left = 0; left < N; ++left) {
			for (int right = left; right < N; ++right) {
				int height = cum[right];
				if (left > 0)
					height -= cum[left - 1];
				arrs.add(new Array(height, left, right));
			}
		}

		Collections.sort(arrs);
		for (int i = 0; i < arrs.size(); ++i) {
			arrs.get(i).id = i;
		}
		Array[] pending = new Array[N + 1];
		for (int i = 0; i <= N; ++i) {
			pending[i] = new Array(-Integer.MAX_VALUE / 16, -1, -1);
			pending[i].cnt = -Integer.MAX_VALUE / 16;
			pending[i].id = -1;
			pending[i].src = -1;
		}
		for (Array arr : arrs) {
			if (arr.left == 0) {
				arr.src = -1;
				arr.cnt = 1;
			} else {
				arr.cnt = pending[arr.left].cnt + 1;
				arr.src = pending[arr.left].id;
			}
			if (pending[arr.right + 1].cnt < arr.cnt) {
				pending[arr.right + 1] = arr;
			}
		}

		System.out.println(pending[N].cnt);
		Array cur = pending[N];
		ArrayList<Integer> ans = new ArrayList<>();
		while (true) {
			ans.add(cur.right);
			if (cur.src == -1)
				break;
			cur = arrs.get(cur.src);
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = ans.size() - 2; i >= 0; --i) {
			pw.print(ans.get(i) + (i == 0 ? "\n" : " "));
		}
		pw.close();

	}

	static class Array implements Comparable<Array> {
		int left;
		int right;
		int src;
		int height;
		int cnt = -Integer.MAX_VALUE;
		int id = -1;

		public Array(int height, int left, int right) {
			this.height = height;
			this.left = left;
			this.right = right;
		}

		@Override
		public int compareTo(Array o) {
			if (height != o.height)
				return Integer.compare(height, o.height);
			else
				return -Integer.compare(left, o.left);
		}

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}