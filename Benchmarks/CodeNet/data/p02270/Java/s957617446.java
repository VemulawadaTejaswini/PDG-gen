import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

		int[] containers = new int[k];
		int[] containerSizeArray = new int[k];
		int[] containerPositions = new int[n];

		for(int i=0; i < n; i++) sum += wi[i];

		for(int i=0, j=0; i < n; i++)
		{
			containers[j] += wi[i];
			containerSizeArray[j]++;
			containerPositions[i] = j;
			P = Math.max(P, containers[j]);
			++j;
			if(j >= k) j = 0;
		}

		for(int i=0; i < n; i++)
		{
			P = Math.min(P, choice(wi, n, k, sum, P, containers, containerSizeArray, containerPositions, i));
		}
		System.out.println(P);
	}

	public int choice(final int[] wi, final int n, final int k, final int sum,
			int P, int[] containers, int[] containerSizeArray, int[] containerPositions, final int index)
	{
		if(index >= n) return P;

		final int pos = containerPositions[index];

		final int w = wi[index];

		containers[pos] -= w;
		containerSizeArray[pos]--;

		int max = -1;
		int min = P;

		for(int i=k-1; i >= 0; i--)
		{
			max = Math.max(max, containers[i]);
			min = Math.min(min, containers[i] + w);

			if(eval(n, containerSizeArray[i] + 1, containers[i] + w, sum) <= P)
			{
				containers[i] += w;
				containerSizeArray[i]++;
				containerPositions[index] = i;

				P = Math.min(P, choice(wi, n, k, sum, P, containers, containerSizeArray, containerPositions, index + 1));

				containerPositions[index] = pos;
				containerSizeArray[i]--;
				containers[i] -= w;
			}
		}

		containers[pos] += w;
		containerSizeArray[pos]++;

		return Math.min(P, Math.max(max, min));
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