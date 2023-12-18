import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		ContestScanner scan = new ContestScanner();

		final int n = scan.nextInt();
		final int k = scan.nextInt();
		final int[] wi = scan.nextIntArray(n);

		(new Solve(n, k, wi)).solve();
	}
}
class Solve {
	private final int n;
	private final int k;
	private final int[] wi;

	public Solve(final int n, final int k, final int[] wi)
	{
		this.n = n;
		this.k = k;
		this.wi = wi;
	}

	public void solve()
	{
		int sum = 0;
		int P = 0;
		int size = (n % k == 0) ? n / k : n / k + 1;

		int[] containers = new int[k];
		int[] containerSizeArray = new int[k];
		int[] containerPositions = new int[n];
		int[] containerEnd = new int[k];
		int[] sameCounts = new int[10001];
		int[] maxTable = new int[k];

		Arrays.fill(containers, 0);
		Arrays.fill(containerSizeArray, 0);
		Arrays.fill(sameCounts, 0);

		for(int i=0; i < n; i++) sum += wi[i];

		for(int i=0, j=0, count=0; i < n; i++)
		{
			containers[j] += wi[i];
			containerSizeArray[j]++;
			containerPositions[i] = j;
			P = Math.max(P, containers[j]);

			count++;
			if(count == size)
			{
				containerEnd[j] = i;
				count = 0;
				j++;
			}
		}

		int max = containers[k-1];

		for(int i=k-1; i >= 0; i--)
		{
			sameCounts[containers[i]]++;
			maxTable[i] = (containers[i] <= P) ? Math.max(max, containers[i]) : max;
		}

		P = choice(wi, n, k, sum, maxTable, P, 0, containers, containerSizeArray, containerPositions, containerEnd, sameCounts, 0);

		System.out.println(P);
	}

	public int choice(final int[] wi, final int n, final int k, final int sum, final int[] maxTable,
			int P, int max, int[] containers, int[] containerSizeArray, int[] containerPositions, int[] containerEnd, int[] sameCounts, final int index)
	{
		if(index >= k) return P;

		final int start = (index == 0) ? 0 : containerEnd[index - 1] + 1;
		final int end = containerEnd[index];

		if(start == end) return P;

		if(start > 0 && index > 0 && containerSizeArray[index] > 1)
		{
			final int w = containerPositions[start];

			sameCounts[containers[index]]--;
			containerSizeArray[index]--;
			containers[index] -= w;

			if(eval(n, containerSizeArray[index - 1] + 1, containers[index - 1] + w, sum) <= P)
			{
				sameCounts[containers[index - 1]]--;
				containerSizeArray[index]--;
				containerSizeArray[index - 1]++;
				containers[index - 1] += w;
				sameCounts[containers[index - 1]]++;
				containerPositions[start] = start - 1;
				final int nmax = Math.max(max, Math.max(containers[index - 1], containers[index]));
				if(sameCounts[P] == 0) P = (sameCounts[maxTable[index]] > 0) ? Math.min(P, Math.max(maxTable[index], nmax)) : Math.min(P, nmax);
				P = Math.min(P, choice(wi, n, k, sum, maxTable, P, nmax, containers, containerSizeArray, containerPositions, containerEnd, sameCounts, index + 1));
				containerPositions[start] = start;
				sameCounts[containers[index - 1]]--;
				containers[index - 1] -= w;
				containerSizeArray[index - 1]--;
				containerSizeArray[index]++;
				sameCounts[containers[index - 1]]++;
			}

			containers[index] += w;
			containerSizeArray[index]++;
			sameCounts[containers[index]]++;
		}

		if(end < n - 1 && index < k && containerSizeArray[index] > 1)
		{
			final int w = containerPositions[end];

			sameCounts[containers[index]]--;
			containerSizeArray[index]--;
			containers[index] -= w;

			if(eval(n, containerSizeArray[index + 1] + 1, containers[index + 1] + w, sum) <= P)
			{
				sameCounts[containers[index + 1]]--;
				containerSizeArray[index]--;
				containerSizeArray[index + 1]++;
				containers[index + 1] += w;
				sameCounts[containers[index + 1]]++;
				containerPositions[end] = end + 1;
				final int nmax = Math.max(max, Math.max(containers[index + 1], containers[index]));
				if(sameCounts[P] == 0) P = (sameCounts[maxTable[index]] > 0) ? Math.min(P, Math.max(maxTable[index], nmax)) : Math.min(P, nmax);
				P = Math.min(P, choice(wi, n, k, sum, maxTable, P, nmax, containers, containerSizeArray, containerPositions, containerEnd, sameCounts, index + 1));
				containerPositions[end] = end;
				sameCounts[containers[index + 1]]--;
				containers[index + 1] -= w;
				containerSizeArray[index + 1]--;
				containerSizeArray[index]++;
				sameCounts[containers[index + 1]]++;
			}

			containers[index] += w;
			containerSizeArray[index]++;
			sameCounts[containers[index]]++;
		}

		P = Math.min(P, choice(wi, n, k, sum, maxTable, P, Math.max(max, containers[index]), containers, containerSizeArray, containerPositions, containerEnd, sameCounts, index + 1));

		return P;
	}

	public int eval(final int n, final int currentContainerSize, final int weight, final int sum)
	{
		if(currentContainerSize == n) return sum;
		else return Math.max(weight, (sum - weight) / (n - currentContainerSize));
	}
}
class ContestScanner {
	BufferedReader reader;
	String[] line;
	int index;
	public ContestScanner() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public ContestScanner(String filename) throws FileNotFoundException {
		reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
	}

