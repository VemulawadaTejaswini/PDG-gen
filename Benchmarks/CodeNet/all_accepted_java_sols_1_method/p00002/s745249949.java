import java.io.*;
import java.math.*;
import java.io.*;

class Main
{
	public static void main(String[] arg)throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

		String line;
		while((line=input.readLine())!=null)
		{
			String[] str=line.split(" ");
			int num[]=new int[3];

			num[0]=Integer.parseInt(str[0]);
			num[1]=Integer.parseInt(str[1]);
			num[2]=num[1]+num[0];

			System.out.println((int)Math.log10(num[2])+1); 
		}
	}
}