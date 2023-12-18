
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		NavigableSet<Time> set = new TreeSet<Time>();
		while (n-- > 0)
			set.add(new Time(scanner.nextInt(), scanner.nextInt()));

		int m = scanner.nextInt();
		while (m-- > 0)
			set.add(new Time(scanner.nextInt(), scanner.nextInt()));
		System.out.print(set.pollFirst());
		while (!set.isEmpty())
			System.out.print(" " + set.pollFirst());
		System.out.println();
	}

	class Time implements Comparable<Time> {
		int h, m;

		public Time(int h, int m) {
			super();
			this.h = h;
			this.m = m;
		}

		@Override
		public String toString() {
			return String.format("%d:%02d", h, m);
		}

		@Override
		public int compareTo(Time o) {
			if (this.h == o.h)
				return this.m - o.m;
			return this.h - o.h;
		}

	}
}