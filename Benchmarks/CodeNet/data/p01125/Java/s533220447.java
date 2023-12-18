import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int N=in.nextInt();
			if(N==0)
				return;
			
			int f[][]=new int[21][21];
			int nx=10,ny=10;
			
			for(int i=0;i<N;i++)
			f[in.nextInt()][in.nextInt()]=1;
			
			int M=in.nextInt();
			f[10][10]=0;
			for(int i=0;i<M;i++)
			{
				String s=in.next();
				int go=in.nextInt();
				if(s.equals("N"))
				{
					while(go-->0)
					{
						ny++;
						f[nx][ny]=0;
					}
				}
				else if(s.equals("E"))
				{
					while(go-->0)
					{
						nx++;
						f[nx][ny]=0;
					}
				}
				else if(s.equals("S"))
				{
					while(go-->0)
					{
						ny--;
						f[nx][ny]=0;
					}
				}
				else if(s.equals("W"))
				{
					while(go-->0)
					{
						nx--;
						f[nx][ny]=0;
					}
				}
			}
			
			boolean judge=true;
			for(int i=0;i<21;i++)
				for(int j=0;j<21;j++)
				{
					if(f[i][j]==1)
						judge=false;
				}
			System.out.println(judge ? "Yes" : "No");
		}
	}
}