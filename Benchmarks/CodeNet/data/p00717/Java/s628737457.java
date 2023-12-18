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
			int m=in.nextInt();
			int x[][]=new int[n+1][m];
			int y[][]=new int[n+1][m];
			TreeSet<Integer>TS=new TreeSet<Integer>();
			for(int i=0;i<=n;i++)
			{
				if(i!=0)
					in.nextInt();
				for(int j=0;j<m;j++)
				{
					x[i][j]=in.nextInt();
					y[i][j]=in.nextInt();
				}
			}

			for(int I=0;I<=m;I+=m-1)
			{

				for(int i=0;i<=n;i++)
				{
					if(I!=0&&i==0)
						continue;
					int mx=0;
					int my=0;
					if(x[i][I]!=0) mx=x[i][I];
					if(y[i][I]!=0) my=y[i][I];
					for(int j=0;j<m;j++)
					{
						x[i][j]-=mx;
						y[i][j]-=my;
					}
				}
				for(int i=1;i<=n;i++)
				{
					boolean judge=true;
					int tx[]=x[i].clone();
					int ty[]=y[i].clone();
					for(int j=0;j<4;j++)//90度回転を4回試す
					{
						judge=true;
						if(I==0)
							for(int k=0;k<m;k++)
							{
								int tmp=tx[k];
								tx[k]=ty[k];
								ty[k]=-tmp;
								if(tx[k]!=x[0][k]||ty[k]!=y[0][k])
									judge=false;
							}
						else
							for(int k=m-1;k>=0;k--)
							{
								int tmp=tx[k];
								tx[k]=ty[k];
								ty[k]=-tmp;
								if(tx[k]!=x[0][m-k-1]||ty[k]!=y[0][m-k-1])
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