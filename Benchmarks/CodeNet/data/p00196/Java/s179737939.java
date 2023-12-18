import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int  c[][]=new int[n][2];
			String str[]=new String[n];
			for(int i=0;i<n;i++)
			{
				str[i]=in.next();
				for(int j=0;j<n-1;j++)
				{
					int p=in.nextInt();
					if(p==0)
						c[i][0]++;
					else if(p==1)
						c[i][1]++;
				}
			}
			boolean a[]=new boolean[n];
			Arrays.fill(a, true);
			int ansc=0;
			while(true)
			{				
				int maxinde;
				int i=0;
				while(true)
				{
					if(a[i])
					{
						maxinde=i;
						break;
					}
					i++;
				}
				for(int j=0;j<n;j++)
				{
					if(!a[j])
						continue;
					if(c[maxinde][0]<c[j][0])
						maxinde=j;
					else if(c[maxinde][0]==c[j][0])
					{
						if(c[maxinde][1]>c[j][1])
							maxinde=j;
					}
				}
				System.out.println(str[maxinde]);
				a[maxinde]=false;
				ansc++;
				if(ansc==n)
					break;
			}
		}
	}
}