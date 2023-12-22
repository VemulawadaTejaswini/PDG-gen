import java.io.*;

class Main
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int x = Integer.parseInt(br.readLine());

			x *= x*x;

			System.out.println(x);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}