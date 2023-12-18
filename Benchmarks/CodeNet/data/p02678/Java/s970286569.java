import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

public class Main {
	//java11

	public static void main(String[] args) {

		FastScanner sc = new FastScanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		Graph g = new Graph(N);
		for(int i=0; i<M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			g.addEdge(g.getNode(A), g.getNode(B));
			g.addEdge(g.getNode(B), g.getNode(A));
		}

		boolean[] visited = new boolean[N];
		Arrays.fill(visited, false);
		//BFS
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(g.getNode(1));
		visited[0] = true;
		while(!queue.isEmpty()) {
			Node n = queue.poll();

			for(Edge edge : n.edges) {
				Node node = edge.to;

				if(!visited[node.value-1]) {
					queue.add(node);
					visited[node.value-1] = true;
					if(node.root != null) {
						System.out.println("No");
						return;
					}else {
						node.root = n;
					}
				}
			}
		}

		System.out.println("Yes");
		for(int i=2; i<=N; i++) {
			System.out.println(g.getNode(i).root.value);
		}

	}

	//一般的なグラフ
	public static class Graph{
		int n;
		Map<Integer, Node> nodes;	//(ノード番号, ノード)

		//1~Nまでをもつグラフ
		public Graph(int n) {
			this.n = n;
			nodes = new HashMap<>(n);

			for(int i=0; i<n; i++) {
				nodes.put(i+1, new Node());
			}
		}

		public Graph(int n, int[] values) {
			this.n = n;
			nodes = new HashMap<>(n);

			for(int i=0; i<n; i++) {
				nodes.put(values[i], new Node(values[i]));
			}
		}

		public Node getNode(int node_n) {
			//ノード番号を指定してノードを取得
			return nodes.get(node_n);
		}

		public void addEdge(Node from, Node to) {
			//重みが1のグラフの場合(重みが均等な場合にも場合によっては使える)
			from.edges.add(new Edge(to, 1));
		}

		public void addEdge(Node from, Node to, long weight) {
			//エッジの重みが異なる場合
			from.edges.add(new Edge(to, weight));
		}

		public void removeEdge(Node from, Node to) {
			//指定したノード間のエッジを削除
			from.edges.remove(new Edge(to, 1));
		}
	}

	public static int count = 0;
	//ノードを表すクラス
	public static class Node{

		int value;
		List<Edge> edges;
		boolean visited = false;
		Node root;

		public Node(){
			value = count+1;
			edges = new ArrayList<Edge>();
			count++;
		}

		public Node(int value) {
			this.value = value;
			edges = new ArrayList<Edge>();
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Node) {
				Node n = (Node)obj;
				if(this.value == n.value)
					return true;
				else
					return false;
			}

			return false;
		}

		@Override
		public int hashCode() {
			return Objects.hash(this.value);
		}
	}

	//エッジを表すクラス
	public static class Edge{
		Node to;		//行き先
		long weight;		//重み

		public Edge(Node to, long weight) {
			this.to = to;
			this.weight = weight;
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Edge) {
				Edge e = (Edge)obj;
				if(this.to.equals(e.to))
					return true;
				else
					return false;
			}

			return false;
		}

		@Override
		public int hashCode() {
			return Objects.hash(this.to);
		}
	}

	static class FastScanner {
	    private InputStream in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;

	    public FastScanner(InputStream in) {
	    	this.in = in;
	    }

	    private boolean hasNextByte() {
	        if (ptr < buflen) {
	            return true;
	        }else{
	            ptr = 0;
	            try {
	                buflen = in.read(buffer);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            if (buflen <= 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
	    public String next() {
	        if (!hasNext()) throw new NoSuchElementException();
	        StringBuilder sb = new StringBuilder();
	        int b = readByte();
	        while(isPrintableChar(b)) {
	            sb.appendCodePoint(b);
	            b = readByte();
	        }
	        return sb.toString();
	    }

	    public int nextInt() {
	        if (!hasNext()) throw new NoSuchElementException();
	        int n = 0;
	        boolean minus = false;
	        int b = readByte();
	        if (b == '-') {
	            minus = true;
	            b = readByte();
	        }
	        if (b < '0' || '9' < b) {
	            throw new NumberFormatException();
	        }
	        while(true){
	            if ('0' <= b && b <= '9') {
	                n *= 10;
	                n += b - '0';
	            }else if(b == -1 || !isPrintableChar(b)){
	                return minus ? -n : n;
	            }else{
	                throw new NumberFormatException();
	            }
	            b = readByte();
	        }
	    }

	    public long nextLong() {
	        if (!hasNext()) throw new NoSuchElementException();
	        long n = 0;
	        boolean minus = false;
	        int b = readByte();
	        if (b == '-') {
	            minus = true;
	            b = readByte();
	        }
	        if (b < '0' || '9' < b) {
	            throw new NumberFormatException();
	        }
	        while(true){
	            if ('0' <= b && b <= '9') {
	                n *= 10;
	                n += b - '0';
	            }else if(b == -1 || !isPrintableChar(b)){
	                return minus ? -n : n;
	            }else{
	                throw new NumberFormatException();
	            }
	            b = readByte();
	        }
	    }
	}

}
