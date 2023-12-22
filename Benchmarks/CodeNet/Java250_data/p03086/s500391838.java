import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	static boolean Valid(String S)
	{
		for (char C : S.toCharArray())
		{
			if (C != 'A' && C != 'C' && C != 'T' && C != 'G') return false;
		}
		return true;
	}
	
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String S = BR.readLine();
		int Best = 0;
		for (int i = 0; i < S.length(); i++)
		{
			String substr = S.substring(i);
			for (int j = 1; j <= substr.length(); j++)
			{
				String result = substr.substring(0, j);
				//System.out.println(result);
				if (Valid(result)) Best = Math.max(Best, result.length());
			}
		}
		System.out.println(Best);
	}
}
