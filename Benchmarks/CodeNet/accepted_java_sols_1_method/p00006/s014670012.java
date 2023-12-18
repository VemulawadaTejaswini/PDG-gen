import java.io.*;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer str = new StringBuffer(br.readLine());
		str.reverse();
		System.out.println(str);
	}
}