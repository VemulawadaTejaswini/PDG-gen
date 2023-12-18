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
			{
				String s = ds.readLine();

				if(s != null && s != "")
				{
					list.add(s);
				}
			}
			for(int i = 0; i < list.size(); i++)
			{
				String s = list.get(i);
				StringTokenizer sz = new StringTokenizer(s);
				int a = Integer.parseInt(sz.nextToken());
				int b = Integer.parseInt(sz.nextToken());
				int d = a / b;
				int c = a % b;
				double f = (float)a / b;
				System.out.println(d+" "+c+" "+f);
			}
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("Input Error");
		}
	}
}