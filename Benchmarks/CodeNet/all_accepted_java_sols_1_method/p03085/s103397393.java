import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	public static void main(String[] Arguments) throws IOException
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		char b = BR.readLine().charAt(0);
		if (b == 'A')
		{
			System.out.println("T");
		}
		if (b == 'T')
		{
			System.out.println("A");
		}
		if (b == 'C')
		{
			System.out.println("G");
		}
		if (b == 'G')
		{
			System.out.println("C");
		}
	}
}
