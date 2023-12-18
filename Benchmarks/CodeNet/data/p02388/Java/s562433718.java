import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		int x,x_3;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line =reader.readLine();
		x = Integer.parseInt(line);
		x_3 = x*x*x;
		System.out.println(x_3);
	}
}