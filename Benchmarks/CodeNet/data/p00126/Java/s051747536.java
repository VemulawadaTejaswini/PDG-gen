import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int judge=0;
		while(N-->0)
		{
			if(judge!=0)
				System.out.println();
			judge=1;

			int a[][]=new int[9][9];
			boolean b[][]=new boolean[9][9];
			for(int i=0;i<9;i++)
				for(int j=0;j<9;j++)
				{
					a[i][j]=in.nextInt();
					b[i][j]=true;
				}
			for(int i=0;i<9;i++)
				for(int j=0;j<9;j++)
					for(int k=j+1;k<9;k++)
					{
						if(a[i][j]==a[i][k])
							b[i][j]=b[i][k]=false;
						if(a[j][i]==a[k][i])
							b[j][i]=b[k][i]=false;
					}

			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
				{

					for(int k=0;k<3;k++)
						for(int l=0;l<3;l++)
						{
							if(i==k&&j==l)
								continue;
							if(a[i][j]==a[k][l])
								b[i][j]=b[k][l]=false;
						}
				}
			for(int i=0;i<3;i++)
				for(int j=3;j<6;j++)
				{

					for(int k=0;k<3;k++)
						for(int l=3;l<6;l++)
						{
							if(i==k&&j==l)
								continue;
							if(a[i][j]==a[k][l])
								b[i][j]=b[k][l]=false;
						}
				}
			for(int i=0;i<3;i++)
				for(int j=6;j<9;j++)
				{

					for(int k=0;k<3;k++)
						for(int l=6;l<9;l++)
						{
							if(i==k&&j==l)
								continue;
							if(a[i][j]==a[k][l])
								b[i][j]=b[k][l]=false;
						}
				}

			for(int i=3;i<6;i++)
				for(int j=0;j<3;j++)
				{

					for(int k=3;k<6;k++)
						for(int l=0;l<3;l++)
						{
							if(i==k&&j==l)
								continue;
							if(a[i][j]==a[k][l])
								b[i][j]=b[k][l]=false;
						}
				}
			for(int i=3;i<6;i++)
				for(int j=3;j<6;j++)
				{

					for(int k=3;k<6;k++)
						for(int l=3;l<6;l++)
						{
							if(i==k&&j==l)
								continue;
							if(a[i][j]==a[k][l])
								b[i][j]=b[k][l]=false;
						}
				}
			for(int i=3;i<6;i++)
				for(int j=6;j<9;j++)
				{

					for(int k=3;k<6;k++)
						for(int l=6;l<9;l++)
						{
							if(i==k&&j==l)
								continue;
							if(a[i][j]==a[k][l])
								b[i][j]=b[k][l]=false;
						}
				}

			for(int i=6;i<9;i++)
				for(int j=0;j<3;j++)
				{

					for(int k=6;k<9;k++)
						for(int l=0;l<3;l++)
						{
							if(i==k&&j==l)
								continue;
							if(a[i][j]==a[k][l])
								b[i][j]=b[k][l]=false;
						}
				}
			for(int i=6;i<9;i++)
				for(int j=3;j<6;j++)
				{

					for(int k=6;k<9;k++)
						for(int l=3;l<6;l++)
						{
							if(i==k&&j==l)
								continue;
							if(a[i][j]==a[k][l])
								b[i][j]=b[k][l]=false;
						}
				}
			for(int i=6;i<9;i++)
				for(int j=6;j<9;j++)
				{

					for(int k=6;k<9;k++)
						for(int l=6;l<9;l++)
						{
							if(i==k&&j==l)
								continue;
							if(a[i][j]==a[k][l])
								b[i][j]=b[k][l]=false;
						}
				}

			for(int i=0;i<9;i++)
			{
				for(int j=0;j<9;j++)
					System.out.print(b[i][j] ? " "+a[i][j] : "*"+a[i][j]);
				System.out.println();
			}
		}
	}
}