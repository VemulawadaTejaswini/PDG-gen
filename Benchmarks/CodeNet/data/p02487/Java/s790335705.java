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
			while(true)
			{
				String s = ds.readLine();
				if(s != null && s != "" && !s.equals("0 0"))
				{
					list.add(s);
				} else
				{
					break;
				}
			}
			for(int i = 0; i < list.size(); i++)
			{
				String s = list.get(i);
				StringTokenizer sz = new StringTokenizer(s);
				int a = Integer.valueOf(sz.nextToken());
				int b = Integer.valueOf(sz.nextToken());
				printrect(a, b);
			}
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("Input Error");
		}
	}

	private static void printrect(int x, int y)
	{
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				if(i % (x-1) == 0 || j % (y-1) == 0)
				{
					System.out.print("#");
				} else
				{
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}