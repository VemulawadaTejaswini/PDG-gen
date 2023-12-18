import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	
	static int island=0;
	static int cost=0;
	
	public static void main(String[] args)
	{
		FastReader s=new FastReader();
		
		int n=s.nextInt();
		int m=s.nextInt();
		
		int x1=s.nextInt()-1;
		int y1=s.nextInt()-1;
		
		int x2=s.nextInt()-1;
		int y2=s.nextInt()-1;
		
		char[][] arr=new char[n][m];
		
		for(int i=0;i<n;i++)
		{
			String str=s.next();
			
			for(int j=0;j<m;j++)
			{
				arr[i][j]=str.charAt(j);
			}
		}
		
		int[][] number=new int[n][m];
		int[][] visited=new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(visited[i][j]==0&&arr[i][j]=='.')
				{
					island++;
					bfs(arr,i,j,n,m,number,visited);
				}
			}
		}
		
		HashMap<Integer,Integer>[] graph=new HashMap[island+1];
		
		for(int i=0;i<island+1;i++)
		{
			HashMap<Integer,Integer> map=new HashMap<>();
			graph[i]=map;
		}
		
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]=='.')
				{
					for(int k=Math.max(i-2,0);k<=Math.min(n-1,i+2);k++)
					{
						for(int l=Math.max(0,j-2);l<=Math.min(m-1,j+2);l++)
						{
							if(arr[k][l]=='.'&&number[k][l]!=number[i][j])
							{
								if(!graph[number[i][j]].containsKey(number[k][l]))
								{
									graph[number[i][j]].put(number[k][l],1);
									graph[number[k][l]].put(number[i][j],1);
								}
							}
						}
					}
				}
			}
		}
		
		int start=number[x1][y1];
		int end=number[x2][y2];
		
		long val=bfs2(start,end,graph);
		
		if(val>=10000000)
			System.out.println(-1);
		else
		System.out.println(val);
		
	}
	
	public static void bfs(char[][] arr,int x,int y,int n,int m,int[][] number,int[][] visited)
	{
		
		Queue<pair> q=new LinkedList<>();
		
		pair p=new pair(x,y);
		q.add(p);
		
		visited[x][y]=1;
		
		while(!q.isEmpty())
		{
			pair curr=q.poll();
			int r=curr.r;
			int c=curr.c;
			
			number[r][c]=island;
			
			if(r+1<n&&visited[r+1][c]==0&&arr[r+1][c]!='#')
			{
				pair pp=new pair(r+1,c);
				q.add(pp);
				
				visited[r+1][c]=1;
			}
			if(r-1>=0&&visited[r-1][c]==0&&arr[r-1][c]!='#')
			{
				pair pp=new pair(r-1,c);
				q.add(pp);
				
				visited[r-1][c]=1;
			}
			if(c+1<m&&visited[r][c+1]==0&&arr[r][c+1]!='#')
			{
				pair pp=new pair(r,c+1);
				q.add(pp);
				
				visited[r][c+1]=1;
			}
			if(c-1>=0&&visited[r][c-1]==0&&arr[r][c-1]!='#')
			{
				pair pp=new pair(r,c-1);
				q.add(pp);
				
				visited[r][c-1]=1;
			}
			
		}
	}
	
	public static long bfs2(int start,int end,HashMap<Integer,Integer>[] arr)
	{
		Queue<Integer>  q=new LinkedList<>();
		int[] visited=new int[island+1];
		int[] cost=new int[island+1];
		
		Arrays.fill(cost,10000000);
				
		q.add(start);
		visited[start]=1;
		cost[start]=0;
		
		while(!q.isEmpty())
		{
			int curr=q.poll();
			
			for(Map.Entry<Integer,Integer> entry: arr[curr].entrySet())
			{
				if(visited[entry.getKey()]==0)
				{
					cost[entry.getKey()]=Math.min(entry.getKey(),cost[curr]+1);
					q.add(entry.getKey());
					visited[entry.getKey()]=1;
				}
			}
		}
		
		return cost[end];
		
	}

}

class pair
{
	int r;
	int c;

	public pair(int r,int c)
	{
		this.r=r;
		this.c=c;
	}
	
}