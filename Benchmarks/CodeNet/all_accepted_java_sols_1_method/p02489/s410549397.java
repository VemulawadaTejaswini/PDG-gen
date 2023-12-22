import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			ArrayList<String> list = new ArrayList<String>();
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				String s = d.readLine();
				if(s != null && s != "" && Integer.valueOf(s) != 0)
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
				System.out.println("Case "+(i+1)+": "+s);
			}
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("Input Error");
		}
	}
}