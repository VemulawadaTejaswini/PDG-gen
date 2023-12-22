import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		ContestScanner scan = new ContestScanner();
		int N = scan.nextInt();
		int[] A = new int[N];

		for(int i=0; i < N; i++) A[i] = scan.nextInt();

		(new Solve(A, N)).solve();
	}
}

class Solve {
	private final int[] A;
	private final int N;

	public Solve(final int[] A, final int N)
	{
		this.A = A;
		this.N = N;
	}

	public void solve()
	{
		int count = 0;

		int[] sorted = new int[N];

		for(int i=0; i < N; i++) sorted[i] = A[i];

		for(int i=0, minj=0; i < N; i++)
		{
			minj = i;

			for(int j=i; j < N; j++)
			{
				if(sorted[j] < sorted[minj])
				{
					minj = j;
				}
			}

			if(i != minj)
			{
				int e = sorted[i];
				sorted[i] = sorted[minj];
				sorted[minj] = e;
				count++;
			}
		}

		for(int i=0; i < N; i++)
		{
			if(i > 0) System.out.print(" ");
			System.out.print(sorted[i]);
		}
		System.out.println("");
		System.out.println(count);
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