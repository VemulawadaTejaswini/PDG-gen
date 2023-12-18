import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in);) {

			final int n = sc.nextInt();
			final int m = sc.nextInt();
			int k = sc.nextInt();

			final Integer[] n_b = new Integer[n];
			for (int i = 0; i < n; i++) {
				n_b[i] = sc.nextInt();
			}

			final Integer[] m_b = new Integer[m];
			for (int i = 0; i < m; i++) {
				m_b[i] = sc.nextInt();
			}

			int count=0;

			int offset_n=0;
			int offset_m=0;

			while(k!=0) {

				final Integer nBook = getBook(n_b, offset_n);
				final Integer mBook = getBook(m_b, offset_m);

				final int t;
				if(nBook==null&&mBook==null) {
					break;

				}else if(nBook==null) {
					t=mBook;
					offset_m++;

				}else if(mBook==null) {
					t=nBook;
					offset_n++;

				}else {

					if(nBook <= mBook) {
						t = nBook;
						offset_n++;

					}else {
						t=mBook;
						offset_m++;
					}
				}

				if(k < t) {
					break;
				}

				count++;
				k-=t;
			}

			System.out.println(count);
		}
	}

		private static Integer getBook(final Integer[] books, final int offset) {
			if(books.length == offset) {
				return null;
			}
			return books[offset];
		}

}