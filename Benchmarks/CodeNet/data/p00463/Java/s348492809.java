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

			int n = scan.nextInt();
			if (n == 0)
				break;
			int m = scan.nextInt();
			int h = scan.nextInt();
			int k = scan.nextInt();
			Amida a = new Amida(n, m, k);
			for (int i = 1; i <= n; i++)
				a.addScore(i, scan.nextInt());
			for (int i = 1; i <= m; i++)
				a.addH(i, scan.nextInt(), scan.nextInt());

			System.out.println(a.jscore());
		}

		scan.close();
		long stopCpuTime = threadMXBean.getCurrentThreadCpuTime();
		// System.out.println("CPU=" + (stopCpuTime - startCpuTime) / 1000000);

		System.exit(0);
	}
}

class Amida {
	class Bar {
		public Bar(int _a, int _b) {
			a = _a;
			b = _b;
		}

		int a, b, chg;
	}

	List<Bar> bar = new ArrayList<Bar>();

	int[] sc;
	boolean[] nu;

	public Amida(int n, int m, int k) {
		sc = new int[n + 1];
		nu = new boolean[n + 1];
		for (int i = 1; i <= k; i++)
			nu[i] = true;
	}

	class barCompare implements Comparator<Bar> {

		@Override
		public int compare(Bar o1, Bar o2) {
			if (o1.b > o2.b)
				return 1;
			else if (o1.b == o2.b)
				return 0;
			else
				return -1;
		}

	}

	public int jscore() {
		// this.sort();
		Collections.sort(bar, new barCompare());
		int s = this.down() - this.up();
		return s;
	}

	private int up() {
		int max = 0;
		for (int i = bar.size() - 1; i >= 0; i--) {
			int c = (sc[bar.get(i).a] - sc[bar.get(i).a + 1]) * bar.get(i).chg;
			if (c > max)
				max = c;
			int t = sc[bar.get(i).a];
			sc[bar.get(i).a] = sc[bar.get(i).a + 1];
			sc[bar.get(i).a + 1] = t;
		}

		return max;
	}

	private void sort() {
		for (int i = bar.size() - 2; i >= 0; i--)
			for (int j = i + 1; j < bar.size(); j++)
				if (bar.get(j - 1).b > bar.get(j).b) {
					int t = bar.get(j - 1).a;
					bar.get(j - 1).a = bar.get(j).a;
					bar.get(j).a = t;
					t = bar.get(j - 1).b;
					bar.get(j - 1).b = bar.get(j).b;
					bar.get(j).b = t;
				}
	}

	private int down() {
		for (int i = 0; i < bar.size(); i++) {
			if (nu[bar.get(i).a])
				if (nu[bar.get(i).a + 1])
					continue;
				else
					bar.get(i).chg = -1;
			else if (nu[bar.get(i).a + 1])
				bar.get(i).chg = 1;
			else
				continue;
			nu[bar.get(i).a] ^= true;
			nu[bar.get(i).a + 1] ^= true;
		}
		int s = 0;
		for (int i = 1; i < nu.length; i++)
			if (nu[i])
				s += sc[i];
		return s;
	}

	public void addH(int m, int a, int b) {
		bar.add(new Bar(a, b));
	}

	public void addScore(int n, int s) {
		sc[n] = s;
	}
}