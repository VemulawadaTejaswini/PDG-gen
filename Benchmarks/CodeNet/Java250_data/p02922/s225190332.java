import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		
		out.close();
	}
	
	static class TaskB
	{
		void solve(int TestCase, InputReader in, PrintWriter out)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int ans = 0;
			int tmp = 0;
			
			if(b == 1)
			{
				out.println("0");
			}
			else
			{
				for(int i = 1; i <= 20; i++)
				{
					if(a * i - tmp >= b)
					{
						out.println(i);
						return;
					}
					tmp++;
				}
			}
		}
	}
	
	static class InputReader
	{
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		
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
	}
}