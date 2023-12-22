import java.util.*;
import java.io.*;
import java.math.*;
 

class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));

		String line="";
		while((line=d.readLine())!=null)
		{
			String[] str = line.split(" ");
			int a=Integer.parseInt(str[0]);
			int b=Integer.parseInt(str[1]);
			int sum=a+b;
			int count=1;

			while(sum>=10)
			{
				count++;
				sum/=10;
			}
			System.out.println(count);
		}
	}
}