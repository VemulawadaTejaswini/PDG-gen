package atcoder;
import java.util.*;
public class Friends {
	private static int count=0;
	
	void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	void DFS(ArrayList<ArrayList<Integer>> adj,int v,int n) {
		boolean[] visited=new boolean[n];
		for(int i=0;i<n;i++) {
			visited[i]=false;
		}
		
		DFSutil(adj,v,n,visited);
	}
	
	void DFSutil(ArrayList<ArrayList<Integer>> adj,int v,int n,boolean[] visited) {
		visited[v]=true;
//		System.out.println(v+" ");
		count+=1;
		
		Iterator<Integer> i = adj.get(v).listIterator();
		while(i.hasNext()) {
			int o=i.next();
			if(!visited[o]) {
				DFSutil(adj,o,n,visited);
			}
		}
	}
	
	int CountComponent(ArrayList<ArrayList<Integer>> adj,int v,int n) {
		boolean[] visited=new boolean[n];
		int maxcnt=0;
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				 DFSutil(adj,v,n,visited);
			}
			if(i==0) {
				maxcnt=count;
			}
			else {
				if(maxcnt<count) {
					maxcnt=count;
				}
			}
			count=0;
		}
		return maxcnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		Friends graph=new Friends();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(n);
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++) {
			int a=input.nextInt()-1;
			int b=input.nextInt()-1;
			graph.addEdge(adj, a, b);
		}
		int ans1=graph.CountComponent(adj,0,n);
		System.out.println(ans1);
		
	}

}
