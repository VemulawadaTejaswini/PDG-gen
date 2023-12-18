import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[])throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());

	ArrayList<ArrayList<Edge>> edge=new ArrayList<>();

	for(int i=0;i<n;i++)
	    edge.add(new ArrayList<>());

	for(int i=0;i<n;i++){
	    String str[]=br.readLine().split(" ");

	    int u=Integer.parseInt(str[0]);
	    int k=Integer.parseInt(str[1]);
	    for(int j=2;j<=k*2;j+=2){
		int v=Integer.parseInt(str[j]);
		int c=Integer.parseInt(str[j+1]);

		edge.get(u).add(new Edge(v,c));
	    }
	}
	int dist[]=dijkstra(edge,n,0);

	for(int i=0;i<n;i++){
	    System.out.println(i+" "+dist[i]);
	}
    }

    static int[] dijkstra(ArrayList<ArrayList<Edge>> edge,int n,int s){
	int dist[]=new int[n];
	int color[]=new int[n];
	PriorityQueue<Edge> pq=new PriorityQueue<>();

	Arrays.fill(dist,Integer.MAX_VALUE);
	Arrays.fill(color,0);
	dist[s]=0;
	color[s]=1;
	pq.add(new Edge(s,0));

	while(!pq.isEmpty()){
	    Edge e=pq.poll();
	    color[e.to]=2;

	    if (dist[e.to] < e.cost) {
		 continue;
	    }
	    
	    for(Edge v: edge.get(e.to)){
		if(color[v.to]==2)continue;
		
		if(dist[v.to]>dist[e.to]+v.cost){
		    dist[v.to]=dist[e.to]+v.cost;
		    pq.add(new Edge(v.to,dist[v.to]));
		    color[v.to]=1;
		}
	    }
	}
	return dist;
    }
    
}
class Edge implements Comparable<Edge>{

    int to;
    int cost;

    public Edge(int to, int cost){
	this.to=to;
	this.cost=cost;
    }
    @Override
    public int compareTo(Edge e){
	return this.cost-e.cost;
    }
}

