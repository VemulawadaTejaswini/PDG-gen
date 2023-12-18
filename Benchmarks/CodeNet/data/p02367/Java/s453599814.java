

import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Main 
{
	static class C implements Comparator<Bridge>
	{

		@Override
		public int compare(Bridge arg0, Bridge arg1) 
		{
			int ans = arg0.v1 - arg1.v1;
			if(ans == 0)ans = arg0.v2 - arg1.v2;
			return ans;
		}
	}
	
	static class Bridge
	{
		int v1;
		int v2;
		
		public Bridge(int v1, int v2)
		{
			this.v1 = Math.min(v1, v2);
			this.v2 = Math.max(v1, v2);
		}
		
		public String toString()
		{
			return v1 + " " + v2;
		}
	}
	
	static class Vertex
	{
		TreeSet<Integer> adjlist = new TreeSet<Integer>();
		
		int dim()
		{
			return adjlist.size();
		}
		
		public Vertex()
		{
			
		}
		
		public Vertex(int adjacentTo)
		{
			adjlist.add(adjacentTo);
		}
	}
	
	static Scanner sc = new Scanner(System.in);
	static int vn, en;
	static Vertex[] v;
	static int[] low;
	static int[] disc;
	static int[] parent;
	static boolean[] visited;
	static TreeSet<Bridge> b;
	
	static void DFS()
	{
		int time = 0;
		int pos = 0;
		Stack<Integer> queue = new Stack<Integer>();
		
		queue.push(0);
		
		int children = 0;
		
		while(!queue.isEmpty())
		{
			pos = queue.peek();
			
			if(!visited[pos])
			{
	//			System.out.println("Visit " + pos + " " + queue);
				if(pos == 0)time = 0;
				else
				{
					time = disc[parent[pos]] + 1;
				}
				Vertex v0 = v[pos];
				boolean alreadyvisited = visited[pos];
				visited[pos] = true;
				disc[pos] = time;
				low[pos] = time;
				children = 0;
				
				for(int adj : v0.adjlist)
				{
					if(parent[pos] != adj)
					{
						if(!visited[adj])
						{
							children++;
//							if(pos == 0)rootchildren++;
							
							parent[adj] = pos;
							queue.push(adj);
						}
						else
						{
							low[pos] = Math.min(low[pos], disc[adj]);
	//						System.out.println("Re " + pos + " " + adj);
						}
					}				
				}

			}
			else
			{
				pos = queue.pop();
				
				int par = parent[pos];
				if(par >= 0)
				{
					low[par] = Math.min(low[par], low[pos]);
					if(disc[par] < low[pos])
					{
						b.add(new Bridge(par, pos));
					}
				}
			}

			
		}

	}

	public static void main(String[] args) 
	{
		vn = sc.nextInt();
		en = sc.nextInt();
		v = new Vertex[vn];
		disc = new int[vn];
		low = new int[vn];
		parent = new int[vn];
		visited = new boolean[vn];
		C c = new C();
		b = new TreeSet<Bridge>(c);

		for(int i = 0; i < vn; i++)
		{
			v[i] = new Vertex();
			parent[i] = -1;
			low[i] = 999999999;
		}
		
		for(int i = 0; i < en; i++)
		{
//			System.out.println("Reading edge " + (i+1));
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			v[v1].adjlist.add(v2);
			v[v2].adjlist.add(v1);
		}
		
		DFS();
		
		for(Bridge s : b)
		{
			System.out.println(s);
		}
//		System.out.println(ap);
//		System.out.println("Disc "+ Arrays.toString(disc));
//		System.out.println("Low "+ Arrays.toString(low));
	}

}

