import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		int S = Integer.parseInt(ST.nextToken()), W = Integer.parseInt(ST.nextToken());
		System.out.println((W >= S) ? "unsafe" : "safe");
	}
}
