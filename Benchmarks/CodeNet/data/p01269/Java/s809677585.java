

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import static java.lang.Math.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	static final int INF =1<<30;
	static class Node{
		int id,l;
		List<Edge> link=new LinkedList<Edge>();
		Node(int _id,int _l){
			id=_id;l=_l;
		}
	}
	static class Edge{
		Node from,to;
		int cost;
		Edge(Node _from,Node _to,int _cost){
			from=_from;to=_to;
			cost=_cost;
		}
		public String toString() {
			return from+"→"+to;
		}
	}
	static class Task implements Comparable<Task>{
		Node pos;
		int cost;
		Task(Node _pos,int _cost){
			pos=_pos;cost=_cost;
		}
		@Override
		public int compareTo(Task T) {
			return cost-T.cost;
		}
	}

	public static int[][] dijkstra(Node[][] graph,int s){
		final int V=graph.length, L=graph[0].length-1;
		int[][] d=new int[V][L+1];
		for(int i=0;i<V;i++)Arrays.fill(d[i],INF);d[s][L]=0;

		PriorityQueue<Task> que=new PriorityQueue<Task>();
		que.add(new Task(graph[s][L],0));
		while(!que.isEmpty()){
			Task task=que.poll();
			//if(d[task.pos]<task.cost)continue;
			for(Edge e:graph[task.pos.id][task.pos.l].link){
				if(d[e.to.id][e.to.l]>d[e.from.id][e.from.l]+e.cost){
					d[e.to.id][e.to.l]=d[e.from.id][e.from.l]+e.cost;
					que.add(new Task(e.to,d[e.to.id][e.to.l]));
				}
			}
		}
		return d;
	}

	public void run() {

		TCase:while(true){
			int N=sc.nextInt(),M=sc.nextInt(),L=sc.nextInt();
			if(N==0)return;
			Node[][] graph=new Node[N][L+1];
			for(int i=0;i<N;i++)for(int j=0;j<=L;j++)
				graph[i][j]=new Node(i,j);

			//edge
			for(int i=0;i<M;i++){
				int f=sc.nextInt()-1,t=sc.nextInt()-1;
				int d=sc.nextInt(),c=sc.nextInt();

				for(int l=0;l<=L;l++)if(l-d>=0){
					graph[f][l].link.add(new Edge(graph[f][l],graph[t][l-d],0));
					graph[t][l].link.add(new Edge(graph[t][l],graph[f][l-d],0));
				}
				for(int l=0;l<=L;l++){
					graph[f][l].link.add(new Edge(graph[f][l],graph[t][l],c));
					graph[t][l].link.add(new Edge(graph[t][l],graph[f][l],c));
				}
			}
			int[][] d=dijkstra(graph,0);

			int mv=INF;
			for(int l=0;l<=L;l++){
				mv=min(mv,d[N-1][l]);
			}
			ln(mv);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	//output lib
	static final String br=System.getProperty("line.separator");
	static final String[] asep=new String[]{""," ",br,br+br};
	static String str(Boolean o){
		return o?"YES":"NO";
	}
//	static String str(Double o){
//		return String.format("%.8f",o);
//	}
	static <K,V> String str(Map<K, V> map){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(Entry<K,V> set:map.entrySet()){
			if(!isFirst)sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst=false;
		}
		return sb.toString();
	}
	static <E> String str(Collection<E> list){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(E e:list){
			if(!isFirst)sb.append(" ");
			sb.append(str(e));
			isFirst=false;
		}
		return sb.toString();
	}

	static String str(Object o){
		int depth=_getArrayDepth(o);
		if(depth>0)return _strArray(o,depth);
		Class<?> c=o.getClass();
		if(c.equals(Boolean.class))return str((Boolean)o);
		//if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}
	static int _getArrayDepth(Object o){
		if(!o.getClass().isArray() || Array.getLength(o)==0) return 0;
		return 	1+_getArrayDepth(Array.get(o,0));
	}
	static String _strArray(Object o,int depth){
		if(depth==0) return str(o);
		StringBuilder sb=new StringBuilder();
		for(int i=0,len=Array.getLength(o);i<len;i++){
			if(i!=0)sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o,i),depth-1));
		}
		return sb.toString();
	}
	static void pr(Object... os){
		boolean isFirst=true;
		for(Object o:os){
			if(!isFirst)out.print(" ");
			out.print(o);
			isFirst=false;
		}
	}
	static void ln(){
		out.println();
	}
	static void ln(Object... os){
		for(Object o:os){
			pr(o);ln();
		}
	}
}