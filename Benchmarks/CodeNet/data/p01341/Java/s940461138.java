import static java.lang.System.*;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

class Main {

	static final int INF =1<<30;

	static class Node{
		int id;
		List<Edge> link=new LinkedList<Edge>();
		Node(int _id){
			id=_id;
		}
	}
	static class Edge{
		int id,from,to;
		double cost;
		Edge(int _id,int _from,int _to,double _cost){
			id=_id;from=_from;to=_to;cost=_cost;
		}
		public String toString() {
			return from+"→"+to;
		}
	}

	public static class UnionFind{
		public int[] par,rank;
		public int size;
		public UnionFind(int n){
			par=new int[n];
			for(int i=0;i<n;i++)par[i]=i;
			rank=new int[n];
			size=n;
		}
		public int find(int x){
			if(par[x]==x)return x;
			return par[x]=find(par[x]);
		}
		public boolean same(int x,int y){
			return find(x)==find(y);
		}
		public void unite(int x,int y){
			x=find(x);y=find(y);
			if(x==y)return;

			if(rank[x]<rank[y])par[x]=y;
			else par[y]=x;
			if(rank[x]==rank[y]) rank[x]++;
			size--;
		}
	}


    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    public void run() {
    	int n=sc.nextInt(),m=sc.nextInt();

    	Node[] ns=new Node[n];
    	for(int i=0;i<n;i++)
    		ns[i]=new Node(i);
    	double[] px=new double[n],py=new double[n];
    	for(int i=0;i<n;i++){
    		px[i]=sc.nextDouble();
    		py[i]=sc.nextDouble();
    	}
    	Edge[] es=new Edge[m];
    	for(int i=0;i<m;i++){
    		int f=sc.nextInt()-1,t=sc.nextInt()-1;
    		es[i]=new Edge(i,f,t,Math.sqrt((px[f]-px[t])*(px[f]-px[t])+(py[f]-py[t])*(py[f]-py[t])));
    		ns[f].link.add(es[i]);
    		ns[t].link.add(new Edge(i,t,f,Math.sqrt((px[f]-px[t])*(px[f]-px[t])+(py[f]-py[t])*(py[f]-py[t]))));
    	}

    	boolean[] uses=kruskal(ns, es);


    	double res=0;
    	for(int i=0;i<m;i++){
    		if(!uses[i])res+=es[i].cost;
    	}

    	ln(str(res));
    }

  //O(E*log(V))
    public static boolean[] kruskal(Node[] graph,Edge[] edge){
    	final int V=graph.length,E=edge.length;
    	UnionFind uf=new UnionFind(V);
    	boolean[] use=new boolean[E];

    	PriorityQueue<Edge> que=new PriorityQueue<Edge>(20,new Comparator<Edge>(){
    		@Override
    		public int compare(Edge o1, Edge o2) {
    			return -(int)Math.signum(o1.cost-o2.cost);
    		}
    	});
    	for(int u=0;u<V;u++)for(Edge e : graph[u].link){
    		if(u<e.to)que.add(e);
    	}
    	while(!que.isEmpty()){
    		Edge e=que.poll();
    		if(!uf.same(e.from,e.to)){
    			uf.unite(e.from,e.to);
    			use[e.id]=true;
    		}
    	}
    	return use;
    }


    public static void main(String[] args) {
        new Main().run();
    }


	//output lib
	static final String br = System.getProperty("line.separator");
	static final String[] asep = new String[] { "", " ", br, br + br };

	static String str(Boolean o) {
		return o ? "YES" : "NO";
	}

		static String str(Double o){
			return String.format("%.8f",o);
		}
	static <K, V> String str(Map<K, V> map) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (Entry<K, V> set : map.entrySet()) {
			if (!isFirst)
				sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst = false;
		}
		return sb.toString();
	}

	static <E> String str(Collection<E> list) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (E e : list) {
			if (!isFirst)
				sb.append(" ");
			sb.append(str(e));
			isFirst = false;
		}
		return sb.toString();
	}

	static String str(Object o) {
		int depth = _getArrayDepth(o);
		if (depth > 0)
			return _strArray(o, depth);
		Class<?> c = o.getClass();
		if (c.equals(Boolean.class))
			return str((Boolean) o);
		if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}

	static int _getArrayDepth(Object o) {
		if (!o.getClass().isArray() || Array.getLength(o) == 0)
			return 0;
		return 1 + _getArrayDepth(Array.get(o, 0));
	}

	static String _strArray(Object o, int depth) {
		if (depth == 0)
			return str(o);
		StringBuilder sb = new StringBuilder();
		for (int i = 0, len = Array.getLength(o); i < len; i++) {
			if (i != 0)
				sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o, i), depth - 1));
		}
		return sb.toString();
	}

	static void pr(Object... os) {
		boolean isFirst = true;
		for (Object o : os) {
			if (!isFirst)
				out.print(" ");
			out.print(o);
			isFirst = false;
		}
	}

	static void ln() {
		out.println();
	}

	static void ln(Object... os) {
		for (Object o : os) {
			pr(o);
			ln();
		}
	}
}