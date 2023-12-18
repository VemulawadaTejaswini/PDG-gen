import java.util.*;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			int m=in.nextInt();
			int tmp=m;
			int ans=0;
			if((n|m)==0)
				return;
			boolean[] a=new boolean[n+1];
			Arrays.fill(a, true);
			a[tmp]=false;
			for(;;)
			{
				int cn=0;
				int j=0;
				for(;;)
				{
					if(tmp+1>n)
						tmp=0;
					if(a[++tmp])
						cn++;
					if(cn==m)
						break;
				}
				a[tmp]=false;
				ans=tmp;
				for(int k=1;k<a.length;k++)
				{
					if(a[k])
					{
						j=0;
						break;
					}
					j=1;
				}		
				if(j==1)
					break;
			}
			System.out.println(ans);
		}
	}
}