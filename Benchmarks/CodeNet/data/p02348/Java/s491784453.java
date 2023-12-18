
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int d = (int) Math.sqrt(n);
		int[] arr = new int[n];
		Arrays.fill(arr, (1 << 31) - 1);
		boolean[] edge = new boolean[(n + d - 1) / d];
		int[] rep = new int[(n + d - 1) / d];
		Arrays.fill(rep, (1 << 31) - 1);
		Arrays.fill(edge, false);
		while (q-- > 0) {
			int t = sc.nextInt();
			if (t == 1) {
				int i = sc.nextInt();
				if (!edge[i / d]) {
					System.out.println(rep[i / d]);
				} else {
					System.out.println(arr[i]);
				}
			} else {
				int src = sc.nextInt();
				int dst = sc.nextInt();
				int x = sc.nextInt();
				for (int i = src; i <= Math.min((src / d + 1) * d - 1, dst); ++i) {
					edge[i / d] = true;
					arr[i] = x;
				}
				for (int i = src / d + 1; i < dst / d; ++i) {
					edge[i] = false;
					rep[i] = x;
				}
				for (int i = dst / d * d; i <= dst; ++i) {
					edge[i / d] = true;
					arr[i] = x;
				}
			}
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}