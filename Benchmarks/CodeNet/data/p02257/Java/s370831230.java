import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		ContestScanner scan = new ContestScanner();

		int N = scan.nextInt();

		int[] Nums = new int[N];

		for(int i=0; i < N; i++)
		{
			Nums[i] = scan.nextInt();
		}

		(new Solve(N, Nums)).solve();
	}

}
class Solve {
	private final int N;
	private final int[] Nums;

	public Solve(final int N, final int[] Nums)
	{
		this.N = N;
		this.Nums = Nums;
	}

	public void solve()
	{
		int count = 0;

		for(int i=0; i < N; i++)
		{
			if(isPrime(Nums[i])) count++;
		}

		System.out.println(count);
	}

	public boolean isPrime(final int num)
	{
		if(num <= 2) return true;

		if(num <= 1 || num % 2 == 0) return false;

		int limit = (int)Math.ceil(Math.sqrt(num));
		int v = 3;

		do {
			if(v < num && num % v == 0) return false;

			v += 2;
		} while(v <= limit);

		return true;
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

	public int nextInt() throws IOException, NumberFormatException {
		return Integer.parseInt(nextToken());
	}

	public long nextLong() throws IOException, NumberFormatException {
		return Long.parseLong(nextToken());
	}

	public double nextDouble() throws IOException, NumberFormatException {
		return Double.parseDouble(nextToken());
	}

	public int[] nextIntArray(int N) throws IOException, NumberFormatException {
		int[] result = new int[N];

		for(int i=0; i < N; i++) result[i] = nextInt();

		return result;
	}

	public long[] nextLongArray(int N) throws IOException, NumberFormatException {
		long[] result = new long[N];

		for(int i=0; i < N; i++) result[i] = nextLong();

		return result;
	}

	public double[] nexDoubleArray(int N) throws IOException, NumberFormatException {
		double[] result = new double[N];

		for(int i=0; i < N; i++) result[i] = nextDouble();

		return result;
	}
}