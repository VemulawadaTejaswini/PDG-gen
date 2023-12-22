import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(BR.readLine()); HashSet<String> Items = new HashSet<>();
		for (; N > 0; N--)
		{
			Items.add(BR.readLine());
		}
		System.out.println(Items.size());
	}
}
