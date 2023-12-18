import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main
{
	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;
		public FastReader()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next()
		{
			while (st == null || !st.hasMoreElements())
			{
				try
				{
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt()
		{
			return Integer.parseInt(next());
		}
		long nextLong()
		{
			return Long.parseLong(next());
		}
		double nextDouble()
		{
			return Double.parseDouble(next());
		}
		String nextLine()
		{
			String str ="";
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
	}
	public static void main(String[] args)
	{
		FastReader fs=new FastReader();
		long a=fs.nextInt();
      	long b=fs.nextInt();
      	long c=fs.nextInt();
      	long d=fs.nextInt();
      	if(a>c)
        {
          swap(a,c);
          swap(b,d);
        }
      	if(c<=b)
        {
          System.out.println("Yes");
        }
      	else
      	{
       	 System.out.println("No");
      	}
	}
  public int swap(int g,int h)
  {
    int temp=g;
    g=h;;
    h=temp;
    return g,h;
  }
}
