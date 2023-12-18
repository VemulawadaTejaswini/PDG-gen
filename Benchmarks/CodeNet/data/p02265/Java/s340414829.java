import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class Main {
	public static void main(String[] args) throws IOException {
		final HashMap<String, CommandCreator<Integer>> commandMap = new HashMap<>();

		commandMap.put("insert", (arguments) -> new InsertCommand<Integer>(arguments));
		commandMap.put("delete", (arguments) -> new DeleteCommand<Integer>(arguments));
		commandMap.put("deleteFirst", (arguments) -> new DeleteFirstCommand<Integer>(arguments));
		commandMap.put("deleteLast", (arguments) -> new DeleteLastCommand<Integer>(arguments));

		ContestScanner scan = new ContestScanner();

		int n = scan.nextInt();
		(new Solve(n, scan.nextGenericObjectArrayList(n, (scanner) -> {
			String name = scan.next();
			if(name.equals("insert") || name.equals("delete")) return commandMap.get(name).create(new Integer[] { scan.nextInt() });
			else return commandMap.get(name).create(new Integer[] {});
		}))).solve();
	}
}
class Solve {
	private final int n;
	private final ArrayList<Command<Integer>> commands;

	public Solve(final int n, final ArrayList<Command<Integer>> commands)
	{
		this.n = n;
		this.commands = commands;
	}

	public void solve()
	{
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

		for(Command<Integer> command: commands) command.run(list);

		list.forEach((i, k) -> { if(i > 0) System.out.print(" "); System.out.print(k); });
		System.out.println("");
	}
}
class DoubleLinkedList<T> {
	private ListItem<T> first;
	private ListItem<T> last;

	public DoubleLinkedList()
	{
		first = null;
		last = null;
	}

	public void insert(T v)
	{
		if(first == null)
		{
			first = last = new ListItem<T>(v);
			first.next = null;
			last.prev = null;
		}
		else
		{
			ListItem<T> item = new ListItem<T>(v);
			item.next = first;
			first.prev = item;
			first = item;
		}
	}

	public int delete(T v)
	{
		ListItem<T> current = first;

		int i = 0;

		while(current != null)
		{
			if(current.value.equals(v))
			{
				if(current.prev != null)
				{
					current.prev.next = current.next;
					if(current.next != null) current.next.prev = current.prev;
					if(current == last) last = current.prev;
					current.prev = null;
					current.next = null;
				}
				else if(current.next != null)
				{
					current.next.prev = null;
					first = current.next;
					current.next = null;
				}
				else
				{
					current.next = current.prev = null;
					first = null;
					last = null;
				}
				break;
			}
			current = current.next;

			++i;
		}

		return current == null ? -1 : i;
	}

	public boolean deleteFirst()
	{
		if(first == null) return false;

		if(first.next == null)
		{
			first = null;
			last = null;
		}
		else
		{
			first.next.prev = null;
			first = first.next;
		}

		return true;
	}

	public boolean deleteLast()
	{
		if(last == null) return false;

		if(last.prev == null)
		{
			last = null;
			first = null;
		}
		else
		{
			last.prev.next = null;
			last = last.prev;
		}

		return true;
	}

	public void forEach(BiConsumer<Integer, T> callback)
	{
		ListItem<T> current = first;

		int i = 0;

		while(current != null)
		{
			callback.accept(i++, current.value);
			current = current.next;
		}
	}
}
class ListItem<T> {
	public final T value;
	public ListItem<T> prev;
	public ListItem<T> next;

	public ListItem(T v)
	{
		prev = null;
		next = null;
		value = v;
	}
}
interface CommandCreator<T> {
	public Command<T> create(T[] args);
}
abstract class Command<T> {
	public final T[] args;

	public Command(final T[] args)
	{
		this.args = args;
	}

	public abstract DoubleLinkedList<T> run(final DoubleLinkedList<T> list);
}
class InvaidArgmentsException extends RuntimeException {
	/**
	 *
	 */
	private static final long serialVersionUID = 6016589671519287010L;

	public InvaidArgmentsException(String message) { super(message); }
}
class InsertCommand<T> extends Command<T> {
	public InsertCommand(final T[] args)
	{
		super(args);
		if(args == null || args.length != 1) throw new InvaidArgmentsException("?????°?????°????????£??§??????");
	}
	@Override
	public DoubleLinkedList<T> run(final DoubleLinkedList<T> list)
	{
		list.insert(args[0]);
		return list;
	}
}
class DeleteCommand<T> extends Command<T> {
	public DeleteCommand(final T[] args)
	{
		super(args);
		if(args == null || args.length != 1) throw new InvaidArgmentsException("?????°?????°????????£??§??????");
	}
	public DoubleLinkedList<T> run(final DoubleLinkedList<T> list)
	{
		list.delete(args[0]);
		return list;
	}
}
class DeleteFirstCommand<T> extends Command<T> {
	public DeleteFirstCommand(final T[] args)
	{
		super(args);
		if(args == null || args.length != 0) throw new InvaidArgmentsException("?????°?????°????????£??§??????");
	}
	public DoubleLinkedList<T> run(final DoubleLinkedList<T> list)
	{
		list.deleteFirst();
		return list;
	}
}
class DeleteLastCommand<T> extends Command<T> {
	public DeleteLastCommand(final T[] args)
	{
		super(args);
		if(args == null || args.length != 0) throw new InvaidArgmentsException("?????°?????°????????£??§??????");
	}
	public DoubleLinkedList<T> run(final DoubleLinkedList<T> list)
	{
		list.deleteLast();
		return list;
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