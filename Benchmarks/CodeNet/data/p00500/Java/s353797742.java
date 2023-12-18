import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int N=in.nextInt();
			int a[][]=new int[N][3];
			int b[]=new int[N];
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<3;j++)
					a[i][j]=in.nextInt();
			}
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<N;j++)
				{
					boolean judge=true;
					
					for(int k=0;k<N;k++)
					{
						if(j==k)
							continue;
						if(a[j][i]==a[k][i])
						{
							judge=false;
							break;
						}
					}
					if(judge)
					b[j]+=a[j][i];
				}
			}
			for(int i=0;i<N;i++)
				System.out.println(b[i]);
		}
	}
}