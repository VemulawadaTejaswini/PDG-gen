import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String s = "";
			while(true)
			{
				BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
				s = d.readLine();
				break;
			}
			StringTokenizer sz = new StringTokenizer(s, " ");
			int[] inp = new int[sz.countTokens()];
			for(int i = 0; sz.hasMoreTokens(); i++)
			{
				String sd = sz.nextToken();
				inp[i] = Integer.valueOf(sd);
			}
			inp = sort(inp);
			for(int i = 0; i < inp.length; i++)
			{
				System.out.print(inp[i]);
				if(i != inp.length - 1)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("Input Error");
		}
	}

	private static int[] sort(int[] ins)
	{
		for(int i = 0; i < ins.length - 1; i++)
		{
			for(int j = 0; j < ins.length - 1 - i; j++)
			{
				if(ins[j] > ins[j+1])
				{
					int tmp = ins[j];
					ins[j] = ins[j+1];
					ins[j+1] = tmp;
				}
			}
		}
		return ins;
	}
}