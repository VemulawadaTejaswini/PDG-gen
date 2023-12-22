import java.io.*;

class Main
{
	public static void main(String[] args)throws IOException
	{
		int sum;

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int x = Integer.parseInt(str);

		sum = x * x * x;

		System.out.println(sum);
	}
}