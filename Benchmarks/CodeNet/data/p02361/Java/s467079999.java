import java.util.*;

public class Main {
	public static int[] dijstra(ArrayList<Integer> e[],ArrayList<Integer> c[],int start){
		PriorityQueue <Edge>dij=new PriorityQueue<>();
		int ans[]=new int[e.length];
		boolean ok[]=new boolean[e.length];
		Arrays.fill(ans,Integer.MAX_VALUE);
		ans[start]=0;
		ok[start]=true;
		dij.add(new Edge(start,0));
	    while(!dij.isEmpty()){
	    	Edge ed=dij.poll();
	    	if(ans[ed.p]<ed.c)continue;
			int a=ed.p;
			ok[a]=true;
			for(int i=0;i<e[a].size();i++){
					int x=e[a].get(i);
					int y=c[a].get(i);
				if(!ok[x] && ans[x]>ans[a]+y){	
					ans[x]=ans[a]+y;
					dij.add(new Edge(x,ans[x]));
					}
				}
			}
			
		

		return ans;
	}
	static int n,m,s;
	static ArrayList<Integer>e[];
	static ArrayList<Integer>c[];
	
	public static void graph_scan(){
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		s=scan.nextInt();
		e=new ArrayList[n];
		c=new ArrayList[n];
		for(int i=0;i<n;i++){
			e[i]=new ArrayList<>();
			c[i]=new ArrayList<>();
		}
		for(int i=0;i<m;i++){
			int x=scan.nextInt();
			int y=scan.nextInt();
			int cost=scan.nextInt();
			e[x].add(y);
			c[x].add(cost);
		}
	}
				
	public static void main(String[] args) {
		graph_scan();
		int dic[]=dijstra(e,c,s);
		for(int i=0;i<n;i++){
			if(dic[i]==Integer.MAX_VALUE){
				System.out.println("INF");
				continue;
			}
			System.out.println(dic[i]);
		}
		
	}
	
	
	}

 class Edge implements Comparable<Edge>{
	int p;
	int c;
	
	public Edge(int p,int c) {
		this.p = p;
		this.c = c;
			}

	public Edge() {
	}

	@Override
	public int compareTo(Edge o) {
			return this.c - o.c;
	}

}