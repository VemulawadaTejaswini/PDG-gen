import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		int A = Integer.parseInt(ST.nextToken()), B = Integer.parseInt(ST.nextToken()), C = Integer.parseInt(ST.nextToken()), D = Integer.parseInt(ST.nextToken());
		boolean takaTurn = true;
		while (A > 0 && C > 0)
		{
			if (takaTurn) C -= B;
			else A -= D;
			takaTurn = !takaTurn;
		}
		System.out.println((A > 0) ? "Yes" : "No");
	}
}
