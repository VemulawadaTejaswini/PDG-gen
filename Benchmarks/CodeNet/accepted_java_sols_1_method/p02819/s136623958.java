import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=n;;i++)
		{
			int flag=0;
			for(int j=2;j*j<=i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					j=i;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
	