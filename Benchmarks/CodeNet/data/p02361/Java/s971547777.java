import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Edge{
	int u,v;
	int weight;
}

public class Main{
	int nodenum, edgenum, source;
	int[] dist;
	Edge[] edge;
	public static void main(String[] args) throws IOException{
		Main f = new Main();
		f.init();
		if (f.Bellman_Ford()){
			for(int i=0;i<f.nodenum;i++){
				if(f.dist[i]==100000){
					System.out.println("INF");
				}else{
					System.out.println(f.dist[i]);
				}
			}
		}
	}
	public void init() throws IOException{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String str = BR.readLine();
		String [] arr = str.split("\\s+");
		this.nodenum = Integer.parseInt(arr[0]);
		this.edgenum = Integer.parseInt(arr[1]);
		this.source = Integer.parseInt(arr[2]);
		dist = new int[nodenum];
		edge = new Edge[edgenum];
		for(int i=0;i<edgenum;i++){
			edge[i] = new Edge();
		}
		for(int i=0;i<nodenum;i++){
			dist[i] = 100000;
		}
		dist[source] = 0;
		for(int i=0;i<edgenum;i++){
			String tempstr = BR.readLine();
			String [] temparr = tempstr.split("\\s+");
			int p1 = Integer.parseInt(temparr[0]);
			int p2 = Integer.parseInt(temparr[1]);
			int w = Integer.parseInt(temparr[2]);
			edge[i].u = p1;
			edge[i].v = p2;
			edge[i].weight = w;
			if(edge[i].u == source){
				dist[edge[i].v] = edge[i].weight;
			}
		}
	}
	
	public void relax(int u, int v, int weight){
		if(dist[v]>dist[u] + weight){
			//System.out.println(dist[v]+" "+dist[u]+" "+weight);
			dist[v] = dist[u] + weight;
			//System.out.println(dist[v]);
		}
	}
	
	public boolean Bellman_Ford(){
		for(int i=0;i<nodenum-1;i++){
			for(int j=0;j<edgenum; j++){
				relax(edge[j].u, edge[j].v, edge[j].weight);
			}
		}
		boolean flag = true;
		for(int i=0;i<edgenum;i++){
			if(dist[edge[i].v] > dist[edge[i].u] + edge[i].weight){
				flag = false;
				break;
			}
		}
		return flag;
	}
}