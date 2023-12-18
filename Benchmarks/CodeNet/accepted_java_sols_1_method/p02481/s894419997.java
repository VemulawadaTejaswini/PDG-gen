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
			int[] inp = new int[sz.countTokens()+1];
			for(int i = 0; sz.hasMoreTokens(); i++)
			{
				String sd = sz.nextToken();
				inp[i] = Integer.valueOf(sd);
			}
			System.out.println((inp[0]*inp[1])+" "+((inp[0]+inp[1])*2));
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("Input Error");
		}
	}
}