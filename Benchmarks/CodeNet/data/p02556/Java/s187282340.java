import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int max1 = Integer.MIN_VALUE, maxX1 = 0, maxY1 = 0;
		int max2 = Integer.MIN_VALUE, maxX2 = 0, maxY2 = 0;
		int max3 = Integer.MIN_VALUE, maxX3 = 0, maxY3 = 0;
		int max4 = Integer.MIN_VALUE, maxX4 = 0, maxY4 = 0;
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if(x[i] + y[i] > max1) {
				max1 = x[i] + y[i];
				maxX1 = x[i];
				maxY1 = y[i];
			}
			
			if(-x[i] + y[i] > max2) {
				max2 = x[i] + y[i];
				maxX2 = x[i];
				maxY2 = y[i];
			}
			
			if(x[i] - y[i] > max3) {
				max3 = x[i] + y[i];
				maxX3 = x[i];
				maxY3 = y[i];
			}
			
			if(-x[i] - y[i] > max4) {
				max4 = x[i] + y[i];
				maxX4 = x[i];
				maxY4 = y[i];
			}
		}
		
		int m = 0;
		for(int i = 0; i < n; i++) {
			m = Math.max(m, Math.abs(maxX1 - x[i]) + Math.abs(maxY1 - y[i]));
			m = Math.max(m, Math.abs(maxX2 - x[i]) + Math.abs(maxY2 - y[i]));
			m = Math.max(m, Math.abs(maxX3 - x[i]) + Math.abs(maxY3 - y[i]));
			m = Math.max(m, Math.abs(maxX4 - x[i]) + Math.abs(maxY4 - y[i]));
		}
		
		pw.println(m);
		pw.flush();
	}

	public static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		public Integer[] nextIntegerArray(int n) throws IOException {
			Integer[] array = new Integer[n];
			for (int i = 0; i < n; i++)
				array[i] = new Integer(nextInt());
			return array;
		}

		public long[] nextLongArray(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		public double[] nextDoubleArray(int n) throws IOException {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		public static int[] shuffle(int[] a) {
			int n = a.length;
			Random rand = new Random();
			for (int i = 0; i < n; i++) {
				int tmpIdx = rand.nextInt(n);
				int tmp = a[i];
				a[i] = a[tmpIdx];
				a[tmpIdx] = tmp;
			}
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
