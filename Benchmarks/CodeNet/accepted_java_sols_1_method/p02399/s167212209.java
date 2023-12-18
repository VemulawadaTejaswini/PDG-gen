import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int d = (int)a / b;
		int r = a % b;
		double f = (double)a / b;
		System.out.printf("%d %d %.6f", d, r, f);
	}
}