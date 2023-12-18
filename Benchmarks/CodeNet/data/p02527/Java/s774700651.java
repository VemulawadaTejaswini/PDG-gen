import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
		a = new MaxHeapSort(a).sortedArray();
		for (int i = 0; i < n; ++i) {
			System.out.print(a[i] + (i == n - 1 ? "\n" : " "));
		}
	}

	class MaxHeapSort {
		int n;
		int[] v;

		public MaxHeapSort(int[] v_) {
			v = Arrays.copyOf(v_, v_.length);
			n = v_.length;
			for (int i = n; i >= 0; --i) {
				maxHeapify(i);
			}
		}

		int[] sortedArray() {
			int sz=n;
			int[] ret = new int[sz];
			for (int i = 0; i < sz; ++i) {
				ret[sz - 1 - i] = poll();
			}
			return ret;
		}

		int poll() {
			int ret = v[0];
			v[0] = v[n - 1];
			v[n - 1] = ret;
			--n;
			maxHeapify(0);
			return ret;
		}

		void maxHeapify(int cur) {
			if (2 * cur + 1 >= n)
				return;
			if (v[cur] >= v[2 * cur + 1] && (2 * cur + 2 >= n || v[cur] >= v[2 * cur + 2])) {
				return;
			}
			int dst = -1;
			if (2 * cur + 2 >= n || v[2 * cur + 1] >= v[2 * cur + 2]) {
				dst = 2 * cur + 1;
			} else {
				dst = 2 * cur + 2;
			}
			int tmp = v[cur];
			v[cur] = v[dst];
			v[dst] = tmp;
			maxHeapify(dst);
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}