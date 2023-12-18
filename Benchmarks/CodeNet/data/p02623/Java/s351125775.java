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
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextLong();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int i = 0, j = 0;
		long ans = 0;
		while ((i < n || j < m) && (k >= 0)) {
			long item1 = Long.MAX_VALUE, item2 = Long.MAX_VALUE;
			if (i < n) {
				item1 = a[i];
			}
			if (j < m) {
				item2 = b[j];
			}
			if (item1 < item2) {
				i++;
				k -= item1;
				if (k < 0)
					break;
				ans++;
			} else {
				j++;
				k -= item2;
				if (k < 0)
					break;
				ans++;
			}
		}
		System.out.println(ans);

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