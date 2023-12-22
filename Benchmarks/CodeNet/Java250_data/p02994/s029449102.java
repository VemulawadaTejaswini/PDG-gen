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
		
		int n = in.nextInt();
		int l = in.nextInt();
		int s = 0;
		int z;
		for(int i = 1; i <= n; i++)
		{
			z = l + i - 1;
			s += z;
		}
		
		
		int max = Integer.MAX_VALUE;
		int res = -1;
		for(int i = 1; i <= n; i++)
		{
			int tmp = s - (l + i - 1);
			int cur = Math.abs(s - tmp);
			
			if(cur < max)
			{
				res = i;
				max = cur;
			}
		}
		
		out.println((s - (l + res - 1)));
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
	}
}