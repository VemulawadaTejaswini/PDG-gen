import java.util.stream.IntStream;

public class Main {
	private static int n;
	private static int m;
	private static long k;
	private static long[] a;
	private static long[] b;
	private static Integer readNum[][];

	public static void main(String[] args) {

		input();
		// inputTest();
		readNum = new Integer[a.length + 1][];
		IntStream.range(0, a.length + 1)
				.forEach(i -> readNum[i] = new Integer[b.length + 1]);

		System.out.println(read(0, 0, 0));
		// System.out.println(read());
	}

	public static void input() {
		var sc = new java.util.Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextLong();
		a = new long[n];
		IntStream.range(0, n).forEach(i -> a[i] = sc.nextLong());
		b = new long[m];
		IntStream.range(0, m).forEach(i -> b[i] = sc.nextLong());
	}

	public static void inputTest() {
		n = m = 200000;
		k = 1000000000;
		a = new long[n];
		b = new long[m];
		for (int i = 0; i < n; i++) {
			a[i] = 1;
			b[i] = 1;
		}
		System.out.println("teststart");
	}

	public static int read() {
		int compA = 0;
		int compB = 0;
		int readMax = 0;
		long readTime = 0;
		// a only
		for (int i = 1; i <= a.length; i++) {
			readTime += a[i - 1];
			if (k < readTime) {
				readTime -= a[i - 1];
				compA = i - 1;
				break;
			} else {
				compA = i;
			}
		}
		readMax = compA;
		// System.out.println(readMax+","+readTime);
		for (int i = compA ; i >= 0; i--,compA--) {
			for (int j = compB+1; j <= b.length; j++) {
				readTime += b[j - 1];
				if (k < readTime) {
					readTime -= b[j - 1];
					compB = j - 1;
					break;
				} else {
					compB = j;
				}
			}
			// System.out.println(compA + "," + compB + "," + readTime);
			readMax = Math.max(readMax, compA + compB);

			if(i-1>0) {
				readTime -= a[i-1];
			}
		}
		return readMax;
	}

	public static int read(int compX, int compY, long compTime) {
		if (readNum[compX][compY] != null) {
			return readNum[compX][compY];
		}
		if (compTime > k) {
			return readNum[compX][compY] = 0;
		}
		int readThis = readNum(compX, compY);
		if (compTime == k) {
			return readNum[compX][compY] = readThis;
		} else {
			int readA = 0;
			if (a.length > compX) {
				long readATime = a[compX];
				readA = read(compX + 1, compY, compTime + readATime);
			}
			int readB = 0;
			if (b.length > compY) {
				long readTime = b[compY];
				readB = read(compX, compY + 1, compTime + readTime);
			}

			return readNum[compX][compY] = Math.max(readThis, Math.max(readA, readB));
		}
	}

	public static int readNum(int compX, int compY) {
		return compX + compY;
	}
}
