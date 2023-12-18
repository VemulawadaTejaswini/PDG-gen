import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException {
		FastReader sc = new FastReader();
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long a[] = new long[n];
		long b[] = new long[m];
		long prefix1[] = new long[n + 1];
		long prefix2[] = new long[m + 1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextLong();
		}
		for (int i = 1; i <= n; i++) {
			prefix1[i] = prefix1[i - 1] + a[i - 1];
		} for (int i = 1; i <= m; i++) {
			prefix2[i] = prefix2[i - 1] + b[i - 1];
		}
		long max = 0;
		for (int i = 1; i <= n; i++) {
			long x = k - prefix1[i];
			if (x < 0)
				break;
			long ans = bs(prefix2, x);

			ans += i;
			max = Math.max(ans, max);
		}
		System.out.println(max);


	}
	public static long bs(long prefix2[], long x) {
		int l = 1, r = prefix2.length - 1;
		long res = 0;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (prefix2[mid] <= x) {
				res = mid;
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return res;
	}
}





class FastReader {
	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(new
		                        InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException  e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}
