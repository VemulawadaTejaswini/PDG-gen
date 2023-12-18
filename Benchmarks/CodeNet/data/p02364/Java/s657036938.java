


import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Main 
{ 
	 
	class Edge implements Comparable<Edge> 
	{ 
		int src, dest, weight; 
 
		public int compareTo(Edge compareEdge) 
		{ 
			return this.weight-compareEdge.weight; 
		} 
	}; 

	
	class subset 
	{ 
		int parent, rank; 
	}; 

	int V, E; 
	Edge edge[]; 

	
	Main(int v, int e) 
	{ 
		V = v; 
		E = e; 
		edge = new Edge[E]; 
		for (int i=0; i<e; ++i) 
			edge[i] = new Edge(); 
	} 

	
	int find(subset subsets[], int i) 
	{ 
		
		if (subsets[i].parent != i) 
			subsets[i].parent = find(subsets, subsets[i].parent); 

		return subsets[i].parent; 
	} 

	
	void Union(subset subsets[], int x, int y) 
	{ 
		int xroot = find(subsets, x); 
		int yroot = find(subsets, y); 

		
		if (subsets[xroot].rank < subsets[yroot].rank) 
			subsets[xroot].parent = yroot; 
		else if (subsets[xroot].rank > subsets[yroot].rank) 
			subsets[yroot].parent = xroot; 

		
		else
		{ 
			subsets[yroot].parent = xroot; 
			subsets[xroot].rank++; 
		} 
	} 

	
	void KruskalMST() 
	{ 
		Edge result[] = new Edge[V]; 
		int e = 0; 
		int i = 0;  
		for (i=0; i<V; ++i) 
			result[i] = new Edge(); 
 
		Arrays.sort(edge); 

		
		subset subsets[] = new subset[V]; 
		for(i=0; i<V; ++i) 
			subsets[i]=new subset(); 

		
		for (int v = 0; v < V; ++v) 
		{ 
			subsets[v].parent = v; 
			subsets[v].rank = 0; 
		} 

		i = 0;  

		
		while (e < V - 1) 
		{ 
			
			Edge next_edge = new Edge(); 
			next_edge = edge[i++]; 

			int x = find(subsets, next_edge.src); 
			int y = find(subsets, next_edge.dest); 

			 
			if (x != y) 
			{ 
				result[e++] = next_edge; 
				Union(subsets, x, y); 
			} 
			
		} 

		
		int sum=0;
		for(int i1=0;i1<e; ++i1) {
			sum += result[i1].weight;
		}
		System.out.println(sum);
	} 

	
	public static void main (String[] args) 
	{ 

		
		
		
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		String[] s = str.split(" ");
		int V = Integer.parseInt(s[0]);
		int E = Integer.parseInt(s[1]);
		Main graph = new Main(V,E);
		
		
		for(int i=0; i < E;i++) {
			str = sc.nextLine();
			String[] S =  str.split(" ");
			int src = Integer.parseInt(S[0]);
			int dest = Integer.parseInt(S[1]);
			int weight = Integer.parseInt(S[2]);
			graph.edge[i].src = src;
			graph.edge[i].dest = dest;
			graph.edge[i].weight = weight;
		}
		graph.KruskalMST();
	} 
} 



