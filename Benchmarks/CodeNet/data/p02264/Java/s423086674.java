import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.RuntimeErrorException;

public class Main {
	public static void main(String[] args) throws IOException {
		ContestScanner scan = new ContestScanner();
		final int n = scan.nextInt();
		final int q = scan.nextInt();

		(new Solve(n, q, scan.nextObjectArray(new Process[n], (scanner) -> new Process(scan.next(), scan.nextInt())))).solve();
	}
}
class Solve {
	public final int n;
	public final int q;
	public final Process[] processList;

	public Solve(final int n, final int q, final Process[] processList)
	{
		this.n = n;
		this.q = q;
		this.processList = processList;
	}

	public void solve()
	{
		Queue<Process> queue = new Queue<Process>();

		long time = 0;

		for(Process p: processList) queue.enqueue(p);

		while(!queue.isEmpty())
		{
			Process p = queue.dequeue();
			if(p.time <= q)
			{
				time += p.time;
				System.out.println(String.format("%s %d", p.name, time));
			}
			else
			{
				time += q;
				queue.enqueue(p.subtractTime(q));
			}
		}
	}
}
class Queue<T> {
	protected QueueItem<T> head;
	protected QueueItem<T> tail;

	public Queue()
	{
		this.head = null;
		this.tail = null;
	}

	public void enqueue(T item)
	{
		if(tail == null)
		{
			head = tail = new QueueItem<T>(item);
		}
		else
		{
			QueueItem<T> tailOld = tail;
			tail = new QueueItem<T>(item);
			tailOld.next = tail;
			tail.prev = tailOld;
		}
	}

	public T dequeue()
	{
		if(head == null) throw new RuntimeException("?????\???????????§??????");

		QueueItem<T> item = head;
		if(tail.prev == head) tail.prev = null;
		head = item.next;
		if(head == null) tail = null;
		return item.item;
	}

	public boolean isEmpty()
	{
		return head == null;
	}
}
class QueueItem<T> {
	public final T item;
	public QueueItem<T> next;
	public QueueItem<T> prev;

	public QueueItem(T item)
	{
		this.item = item;
		next = null;
		prev = null;
	}
}
class Process {
	public final String name;
	public final int time;

	public Process(final String name, final int time)
	{
		this.name = name;
		this.time = time;
	}

	public Process subtractTime(final int t)
	{
		return new Process(name, time - t);
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

	public <T> T nextObject(ICreator<T> creator) throws IOException, NumberFormatException {
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

	public <T> T[] nextObjectArray(T[] result, ICreator<T> creator) throws IOException, NumberFormatException {
		for(int i=0, N=result.length; i < N; i++) result[i] = nextObject(creator);

		return result;
	}

	public void nextColumns(final int N, IArrayInitializer... arrayInitializers) throws IOException, NumberFormatException {
		for(int i=0; i < N; i++) for(IArrayInitializer initializer: arrayInitializers)
		{
			initializer.initialize(this, i);
		}
	}
}