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
				if(s != null && s != "")
				{
					StringTokenizer sz = new StringTokenizer(s);
					sz.nextToken();
					String perser = sz.nextToken();
					if(perser.equals("?"))
					{
						break;
					}
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
				String per = sz.nextToken();
				int b = Integer.valueOf(sz.nextToken());
				printline(a, b, per);
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