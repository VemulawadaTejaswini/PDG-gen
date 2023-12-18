import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			Book[] books = new Book[N];
			for (int i = 0; i < N; ++i) {
				int r = sc.nextInt();
				int w = sc.nextInt();
				books[i] = new Book(r, w);
			}
			Arrays.sort(books);
			int sumR = 0;
			int sumW = 0;
			for (int i = 0; i < N; ++i) {
				sumR += books[i].r;
				sumW += books[i].w;
			}
			int maxR = books[N - 1].r;
			if (sumR - maxR < maxR) {
				int early = early(books, maxR - (sumR - maxR));
				System.out.println(Math.max(sumR + sumW, maxR * 2 + sumW - early));
			} else {
				System.out.println(sumR + sumW);
			}
		}
	}

	static int early(Book[] books, int time) {
		boolean[] ok = new boolean[time + 1];
		ok[0] = true;
		for (int i = 0; i < books.length - 1; ++i) {
			int w = books[i].w;
			for (int j = time; j - w >= 0; --j) {
				if (ok[j - w]) ok[j] = true;
			}
		}
		for (int i = time; i >= 0; --i) {
			if (ok[i]) return i;
		}
		return 0;
	}

	static class Book implements Comparable<Book> {
		int r, w;

		public Book(int r, int w) {
			this.r = r;
			this.w = w;
		}

		public int compareTo(Book o) {
			return this.r - o.r;
		}
	}

}