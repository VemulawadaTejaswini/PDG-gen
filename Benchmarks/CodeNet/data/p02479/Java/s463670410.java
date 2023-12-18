import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import static java.lang.Math.PI;

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
				double a = Double.parseDouble(s);
				System.out.println(String.format("%f", a*a*PI)+" "+a*2D*PI);
			}
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("Input Error");
		}
	}
}