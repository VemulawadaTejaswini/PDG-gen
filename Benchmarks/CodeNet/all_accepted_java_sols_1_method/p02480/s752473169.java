import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(read.readLine());
		System.out.println(x * x * x);
	}
}