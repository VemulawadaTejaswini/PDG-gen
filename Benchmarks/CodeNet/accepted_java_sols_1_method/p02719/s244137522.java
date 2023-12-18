import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		long N = Long.parseLong(ST.nextToken()), K = Long.parseLong(ST.nextToken());
		if (K > N)
		{
			N = Math.min(Math.abs(N - K), N);
			System.out.println(N);
		}
		else if (N > K)
		{
			N %= K;
			N = Math.min(Math.abs(N - K), N);
			System.out.println(N);
		}
		else //if (N == K)
		{
			System.out.println("0");
		}
	}
}
