import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int m=in.nextInt();
			if((n|m)==0)
				return;
			int b[] = new int[m+1];
			int ans[]=new int[m+1];
			boolean a[] = new boolean[m+1];
			Arrays.fill(a, true);
			for(int i=1; i<=n;i++)
				for(int j=1;j<=m;j++)
					b[j]+=in.nextInt();
			for(int i=1;i<=m;i++)
			{
				int max =-1;
				int mxin = i;
				int j;
				for( j=1;j<=m;j++)
				{
					if(b[j]>max&&a[j])
					{
						max=b[j];
						mxin = j;
					}
				}
				ans[i]=mxin;
				a[mxin]=false;
			}
			for(int i=1;i<=m;i++)
				if(i!=m)System.out.print(ans[i]+" ");
				else System.out.println(ans[i]);
		}
	}
}