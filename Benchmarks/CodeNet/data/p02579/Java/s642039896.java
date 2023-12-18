
import java.io.*;
import java.util.*;
class Pair implements Comparable<Pair>
{
    int r;
    int c;
    int dist;
    public Pair(int r,int c,int d)
    {
        this.r=r;
        this.c=c;
        this.dist=d;
    }
    public int compareTo(Pair p)
    {
        if(this.dist>p.dist)
        return 1;
        else if(this.dist<p.dist)
        return -1;
        return 0;
    }
}
public class Main {
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine());
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}
		return ans;
	}
	static long[] splitL() throws IOException
	{
		String[] cmd=br.readLine().split(" ");
		long[] ans=new long[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Long.valueOf(cmd[i]);
		}
		return ans;
	}
	static int h;
	static int w;
	static boolean possible(int r,int c)
	{
		if(r>=0 && r<h && c>=0 && c<w)
			return true;
		return false;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int[]ar=split();
		h=ar[0];
	    w=ar[1];
		ar=split();
		int sr=ar[0]-1;
		int sc=ar[1]-1;
		ar=split();
		int er=ar[0]-1;
		int ec=ar[1]-1;
		char[][] mat=new char[h][w];
		for(int i=0;i<h;i++)
		{
			String s=br.readLine();
			for(int j=0;j<w;j++)
			{
				mat[i][j]=s.charAt(j);
			}
		}
		PriorityQueue<Pair>pq=new PriorityQueue<>();
		pq.add(new Pair(sr,sc,0));
		int[][] dis=new int[h][w];
		for(int i=0;i<h;i++)
		{
			Arrays.fill(dis[i],1000000000);
		}
		dis[sr][sc]=0;
		while(!pq.isEmpty())
		{
			Pair p=pq.poll();
			int d=p.dist;
			int r=p.r;
			int c=p.c;
			if(d>dis[r][c])
				continue;
			for(int i=r-2;i<=r+2;i++)
			{
				for(int j=c-2;j<=c+2;j++)
				{
					if(!possible(i,j) || ((i==r)&&(j==c)) || (mat[i][j]=='#'))
						continue;
					int d1=1;
					if((Math.abs(i-r)==1 && j==c) || (Math.abs(j-c)==1 && i==r))
						d1=0;
					if(dis[r][c]+d1<dis[i][j])
					{
						dis[i][j]=dis[r][c]+d1;
						pq.add(new Pair(i,j,dis[i][j]));
					}
				}
			}
		}
		if(dis[er][ec]!=1000000000)
		System.out.println(dis[er][ec]);
		else
			System.out.println(-1);
	}
}
