
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		if (BR.readLine().equals("ABC")) System.out.println("ARC");
		else System.out.println("ABC");
	}
}
