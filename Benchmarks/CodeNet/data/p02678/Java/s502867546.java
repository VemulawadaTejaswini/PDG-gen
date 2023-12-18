import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main 
{

	
	static class Node
	{
		int id;
		HashSet<Node> e = new HashSet<>();
		boolean visited = false;
		boolean marked = false;
		
		public Node(int i)
		{
			id = i;
		}
	}
	
	static Node[] nd;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		nd = new Node[n];
		for(int i = 0; i < n; i++)
			nd[i] = new Node(i);
		
		for(int i = 0; i < m; i++)
		{
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			nd[a].e.add(nd[b]);
			nd[b].e.add(nd[a]);
		}
		
		LinkedList<Node> q = new LinkedList<>();
		q.add(nd[0]);
		
		int[] par = new int[n];
		int mar = 0;
		nd[0].marked = true;
		while(!q.isEmpty())
		{
			Node pos = q.poll();
			for(Node e : pos.e)
			{
				if(!e.marked)
				{
					mar++;
					e.marked = true;
					q.add(e);
					par[e.id] = pos.id+1;
//					System.out.println("mark " + e.id);
				}
			}
			if(mar == n-1)
				break;
		}
		
		System.out.println("Yes");
		for(int i = 1; i < n; i++)
		{
			System.out.println(par[i]);
		}
	}

}
