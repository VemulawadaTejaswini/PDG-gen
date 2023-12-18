import java.io.*;
import java.util.*;
public class Main
{
	final int dx[]={0,0,-1,1};
	final int dy[]={-1,1,0,0};
	private void solve()throws Exception
	{
		int n=nextInt();
		int m=nextInt();
		int k=nextInt();
		int x1=nextInt();
		int y1=nextInt();
		int x2=nextInt();
		int y2=nextInt();
		boolean grid[][]=new boolean[n+1][m+1];
		for(int i=1;i<=n;i++)
		{
			String s=nextLine();
			for(int j=1;j<=m;j++)
				grid[i][j]=s.charAt(j-1)=='.';
		}
		int dist[][]=new int[n+1][m+1];
		for(int i=1;i<=n;i++)
			Arrays.fill(dist[i],1<<30);
		dist[x1][y1]=0;
		Queue<Integer> qx=new LinkedList<>();
		Queue<Integer> qy=new LinkedList<>();
		qx.add(x1);
		qy.add(y1);
		while(!qx.isEmpty())
		{
			int x=qx.remove();
			int y=qy.remove();
			for(int p=0;p<4;p++)
			{
				int px=x,py=y;
				for(int q=1;q<=k;q++)
				{
					int cx=px+dx[p];
					int cy=py+dy[p];
					if(cx<1 || cx>n || cy<1 || cy>m || !grid[cx][cy] || dist[cx][cy]<=dist[x][y]+1)
						break;
					dist[cx][cy]=dist[x][y]+1;
					grid[cx][cy]=false;
					qx.add(cx);
					qy.add(cy);
					px=cx;
					py=cy;
				}
			}
		}
		out.println(dist[x2][y2]==(1<<30)?-1:dist[x2][y2]);
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws Exception
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws Exception{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws Exception{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws Exception{
		return br.readLine();
	}
	int nextInt()throws Exception{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws Exception{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws Exception{
		return Double.parseDouble(nextToken());
	}
}