	public static interface ICreator<T> {
		public T createFromToken(final ContestScanner scanner) throws IOException;
	}

	public static interface IArrayInitializer {
		public void initialize(final ContestScanner scanner, final int i) throws IOException;
	}

	public static interface IObjectInitializer<T> {
		public T initialValue(final ContestScanner scanner);
	}

	public static class ObjectArrayInitializer<T> implements IArrayInitializer {
		protected T[] arr;
		protected final IObjectInitializer<T> initializer;

		private ObjectArrayInitializer(T[] arr, final IObjectInitializer<T> initializer)
		{
			this.arr = arr;
			this.initializer = initializer;
		}

		public static <T> ObjectArrayInitializer<T> create(T[] arr, final IObjectInitializer<T> initializer)
		{
			return new ObjectArrayInitializer<T>(arr, initializer);
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = initializer.initialValue(scanner);
		}

		public T[] getArray()
		{
			return this.arr;
		}
	}


	public static class ByteArrayInitializer implements IArrayInitializer {
		protected byte[] arr;

		private ByteArrayInitializer(final int n)
		{
			this.arr = new byte[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextByte();
		}

		public byte[] getArray()
		{
			return this.arr;
		}
	}

	public static class ShortArrayInitializer implements IArrayInitializer {
		protected short[] arr;

		private ShortArrayInitializer(final int n)
		{
			this.arr = new short[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextShort();
		}

		public short[] getArray()
		{
			return this.arr;
		}
	}

	public static class IntArrayInitializer implements IArrayInitializer {
		protected int[] arr;

		private IntArrayInitializer(final int n)
		{
			this.arr = new int[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextInt();
		}

		public int[] getArray()
		{
			return this.arr;
		}
	}

	public static class LongArrayInitializer implements IArrayInitializer {
		protected long[] arr;

		private LongArrayInitializer(final int n)
		{
			this.arr = new long[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextLong();
		}

		public long[] getArray()
		{
			return this.arr;
		}
	}

	public static class FloatArrayInitializer implements IArrayInitializer {
		protected float[] arr;

		private FloatArrayInitializer(final int n)
		{
			this.arr = new float[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextFloat();
		}

		public float[] getArray()
		{
			return this.arr;
		}
	}

	public static class DoubleArrayInitializer implements IArrayInitializer {
		protected double[] arr;

		private DoubleArrayInitializer(final int n)
		{
			this.arr = new double[n];
		}

		public void initialize(final ContestScanner scanner, final int i) throws IOException {
			this.arr[i] = scanner.nextDouble();
		}

		public double[] getArray()
		{
			return this.arr;
		}
	}

	public String nextToken() throws IOException {
		if(line == null || index >= line.length)
		{
			line = reader.readLine().trim().split(" ");
			index = 0;
		}

		return line[index++];
	}

	public String next() throws IOException {
		return nextToken();
	}

	public String readLine() throws IOException {
		line = null;
		index = 0;

		return reader.readLine();
	}

	public byte nextByte() throws IOException, NumberFormatException {
		return Byte.parseByte(nextToken());
	}

	public short nextShort() throws IOException, NumberFormatException {
		return Short.parseShort(nextToken());
	}

	public int nextInt() throws IOException, NumberFormatException {
		return Integer.parseInt(nextToken());
	}

	public long nextLong() throws IOException, NumberFormatException {
		return Long.parseLong(nextToken());
	}

	public float nextFloat() throws IOException, NumberFormatException {
		return Float.parseFloat(nextToken());
	}

	public double nextDouble() throws IOException, NumberFormatException {
		return Double.parseDouble(nextToken());
	}

	public <T> T nextObject(final ICreator<T> creator) throws IOException, NumberFormatException {
		return creator.createFromToken(this);
	}

	public int[] nextIntArray(final int N) throws IOException, NumberFormatException {
		int[] result = new int[N];

		for(int i=0; i < N; i++) result[i] = nextInt();

		return result;
	}

	public long[] nextLongArray(final int N) throws IOException, NumberFormatException {
		long[] result = new long[N];

		for(int i=0; i < N; i++) result[i] = nextLong();

		return result;
	}

	public float[] nexFloatArray(final int N) throws IOException, NumberFormatException {
		float[] result = new float[N];

		for(int i=0; i < N; i++) result[i] = nextFloat();

		return result;
	}

	public double[] nexDoubleArray(final int N) throws IOException, NumberFormatException {
		double[] result = new double[N];

		for(int i=0; i < N; i++) result[i] = nextDouble();

		return result;
	}

	public <T> T[] nextObjectArray(T[] result, final ICreator<T> creator) throws IOException, NumberFormatException {
		for(int i=0, N=result.length; i < N; i++) result[i] = nextObject(creator);

		return result;
	}

	public <T> ArrayList<T> nextGenericObjectArrayList(final int N, final ICreator<T> creator) throws IOException, NumberFormatException {
		ArrayList<T> result = new ArrayList<T>();
		for(int i=0; i < N; i++) result.add(nextObject(creator));

		return result;
	}

	public void nextTable(final int N, IArrayInitializer... arrayInitializers) throws IOException, NumberFormatException {
		for(int i=0; i < N; i++) for(IArrayInitializer initializer: arrayInitializers)
		{
			initializer.initialize(this, i);
		}
	}
}