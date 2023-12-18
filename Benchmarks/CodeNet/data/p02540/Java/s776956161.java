import java.io.*;
import java.util.*;

public class Main
{
	static final boolean INPUT_FROM_FILE = false;
	static final String INPUT_FILE = "input/input.txt";
	static final String OUTPUT_FILE = "input/output.txt";
	static FastReader in;
	static FastWriter out;

	static
	{
		try
		{
			in = new FastReader();
			out = new FastWriter();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	static long previous(long sum)
	{
		long low = 1, high = Math.min(10000000000L, sum);
		while ( low < high )
		{
			long num = (high - low);
			if(num%2 == 1) num++;
			long mid = low + num/2;
			long s = mid*(mid+1)/2;
			if ( s > sum ){
				high = mid-1;
			} else if ( s < sum ) {
				low = mid;
			} else {
				low = mid;
				break;
			}
		}
		return (low*(low+1))/2;
	}

	static class Pair implements Comparable<Pair>
	{
		int value, index;
		Pair(int v, int i)
		{
			value = v;
			index = i;
		}

		@Override
		public int compareTo(Pair p)
		{
			if(value == p.value)
			{
				return Integer.compare(index, p.index);
			}
			else
			{
				return Integer.compare(value, p.value);
			}
		}
	}

	static int countDFS(List<List<Integer>> graph, int u, int count, boolean[] visited)
	{
		visited[u] = true;
		for(int v : graph.get(u))
		{
			if(!visited[v])
			{
				count = countDFS(graph, v, count+1, visited);
			}
		}
		return count;
	}

	static void setDFS(List<List<Integer>> graph, int u, int count, boolean[] visited, int[] answer)
	{
		visited[u] = true;
		answer[u] = count;
		for(int v : graph.get(u))
		{
			if(!visited[v])
			{
				setDFS(graph, v, count, visited, answer);
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		int n = in.nextInt();
		int[] Y = new int[n+1];
		int[] X = new int[n+1];
		int[] xInput = new int[n];
		int[] answer = new int[n+1];
		TreeSet<Integer> yNext = new TreeSet<>();
		List<List<Integer>> graph = new ArrayList<>();

		for(int i=0; i<=n; i++) graph.add(new LinkedList<>());

		for(int i=0; i<n; i++)
		{
			int x = in.nextInt(), y = in.nextInt();
			Y[x] = y;
			X[y] = x;
			xInput[i] = x;
			yNext.add(y);
		}

		for(int i=1; i<=n; i++)
		{
			yNext.remove(Y[i]);
			Integer next = yNext.higher(Y[i]);
			if(next != null)
			{
				graph.get(i).add(X[next]);
				graph.get(X[next]).add(i);
			}
		}

		boolean[] visited1 = new boolean[n+1];
		boolean[] visited2 = new boolean[n+1];

		for(int i=1; i<=n; i++)
		{
			if(!visited1[i])
			{
				int count = countDFS(graph, i, 1, visited1);
				setDFS(graph, i, count, visited2, answer);
			}
		}

		for(int x : xInput)
		{
			out.println(answer[x]);
		}

		out.close();
	}

	static class FastReader
	{
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;
		private BufferedReader br;

		public FastReader() throws FileNotFoundException
		{
			if (INPUT_FROM_FILE)
			{
				this.stream = new FileInputStream(INPUT_FILE);
				br = new BufferedReader(new FileReader(INPUT_FILE));
			} else
			{
				this.stream = System.in;
				br = new BufferedReader(new InputStreamReader(System.in));
			}
		}

		public int read()
		{
			if (numChars == -1)
				throw new InputMismatchException();

			if (curChar >= numChars)
			{
				curChar = 0;
				try
				{
					numChars = stream.read(buf);
				}
				catch (IOException e)
				{
					throw new InputMismatchException();
				}

				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}

		public int nextInt()
		{
			int c = read();

			while (isSpaceChar(c))
				c = read();

			int sgn = 1;

			if (c == '-')
			{
				sgn = -1;
				c = read();
			}

			int res = 0;
			do
			{
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			while (!isSpaceChar(c));

			return res * sgn;
		}

		public long nextLong()
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-')
			{
				sgn = -1;
				c = read();
			}
			long res = 0;

			do
			{
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			while (!isSpaceChar(c));
			return res * sgn;
		}

		public double nextDouble()
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-')
			{
				sgn = -1;
				c = read();
			}
			double res = 0;
			while (!isSpaceChar(c) && c != '.')
			{
				if (c == 'e' || c == 'E')
					return res * Math.pow(10, nextInt());
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			if (c == '.')
			{
				c = read();
				double m = 1;
				while (!isSpaceChar(c))
				{
					if (c == 'e' || c == 'E')
						return res * Math.pow(10, nextInt());
					if (c < '0' || c > '9')
						throw new InputMismatchException();
					m /= 10;
					res += (c - '0') * m;
					c = read();
				}
			}
			return res * sgn;
		}

		public String readString()
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do
			{
				res.appendCodePoint(c);
				c = read();
			}
			while (!isSpaceChar(c));

			return res.toString();
		}

		public boolean isSpaceChar(int c)
		{
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public String next()
		{
			return readString();
		}

		public interface SpaceCharFilter
		{
			boolean isSpaceChar(int ch);
		}
	}

	static class FastWriter
	{
		BufferedWriter writer;
		StringBuilder sb;

		public FastWriter() throws IOException
		{
			if (INPUT_FROM_FILE) writer = new BufferedWriter(new FileWriter(OUTPUT_FILE));
			else writer = new BufferedWriter(new PrintWriter(System.out));
			sb = new StringBuilder();
		}

		public void print(Object obj)
		{
			sb.append(obj);
		}

		public void println(Object obj)
		{
			sb.append(obj).append('\n');
		}

		public void close() throws IOException
		{
			writer.write(sb.toString());
			writer.close();
		}
	}
}

