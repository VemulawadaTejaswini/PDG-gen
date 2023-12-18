import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main(String str[])throws IOException
	{
		//BufferedReader d=new BufferedReader(new InputStreamReader(System.in));

		Scanner in=new Scanner(System.in);
		int a,b;
		while((a=in.nextInt())>=0)
		{
			b=in.nextInt();
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