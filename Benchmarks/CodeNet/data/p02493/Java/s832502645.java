import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			ArrayList<String> list = new ArrayList<String>();
			BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
			for(int kk = 0; kk < 2; kk++)
			{
				String s = ds.readLine();
				if(s != null && s != "")
				{
					list.add(s);
				} else
				{
					break;
				}
			}
			int size = 0;
			for(int i = 0; i < list.size(); i++)
			{
				if(i == 0)
				{
					size = Integer.valueOf(list.get(i));
				} else
				{
					ArrayList<String> list2 = new ArrayList<String>();
					String base = list.get(i);
					StringTokenizer sz = new StringTokenizer(base);
					for(int j = 0; sz.hasMoreTokens(); j++)
					{
						list2.add(sz.nextToken());
					}
					String sk = "";
					for(int j = 0; j < size; j++)
					{
						sk += list2.get(size-j-1);
						if(j < size - 1)
						{
							sk += " ";
						}
					}
					System.out.println(sk);
				}
			}
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("Input Error");
		}
	}

	private static void printline(int a, int b, String per)
	{
		int res = 0;

		if(per.equals("+")) res = a + b; else if (per.equals("-")) res = a - b;
		else if(per.equals("*")) res = a * b; else if(per.equals("/")) res = a / b;

		System.out.println(res);
	}
}