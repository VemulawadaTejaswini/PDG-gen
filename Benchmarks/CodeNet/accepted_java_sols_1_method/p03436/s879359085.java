import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		String[] s=new String[h];
		for(int i=0;i<h;i++)
			s[i]=sc.next();
		int al=0;
		for(int i=0;i<h;i++)
		for(int j=0;j<w;j++)
			if(s[i].charAt(j)=='#')
				al++;
		int[][] m=new int[h][w];
		for(int i=0;i<h;i++)
		for(int j=0;j<w;j++)
			m[i][j]=0;
		m[h-1][w-1]=1;
		boolean[][] done=new boolean[h][w];
		for(int i=0;i<h;i++)
		for(int j=0;j<w;j++)
			done[i][j]=false;
		done[h-1][w-1]=true;
		int[] dx={-1,0,1,0};
		int[] dy={0,-1,0,1};
		Queue<Integer> que1 = new ArrayDeque<Integer>();
		Queue<Integer> que2 = new ArrayDeque<Integer>();
		que1.add(h-1);
		que2.add(w-1);
		while(que1.size()>0)
		{
			int x=que1.poll();
			int y=que2.poll();
			for(int k=0;k<4;k++)
			{
				int nx=x+dx[k];
				int ny=y+dy[k];
				if(nx<0 || ny<0 || nx>=h || ny>=w)
					continue;
				if(s[nx].charAt(ny)=='#')
					continue;
				if(done[nx][ny])
					continue;
				done[nx][ny]=true;
				m[nx][ny]=m[x][y]+1;
				que1.add(nx);
				que2.add(ny);
			}
		}
		if(m[0][0]==0)
			System.out.println(-1);
		else
			System.out.println(h*w-m[0][0]-al);

	}
}