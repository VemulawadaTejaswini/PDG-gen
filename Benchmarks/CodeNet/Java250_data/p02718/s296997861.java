import java.util.*;
import java.io.*;

public class Main {
	public void run() throws Exception {
		FastReader file = new FastReader();
		int n = file.nextInt(), m = file.nextInt();
		ArrayList<Integer> x= new ArrayList();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			x.add(file.nextInt());
			sum += x.get(i);
		}
		int tot = 4 * m;
		double cur = (double) sum / tot;
		int t = 0;
		for (int i = 0; i < x.size(); i++) {
			if (x.get(i) >= cur) t++;
		}
		System.out.println(t >= m ? "Yes" : "No");
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
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
}
