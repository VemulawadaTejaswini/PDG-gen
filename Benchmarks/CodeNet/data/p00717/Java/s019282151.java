import java.util.*;
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
			int x[][]=new int[n+1][11];
			int y[][]=new int[n+1][11];
			int m[]=new int[51];
			TreeSet<Integer>TS=new TreeSet<Integer>();
			for(int i=0;i<=n;i++)
			{
				m[i]=in.nextInt();
				for(int j=0;j<m[i];j++)
				{
					x[i][j]=in.nextInt();
					y[i][j]=in.nextInt();
				}
			}

			for(int I=0;I<=m[0];I+=m[0]-1)
			{

				for(int i=0;i<=n;i++)
				{
					if(I!=0&&i==0)
						continue;
					int mx=0;
					int my=0;
					if(x[i][I]!=0) mx=x[i][I];
					if(y[i][I]!=0) my=y[i][I];
					for(int j=0;j<m[0];j++)
					{
						x[i][j]-=mx;
						y[i][j]-=my;
					}
				}
				for(int i=1;i<=n;i++)
				{
					if(m[0]!=m[i])
						continue;
					boolean judge=true;
					int tx[]=x[i].clone();
					int ty[]=y[i].clone();
					for(int j=0;j<4;j++)//90度回転を4回試す
					{
						judge=true;
						if(I==0)
							for(int k=0;k<m[0];k++)
							{
								int tmp=tx[k];
								tx[k]=ty[k];
								ty[k]=-tmp;
								if(tx[k]!=x[0][k]||ty[k]!=y[0][k])
									judge=false;
							}
						else
							for(int k=m[0]-1;k>=0;k--)
							{
								int tmp=tx[k];
								tx[k]=ty[k];
								ty[k]=-tmp;
								if(tx[k]!=x[0][m[0]-k-1]||ty[k]!=y[0][m[0]-k-1])
									judge=false;
							}
						if(judge)
							TS.add(i);
					}
				}
			}
			for(int p:TS)
				System.out.println(p);
			System.out.println("+++++");
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}