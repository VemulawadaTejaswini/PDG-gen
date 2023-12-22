import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine());
		sb.append(sb.toString());
		String p = br.readLine();
		if(sb.indexOf(p)==-1)	System.out.println("No");
		else		System.out.println("Yes");
	}
}