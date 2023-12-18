import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int m=in.nextInt();
			if(m==0)
				return;
			int tx[]=new int[m];
			int ty[]=new int[m];
			for(int i=0;i<m;i++)
			{
				tx[i]=in.nextInt();
				ty[i]=in.nextInt();
			}
			int n=in.nextInt();
			int skyx[]=new int[n];
			int skyy[]=new int[n];
			boolean judge[]=new boolean[m];
			boolean cmp=false;
			judge[0]=true;
			for(int i=0;i<n;i++)
			{
				skyx[i]=in.nextInt();
				skyy[i]=in.nextInt();
			}

			for(int i=0;i<n;i++)
			{
				int toX=skyx[i]-tx[0];
				int toY=skyy[i]-ty[0];
				Arrays.fill(judge, false);
				cmp=true;
				judge[0]=true;
				for(int j=1;j<m;j++)
				{
					int nx=tx[j]+toX;
					int ny=ty[j]+toY;
					for(int k=0;k<n;k++)
					{
						if(nx==skyx[k]&&ny==skyy[k])
						{
							judge[j]=true;
							break;
						}
					}	
				}
				for(int j=0;j<m;j++)
				{
					if(!judge[j])
						cmp=false;
				}
				if(cmp)
				{
					System.out.println(toX+" "+toY);
					break;
				}
			}
		}
	}
}