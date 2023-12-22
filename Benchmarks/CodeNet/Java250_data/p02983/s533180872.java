import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int r=in.nextInt();
		if(r-l>2019)
		{
			System.out.println(0);
		}
		else
		{
			int p=l%2019;
			r=r%2019;
			if(r<p)
			{
				r=r+2019;
			}
			int min=2019;
			for(int i=p;i<=r;i++)
			{
				for(int j=i+1;j<=r;j++)
				{
					int ans=(i*j)%2019;
					if(ans<min)
					{
						min=ans;
					}
				}
			}
			System.out.println(min);
		}
	}
}
	