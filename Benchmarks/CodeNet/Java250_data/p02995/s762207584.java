import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static long gcd(long a, long b)
	{
		return b != 0 ? gcd(b, a % b) : a;
	}
	
	static long lcm(long a, long b)
	{
		return a / gcd(a, b) * b;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		
		long cc = b / c - (a - 1) / c;
		long dd = b / d - (a - 1) / d;
		long k = lcm(c, d);
		long cd = b / k - (a - 1) / k;
		
		out.println(b - a + 1 - cc - dd + cd);
		
		out.close();
	}
	
	static class InputReader
	{
		BufferedReader reader;
		StringTokenizer tokenizer;
		
		public InputReader(InputStream stream)
		{
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}
		
		public String next()
		{
			while(tokenizer == null || !tokenizer.hasMoreTokens())
			{
				try
				{
					tokenizer = new StringTokenizer(reader.readLine());
				}
				catch(IOException e)
				{
					throw new RuntimeException(e);
				}
			}
			
			return tokenizer.nextToken();
		}
		
		public int nextInt()
		{
			return Integer.parseInt(next());
		}
		
		public long nextLong()
		{
			return Long.parseLong(next());
		}
	}
}