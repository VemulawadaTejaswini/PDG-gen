import java.io.File;
import java.io.FileNotFoundException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		long startCpuTime = threadMXBean.getCurrentThreadCpuTime();

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0540_input.txt"));

		while (scan.hasNext()) {

			int h = scan.nextInt();
			if (h == 0)
				break;
			int w = scan.nextInt();
			int n = scan.nextInt();
			Walk walk = new Walk(h, w);
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++)
					walk.set(i, j, scan.nextInt());
			int r = walk.end(n);
			if (r > 0)
				System.out.println((h + 1) + " " + r);
			else
				System.out.println((-1 * r) + " " + (w + 1));
		}

		scan.close();
		long stopCpuTime = threadMXBean.getCurrentThreadCpuTime();
		// System.out.println("CPU=" + (stopCpuTime - startCpuTime) / 1000000);

		System.exit(0);
	}
}

class Walk {
	int[][] cr;

	public Walk(int h, int w) {
		cr = new int[h][w];
	}

	public int end(int n) {
		for (int i = 1; i < n; i++)
			this.move(0, 0);
		return this.move(0, 0);
	}

	private int move(int h, int w) {
		if (h >= cr.length)
			return (w + 1);
		if (w >= cr[0].length)
			return (-1 * (h + 1));
		if (cr[h][w] == 0) {
			cr[h][w] = 1;
			return move(h + 1, w);
		} else {
			cr[h][w] = 0;
			return move(h, w + 1);
		}
	}

	public void set(int h, int w, int d) {
		cr[h][w] = d;
	}
}