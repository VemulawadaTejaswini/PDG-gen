

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main 
{
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
	static TreeSet<Integer> ap;
	
	static void DFS(int time, int pos)
	{
		int children = 0;
		Vertex v0 = v[pos];
		visited[pos] = true;
		disc[pos] = time;
		low[pos] = time;
//		System.out.println("Visit " + pos);
		
		for(int adj : v0.adjlist)
		{
			if(parent[pos] != adj)
			{
				if(!visited[adj])
				{
					children++;
					
					parent[adj] = pos;
					DFS(time+1, adj);
					
					low[pos] = Math.min(low[pos], low[adj]);
					if(pos != 0 && disc[pos] <= low[adj])
					{
//						System.out.println(pos);
						ap.add(pos);
					}
				}
				else
				{
					low[pos] = Math.min(low[pos], disc[adj]);
//					System.out.println("Re " + pos + " " + adj);
				}
			}
		}
		
		if(pos == 0 && children > 1)
		{
			ap.add(pos);
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
		ap = new TreeSet<Integer>();

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
		
		DFS(0, 0);
//		System.out.println(ap);
//		System.out.println("Disc "+ Arrays.toString(disc));
//		System.out.println("Low "+ Arrays.toString(low));
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		for(int a : ap)
		{
			i++;
			sb.append(a);
			if(i < ap.size())
			{
				sb.append("\n");
			}
		}
		if(ap.size()>0)System.out.println(sb);
	}

}

