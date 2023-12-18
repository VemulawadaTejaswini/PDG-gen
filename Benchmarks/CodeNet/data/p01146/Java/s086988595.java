
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.Math.*;

import java.util.*;


public class Main {

	public static Scanner sc=new Scanner(in);

	static class Node{
		int id;
		int fp;
		boolean isC;
		List<Edge> link=new ArrayList<Edge>();

		Node(int _id,int _fp,boolean _isC){
			id=_id;
			fp=_fp;
			isC=_isC;
		}
	}

	static class Edge{
		Node f,t;
		int cost;
		Edge(Node _f,Node _t,int _cost){
			f=_f;t=_t;cost=_cost;
		}
	}

	static class Task implements Comparable<Task>{
		Node node;
		int time;
		Task(Node _node,int _time){
			node=_node;time=_time;
		}
		public int compareTo(Task arg0){
			return time-arg0.time;
		}
	}

	public static int[][] dijkstra(Node[][] graph,int s){
		int n=graph.length,M=graph[0].length-1;
		PriorityQueue<Task> que=new PriorityQueue<Task>();
		int[][] d=new int[n][M+1];
		for(int i=0;i<n;i++)
			Arrays.fill(d[i],1<<30);
		que.offer(new Task(graph[s][M],0));
		d[s][M]=0;
		while(!que.isEmpty()){
			Task di=que.poll();
			if(d[di.node.id][di.node.fp]<di.time)continue;
			for(Edge edge:di.node.link){
				if(d[edge.t.id][edge.t.fp]>d[di.node.id][di.node.fp]+edge.cost){
					d[edge.t.id][edge.t.fp]=d[di.node.id][di.node.fp]+edge.cost;
					que.offer(new Task(edge.t,d[di.node.id][di.node.fp]));

					//prev[edge.to]=di.id;
				}
			}
		}
		return d;
	}

	public void run(){
		while(true){
			int n=sc.nextInt(),m=sc.nextInt(),l=sc.nextInt(),
					k=sc.nextInt(),s=sc.nextInt(),e=sc.nextInt();
			if(n==0)return;

			boolean[] ccity=new boolean[n];
			for(int i=0;i<l;i++){
				int v=sc.nextInt();
				ccity[v]=true;
			}
			ccity[s]=ccity[e]=true;

			long[][] d=new long[n][n];

			for(int i=0;i<n;i++){
				Arrays.fill(d[i],1<<30);
				d[i][i]=0;
			}
			for(int i=0;i<k;i++){
				int x=sc.nextInt(),y=sc.nextInt(),t=sc.nextInt();
				d[x][y]=d[y][x]=t;
			}
		    for(int _k=0;_k<n;_k++)
		    	for(int i=0;i<n;i++)for(int j=0;j<n;j++)
		    		d[i][j] = min(d[i][j], d[i][_k] + d[_k][j]);

		    for(int i=0;i<n;i++)for(int j=0;j<n;j++){
		    	if(d[i][j]>m || !ccity[i] || !ccity[j])d[i][j]=1<<30;
		    }

		    for(int _k=0;_k<n;_k++)
		    	for(int i=0;i<n;i++)for(int j=0;j<n;j++)
		    		d[i][j] = min(d[i][j], d[i][_k] + d[_k][j]);

			if(d[s][e]==1<<30)
				ln("Help!");
			else{
				ln(d[s][e]+max(0,d[s][e]-m));
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

	//output lib
	public static void ln(){
		out.println();
	}
	public static void pr(Object obj){
		out.print(str(obj));
	}
	public static void ln(Object obj){
		pr(obj);ln();
	}
	public static String str(Object obj){
		return obj.toString();
	}
	public static <E> String str(E[] obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.length;i++){
			sb.append(i==0?"":" ").append(obj[i]);
		}
		return sb.toString();
	}
	public static <E> String str(List<E> obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.size();i++){
			sb.append(i==0?"":" ").append(obj.get(i));
		}
		return sb.toString();
	}


}