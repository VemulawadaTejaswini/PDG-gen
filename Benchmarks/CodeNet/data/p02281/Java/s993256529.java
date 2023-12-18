import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ContestScanner scan = new ContestScanner();

		final int n = scan.nextInt();
		final Node[] nodes = new Node[n];

		for(int i=0; i < n; i++)
		{
			nodes[i] = new Node(scan.nextInt(), scan.nextInt(), scan.nextInt());
		}

		(new Solve(n, nodes)).solve();
	}
}
class Solve {
	private final int n;
	private final Node[] nodes;

	public Solve(final int n, final Node[] nodes)
	{
		this.n = n;
		this.nodes = nodes;
	}

	public void solve()
	{
		Node[] nodeMap = new Node[n];
		Node[] childMap = new Node[n];

		for(int i=0; i < n; i++)
		{
			Node n = nodes[i];
			nodeMap[n.id] = n;
			if(n.l != -1) childMap[n.l] = n;
			if(n.r != -1) childMap[n.r] = n;
		}

		Node root = null;

		for(int i=0; i < n; i++)
		{
			if(childMap[nodes[i].id] == null)
			{
				root = nodeMap[nodes[i].id];
				break;
			}
		}

		StringBuilder sb = new StringBuilder();

		sb.append("Preorder\n");
		walkPreorder(n, nodes, nodeMap, childMap, root, sb);
		sb.append("\n");
		sb.append("Inorder\n");
		walkInorder(n, nodes, nodeMap, childMap, root, sb);
		sb.append("\n");
		sb.append("Postorder\n");
		walkPostorder(n, nodes, nodeMap, childMap, root, sb);
		System.out.println(sb.toString());
	}

	private void walkPreorder(final int n, final Node[] nodes,
								final Node[] nodeMap, final Node[] childMap,
											final Node node, final StringBuilder sb)
	{
		sb.append(" " + node.id);
		if(node.l != -1) walkPreorder(n, nodes, nodeMap, childMap, nodeMap[node.l], sb);
		if(node.r != -1) walkPreorder(n, nodes, nodeMap, childMap, nodeMap[node.r], sb);
	}

	private void walkInorder(final int n, final Node[] nodes,
								final Node[] nodeMap, final Node[] childMap,
											final Node node, final StringBuilder sb)
	{
		if(node.l != -1) walkInorder(n, nodes, nodeMap, childMap, nodeMap[node.l], sb);
		sb.append(" " + node.id);
		if(node.r != -1) walkInorder(n, nodes, nodeMap, childMap, nodeMap[node.r], sb);
	}

	private void walkPostorder(final int n, final Node[] nodes,
								final Node[] nodeMap, final Node[] childMap,
											final Node node, final StringBuilder sb)
	{
		if(node.l != -1) walkPostorder(n, nodes, nodeMap, childMap, nodeMap[node.l], sb);
		if(node.r != -1) walkPostorder(n, nodes, nodeMap, childMap, nodeMap[node.r], sb);
		sb.append(" " + node.id);
	}
}
class Node {
	public final int id;
	public final int l;
	public final int r;

	public Node(final int id, final int l, final int r)
	{
		this.id = id;
		this.l = l;
		this.r = r;
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