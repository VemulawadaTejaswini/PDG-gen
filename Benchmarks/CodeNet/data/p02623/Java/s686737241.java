import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();

		ArrayList<Long> a_books = new ArrayList<Long>(N);
		for (int i = 0; i < N; i++) {
			a_books.add(sc.nextLong());
		}
		ArrayList<Long> b_books = new ArrayList<Long>(M);
		for (int i = 0; i < M; i++) {
			b_books.add(sc.nextLong());
		}

		int ans = 0;
		long total = 0L;
		while (total <= K) {
			long a_book_time = -1;
			if (!a_books.isEmpty()) {
				a_book_time = a_books.get(0);

			}
			long b_book_time = -1;
			if (!b_books.isEmpty()) {
				b_book_time = b_books.get(0);
			}

			if (a_book_time != -1 && a_book_time != -1) {
				if (a_book_time < b_book_time) {
					if (total + a_book_time <= K) {
						total += a_book_time;
						a_books.remove(0);
						ans++;
					}
					else {
						break;
					}
				}
				else {
					if (total + b_book_time <= K) {
						total += b_book_time;
						b_books.remove(0);
						ans++;
					}
					else {
						break;
					}
				}
			}
			else if (a_book_time != -1) {
				if (total + a_book_time <= K) {
					total += a_book_time;
					a_books.remove(0);
					ans++;
				}
				else {
					break;
				}
			}
			else if (b_book_time != -1) {
				if (total + b_book_time <= K) {
					total += b_book_time;
					b_books.remove(0);
					ans++;
				}
				else {
					break;
				}
			}
			else {
				break;
			}
		}

		System.out.println(ans);
	}

	private static class FastScanner {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;

		public FastScanner(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
			tokenizer = null;
		}

		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
