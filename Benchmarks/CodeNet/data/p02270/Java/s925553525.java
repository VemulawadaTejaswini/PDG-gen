import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] w = new int[n];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			sum += w[i];
			max = Math.max(max, w[i]);
		}

		int first = max;
		int last = sum;
		int i = (first + last) / 2;
		while (last > first) {
			if (check(i, w) <= k) {
				last = i;
			} else {
				first = i + 1;
			}
			i = (first + last) / 2;
		}

		System.out.println(i);
		
		sc.close();
	}

	private static int check(int i, int[] w) {
		int count = 1;
		int sum = 0;
		for (int j = 0; j < w.length; j++) {
			if (w[j] > i) {
				return Integer.MAX_VALUE;
			} else {
				sum += w[j];
				if (sum > i) {
					sum = w[j];
					count++;
				}
			}
		}

		return count;
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		InputStreamReader isr;
		BufferedReader br;
		StreamTokenizer st;

		private Scanner() {
		}

		Scanner (InputStream in) {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			st = new StreamTokenizer(br);
		}

		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}

			return st.sval;
		}

		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}

			return (int)st.nval;
		}

		void close() {
		}
	}
}