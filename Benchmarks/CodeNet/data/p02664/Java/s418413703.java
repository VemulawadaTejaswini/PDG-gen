//package main.java;
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
import static java.lang.Math.*;
public class Main implements Runnable
{
	public void run()
	{
		InputReader sc = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		char s[] = sc.next().toCharArray();
		int n = s.length;
		if(s[0] == '?')
			s[0] = 'P';
		for (int i = 1 ; i < n ; i++){
			if(s[i] == '?'){
				if(s[i - 1] == 'P')
					s[i] = 'D';
				else
					s[i] = 'P';
			}
		}
		w.println(s);
		w.flush();
		w.close();
	}
	static class f{
		public static long power(long x, int y){
			long res = 1;
			while (y > 0)
			{
				if ((y & 1) == 1)
					res = (res*x);
				y = y >> 1;
				x = x * x;
			}
			return res;
		}
		public static void sort(long[] arr) {
			int n = arr.length, mid, h, s, l, i, j, k;
			long[] res = new long [n];
			for (s = 1; s < n; s <<= 1) {
				for (l = 0; l < n - 1; l += (s << 1)) {
					h = Math.min(l + (s << 1) - 1, n - 1);
					mid = Math.min(l + s - 1, n - 1);
					i = l;
					j = mid + 1;
					k = l;
					while (i <= mid && j <= h)
						res[k++] = (arr[i] <= arr[j] ? arr[i++] : arr[j++]);
					while (i <= mid)
						res[k++] = arr[i++];
					while (j <= h)
						res[k++] = arr[j++];
					for (k = l; k <= h; k++)
						arr[k] = res[k];
				}
			}
		}
		public static long gcd(long a, long b)
		{
			if (a == 0)
				return b;
			return gcd(b % a, a);
		}

		public static long findGCD(long arr[], int n)
		{
			long result = arr[0];
			for (int i = 1; i < n; i++)
				result = gcd(arr[i], result);
			return result;
		}
	}
	static class InputReader
	{
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;
		private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public InputReader(InputStream stream)
		{
			this.stream = stream;
		}

		public int read()
		{
			if (numChars==-1)
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

				if(numChars <= 0)
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

			while(isSpaceChar(c))
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
				if(c<'0'||c>'9')
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
			public boolean isSpaceChar(int ch);
		}
	}
	public static void main(String args[]) throws Exception
	{
		new Thread(null, new Main(),"Main",1<<27).start();
	}
}