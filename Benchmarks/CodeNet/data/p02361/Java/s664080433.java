
import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class Main{
	public void solve(){
		int V = nextInt();
		int E = nextInt();
		int r = nextInt();
		Node[] nodes = new Node[V];
		for(int i = 0; i < V; i++){
			nodes[i] = new Node(i);
		}
		for(int i = 0; i < E; i++){
			int s = nextInt();
			int t = nextInt();
			int c = nextInt();
			nodes[s].addPath(nodes[t], c);
		}
		nodes[r].dijkstra();
		for(Node n : nodes){
			if(n.distance == Integer.MAX_VALUE){
				out.println("INF");
			}else{
				out.println(n.distance);
			}
		}
	}
	

	class Node{
		int idx;
		int distance;
		List<Path> next;
		public Node(int idx){
			this.idx = idx;
			this.distance = Integer.MAX_VALUE;
			next = new LinkedList<>();
		}
		public void addPath(Node to, int weight){
			next.add(new Path(this, to, weight));
		}
		

		
		public void dijkstra(){
			distance = 0;
			PriorityQueue<Node> queue = new PriorityQueue<>((a, b) -> Integer.compare(a.distance, b.distance));
			queue.offer(this);
			while(!queue.isEmpty()){
				Node n = queue.poll();
				for(Path p : n.next){
					int d = n.distance + p.weight;
					if(d < p.to.distance){
						p.to.distance = d;
						queue.offer(p.to);
					}
				}
			}
		}
	}
	
	class Path{
		Node from;
		Node to;
		int weight;
		
		public Path(Node from, Node to, int weight){
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
	}
	
	public class Dijkstra {
	}


	
	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}
	
	
	
	public static int nextInt(){
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}

	
	public static long nextLong(){
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}
	public static String next(){
		int c;
		while(!isAlNum(c = read())){}
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	
	
	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;
	private static int read(){
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}
	
	private static boolean isAlNum(int c){
		return '!' <= c && c <= '~';
	}
}