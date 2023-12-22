import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[]=new int[n];
			ArrayList<String>Al=new ArrayList<String>();
			for(int i=0; i<n; i++)
				a[i]=in.nextInt();

			for(int i=0;i<n;i++)
			{
				int first=a[i];
				boolean quote=false;
				for(;;)
				{

					if(i+1<n&&a[i]+1==a[i+1])
					{
						quote=true;
						i++;
					}
					else
					{
						if(quote)
							Al.add(first+"-"+a[i]);
						else
							Al.add(first+"");
						break;
					}

				}
			}
			for(int i=0;i<Al.size()-1;i++)
				System.out.print(Al.get(i)+" ");
			System.out.println(Al.get(Al.size()-1));
		}
	}
}