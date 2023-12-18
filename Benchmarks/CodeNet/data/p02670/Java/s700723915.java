import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			int n=Integer.parseInt(inp.readLine());
			String a[]=inp.readLine().split(" ");
			
			boolean arr[][]=new boolean[n][n];
			int ans=0;
			for(int i=0;i<a.length;i++)
			{
		
				int cc=Integer.parseInt(a[i]);
				int r=(cc-1)/n;
				int c=(cc-1)%n;
				// int cost[]=new int[n];
				boolean visited[][]=new boolean[n][n];
				PriorityQueue<Pair>arr1=new PriorityQueue<>((aa,b)->(aa.c-b.c));
				visited[r][c]=true;
				arr1.offer(new Pair(r,c,0));
				int dirx[]=new int[]{1,0,-1,0};
				int diry[]=new int[]{0,1,0,-1};
				while(arr1.size()!=0)
				{
					Pair p=arr1.poll();
					int flag=0;
					for(int k=0;k<4;k++)
					{
						int x=p.a+dirx[k];
						int y=p.b+diry[k];
						if( x<0 || y<0 || x==n || y==n){ans+=p.c;flag=1;break;}
						else if(!visited[x][y])
							{int u=(arr[x][y]==false)?1:0;
								visited[x][y]=true;arr1.offer(new Pair(x,y,p.c+u));}
					}
					if(flag==1){break;}

				}

				arr[r][c]=true;
				// ans+=Math.min(Math.min(an1,an2),Math.min(an3,an4));
			}
			System.out.println(ans);

		
	}
}
class Pair
{
	int a;
	int b;
	int c;
	Pair(int e, int f, int g)
	{
		a=e;
		b=f;
		c=g;
	}
}