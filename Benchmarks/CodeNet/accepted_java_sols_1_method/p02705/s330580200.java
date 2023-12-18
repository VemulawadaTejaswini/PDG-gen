import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(BR.readLine());
		System.out.println((double)2 * (double)R * (double)3.1415);
	}
}
