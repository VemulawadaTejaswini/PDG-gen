import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); long Sum = 0;
		int N = Integer.parseInt(BR.readLine());
		for (long i = 1; i <= N; i++)
		{
			if (i % 3 != 0 && i % 5 != 0) Sum += i;
		}
		System.out.println(Sum);
	}
}
