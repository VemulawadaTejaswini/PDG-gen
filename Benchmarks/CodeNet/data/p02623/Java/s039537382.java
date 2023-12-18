import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in);) {

			final int n = sc.nextInt();
			final int m = sc.nextInt();
			int k = sc.nextInt();

			final Long[] n_b = new Long[n];
			for (int i = 0; i < n; i++) {
				n_b[i] = sc.nextLong();
			}

			final Long[] m_b = new Long[m];
			for (int i = 0; i < m; i++) {
				m_b[i] = sc.nextLong();
			}

			int count=0;

			int offset_n=0;
			int offset_m=0;

			while(k!=0) {

				final Long nBook = getBook(n_b, offset_n);
				final Long mBook = getBook(m_b, offset_m);

				final long t;
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

		private static Long getBook(final Long[] books, final int offset) {
			if(books.length == offset) {
				return null;
			}
			return books[offset];
		}

}