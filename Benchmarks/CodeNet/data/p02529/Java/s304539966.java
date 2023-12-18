import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			int m=in.nextInt();
			int b[]=new int[m];
			for(int i=0;i<m;i++)
				b[i]=in.nextInt();
			int cnt=0;
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[j]==b[i])
						++cnt;
				}
			}
			System.out.println(cnt);
		}
	}
}