
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(BR.readLine());
		StringTokenizer ST = new StringTokenizer(BR.readLine());
		int a = Integer.parseInt(ST.nextToken()), b = Integer.parseInt(ST.nextToken());
		boolean Possible = false;
		for (int i = a; i <= b; i++)
		{
			if (i % K == 0)
			{
				Possible = true;
				break;
			}
		}
		System.out.println((Possible) ? "OK" : "NG");
	}
}
