import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int path[][]=new int[101][101];
			for(int i=1;i<=n;i++)
			{
				int m=in.nextInt();
				for(int j=0;j<m;j++)
					path[i][in.nextInt()]=1;
			}
			int k=in.nextInt();
			int leak[]=new int[k];
			for(int i=0;i<k;i++)
				leak[i]=in.nextInt();
			int ans=0;
			int cnt=0;
			for(int i=1;i<=n;i++)
			{
				int judge=0;
				for(int j=0;j<k;j++)
				{
					if(path[i][leak[j]]==1)
						judge=1;
					else 
					{
						judge=0;
						break;
					}
				}
				if(judge==1)
				{
					cnt++;
					ans=i;
				}
			}
			System.out.println(cnt==1 ? ans:-1);
		}
	}
}