import java.util.*;

class Graph
{
	int v;
	List<Integer> adj[]; 
	Graph(int n)
	{
		v = n;
		adj = new ArrayList[n];
		for(int i = 0 ; i < n ; i++)
			adj[i] = new ArrayList<>();
	}
	void addEdge(int u,int v)
	{
		adj[u].add(v);
		adj[v].add(u);
	}
}
public class Main
{
	static int cno = 0;
	static HashMap<Integer,Integer> map1 = new HashMap<>();
	static HashMap<Integer,Integer> map2 = new HashMap<>();

	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		Graph G = new Graph(n);

		int x[] = new int[n];
		int y[] = new int[n];

		for(int i = 0 ; i < n ; i++)
		{
			x[i] = kb.nextInt();
			y[i] = kb.nextInt();
		}

		for(int i = 0 ; i < n ; i++)
		{
			for(int j = i+1 ; j < n ; j++)
			{
				if((x[i] < x[j] && y[i] < y[j]) || (x[i] > x[j] && y[i] > y[j]))
				{
					G.addEdge(i,j);
				}

			}
		}

		int visited[] = new int[n];

		for(int i = 0 ; i < n ; i++)
		{
			int res = 0;
			if(visited[i] == 0)
			{
				res = dfs(G,i,visited);
			}
			map1.put(cno,res);
			cno++;
		}

		for(int i = 0 ; i < n ; i++)
			System.out.println(map1.get(map2.get(i)));


	}
	public static int dfs(Graph G,int cur,int visited[])
	{
		if(visited[cur] == 1)
			return 0;

		visited[cur] = 1;
		map2.put(cur,cno);

		int sum = 0;

		for(int k : G.adj[cur])
		{
			sum += dfs(G,k,visited);
		}

		return 1+sum;
	}
}