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
			char map[][]=new char[n][n];
			int w[][]=new int[n][n];
			int ans=0;
			for(int i=0;i<n;i++)
			{
				String s=in.next();
				for(int j=0;j<n;j++)
					map[i][j]=s.charAt(j);
			}
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					if(map[i][j]=='.')
						w[i][j]=1;

			for(int i=1;i<n;i++)
				for(int j=1;j<n;j++)
				{
					if(map[i][j]=='*')
						w[i][j]=0;
					else
					{
						w[i][j]=Math.min(w[i-1][j], Math.min(w[i][j-1],w[i-1][j-1]))+1;
						ans=Math.max(ans,w[i][j]);
					}
				}
			System.out.println(ans);
		}
	}
}