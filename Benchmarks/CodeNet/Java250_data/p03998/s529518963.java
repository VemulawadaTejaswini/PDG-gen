import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) {
		InputReader scn = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		String s1 = scn.next(), s2 = scn.next(), s3 = scn.next();
		int u = 0, v = 0, w = 0, player = 1;
		char ch1, ch2, ch3;
		while (true) {
			if (player == 1) {
				if (u == s1.length()) {
					out.println("A");
					break;
				}
				ch1 = s1.charAt(u);
				u++;
				if (ch1 == 'a') {
					player = 1;
				} else if (ch1 == 'b')
					player = 2;
				else
					player = 3;
			}
			if (player == 2) {
				if (v == s2.length()) {
					out.println("B");
					break;
				}
				ch2 = s2.charAt(v);
				v++;
				if (ch2 == 'a') {
					player = 1;
				} else if (ch2 == 'b')
					player = 2;
				else
					player = 3;
			}
			if (player == 3) {
				if (w == s3.length()) {
					out.println("C");
					break;
				}
				ch3 = s3.charAt(w);
				w++;
				if (ch3 == 'a') {
					player = 1;
				} else if (ch3 == 'b')
					player = 2;
				else
					player = 3;
			}
		}
		out.close();
	}

	public static HashMap<String, Integer> CountFrequencies(String[] arr) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			String a = arr[i];
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}

//		for (String val : map.keySet()) {
//			String val1 = val;
//			int val2 = map.get(val);
//			if (val2 % 2 != 0) {
//				return false;
//			}
//		}
		return map;
	}

	public static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	public static ArrayList<String> GetSubSequences(String s) {
		if (s.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = s.charAt(0);
		String ms = s.substring(1);

		ArrayList<String> rr = GetSubSequences(ms);

		ArrayList<String> mr = new ArrayList<>();

		int t = rr.size();
		for (int i = 0; i < t; i++) {
			mr.add(rr.get(i));
			mr.add(ch + rr.get(i));

		}

		return mr;

	}

	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	public static int firstOccurence(int array1[], int low, int high, int x, int n) {
		if (low <= high) {
			int mid = low + (high - low) / 2;
			if ((mid == 0 || x > array1[mid - 1]) && array1[mid] == x)
				return mid;
			else if (x > array1[mid])
				return firstOccurence(array1, (mid + 1), high, x, n);
			else
				return firstOccurence(array1, low, (mid - 1), x, n);
		}
		return -1;
	}

	public static int lastOccurence(int array2[], int low, int high, int x, int n) {
		if (low <= high) {
			int mid = low + (high - low) / 2;
			if ((mid == n - 1 || x < array2[mid + 1]) && array2[mid] == x)
				return mid;
			else if (x < array2[mid])
				return lastOccurence(array2, low, (mid - 1), x, n);
			else
				return lastOccurence(array2, (mid + 1), high, x, n);
		}
		return -1;
	}

	public static boolean isPrime(long n) {
		if (n < 2)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		long sqrtN = (int) Math.sqrt(n) + 1;
		for (long i = 6L; i <= sqrtN; i += 6) {
			if (n % (i - 1) == 0 || n % (i + 1) == 0)
				return false;
		}
		return true;
	}

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		int left = lo;
		int right = hi;
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);
	}

	static class InputReader {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public String next() {
			return nextLine();
		}

		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}

	static class OutputWriter {
		private final PrintWriter writer;

		public OutputWriter(OutputStream outputStream) {
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
		}

		public OutputWriter(Writer writer) {
			this.writer = new PrintWriter(writer);
		}

		public void print(Object... objects) {
			for (int i = 0; i < objects.length; i++) {
				if (i != 0) {
					writer.print(' ');
//                    writer.print(1);
				}
				writer.print(objects[i]);
			}
		}

		public void println(Object... objects) {
			print(objects);
			writer.println();
		}

		public void close() {
			writer.close();
		}
	}

}
