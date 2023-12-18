import java.io.*;

class Main
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		Int str = br.readline();
		
		int x = Integer.parseInt(str);
		
		System.out.println(x*x*x);
	}
}