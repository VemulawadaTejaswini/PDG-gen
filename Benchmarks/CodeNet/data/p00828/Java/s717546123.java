import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.BigInteger;


/**
 * @author yoshikyoto
 */
class Main extends MyUtil{
	// public static Graph g;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			if(n == 0 && m == 0 && p == 0) break;
			
			Board b = new Board(n, m);
			int[] x = new int[p];
			int[] y = new int[p];
			for (int i = 0; i < p; i++) {
				x[i] = sc.nextInt() - 1;
				y[i] = sc.nextInt() - 1;
			}

			int turn = 1;
			for(int i = 0; i < p; i++) {
				if(b.put(x[i], y[i], turn)) {
					if(turn == 1){
						System.out.println("Black " + (i+1));
						turn = 0;
						break;
					}else{
						System.out.println("White " + (i+1));
						turn = 0;
						break;
					}
				}
				turn *= -1;
			}
			if(turn != 0){
				System.out.println("Draw");
			}
		}
	}
}

class Board{
	int n,m;
	int[][][] board;
	int[] dx = {
			-1,-1,-1,-1,-1,-1,-1,-1,-1,
			0,0,0,0 /*,0,0,0,0,
			1,1,1,1,1,1,1,1,1*/
	};
	int[] dy = {
			-1,-1,-1,0,0,0,1,1,1,
			-1,-1,-1,0 /*,0,1,1,1,
			-1,-1,-1,0,0,0,1,1,1*/
	};
	int[] dz = {
			-1,0,1,-1,0,1,-1,0,1,
			-1,0,1,-1 /*,1,-1,0,1,
			-1,0,1,-1,0,1,-1,0,1*/
	};
	
	Board(int n, int m){
		this.n = n;
		this.m = m;
		board = new int[n][n][n];
	}
	
	boolean put(int x, int y, int c){
		int z;
		for(z = 0; z < n; z++){
			if(board[x][y][z] == 0){
				board[x][y][z] = c;
				break;
			}
		}
		// チェックする
		for(int i = 0; i < dx.length; i++){
			int cnt = 1;
			try{
				for(int mult = 1; mult <= m; mult++){
					if(board[x + mult*dx[i]][y + mult*dy[i]][z + mult*dz[i]] == c){
						cnt++;
					}else{
						break;
					}
				}
			}catch(Exception e){}

			try{
				for(int mult = 1; mult <= m; mult++){
					if(board[x - mult*dx[i]][y - mult*dy[i]][z - mult*dz[i]] == c){
						cnt++;
					}else{
						break;
					}
				}
			}catch(Exception e){}
			if(cnt >= m) return true;
		}
		return false;
	}
}

// --- ここから下はライブラリ ----------
 
class ArrayComp implements Comparator<int[]>{
	public int compare(int[] a, int[] b){
		int l = Math.min(a.length, b.length);
		for(int i = 0; i < l; i++){
			if(a[i] == b[i]) continue;
			return a[i] - b[i];
		}
		return 0;
	}
}
 
class Node extends ArrayList<Edge>{
	int index, depth = -1, dist = -1;
	Node(int index){this.index = index;}
	Node parent;
	boolean visited = false;
}
class Edge{
	int from, to, cost;
	Edge(int from, int to, int cost){
		this.from = from;
		this.to = to;
		this.cost = cost;
	}
}
class NodeComparator implements Comparator<Node>{
	public int compare(Node a, Node b){
		return a.dist - b.dist;
	}
}
 
class Graph{
	Node n[];
	Graph(int node_count){
		n = new Node[node_count];
		for(int i = 0; i < node_count; i++) n[i] = new Node(i);
	}
	public void add(Edge e){
		n[e.from].add(e);
	}
	public Node get(int i){return n[i];}
	public Node lca(int a, int b){
		// 浅い方をaとする
		Node nodeA, nodeB;
		if(n[a].depth < n[b].depth){
			nodeA = n[a];
			nodeB = n[b];
		}else{
			nodeA = n[b];
			nodeB = n[a];
		}
		// 同じ深さまで親をたどる
		int diff = nodeB.depth - nodeA.depth;
		for(int k = 0; k < diff; k++){
			nodeB = nodeB.parent;
		}
		// 共通祖先を見つける
		while(nodeA != nodeB){
			nodeA = nodeA.parent;
			nodeB = nodeB.parent;
		}
		return nodeA;
	}
	public void calcDepth(int root){
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		que.push(root);
		n[root].depth = 0;
 
		while(que.size() > 0){
			int curr = que.pop();
			Node curr_node = n[curr];
			for(Edge e : curr_node){
				int next = e.to;
				Node next_node = n[next];
				if(next_node.depth == -1){
					next_node.depth = curr_node.depth + 1;
					next_node.parent = curr_node;
					que.push(next);
				}
			}
		}
	}
 
	public int[] dijkstra(int s){
		PriorityQueue<Node> q = new PriorityQueue<Node>(n.length, new NodeComparator());
		Node start_node = new Node(s);
		start_node.dist = 0;
		q.add(start_node);
		int[] dist = new int[n.length];
		for (int i = 0; i < dist.length; i++)  dist[i] = -1;
		dist[s] = 0;
 
		while(q.size() > 0){
			Node currNode = q.poll();
			if(dist[currNode.index] < currNode.dist) continue;
			for(Edge e : n[currNode.index]){
				Node nextNode = new Node(e.to);
				nextNode.dist = currNode.dist + e.cost;
				if(dist[e.to] == -1 || dist[e.to] > nextNode.dist){
					dist[e.to] = nextNode.dist;
					q.add(nextNode);
				}
			}
		}
		return dist;
	}
}
 
 
 
class Regex{
	Pattern p; Matcher m; String str;
	Regex(String regex_str){p = Pattern.compile(regex_str);}
	void setStr(String str){m = p.matcher(str);}
	boolean find(){return m.find();}
	String group(int i){return m.group(i);}
	String group(){return m.group();}
}
 
/**
 * UnionFindTree 
 * @author yoshikyoto
 */
class UnionFindTree{
	public int[] parent, rank;
	public int n;
	public int count;
	// 初期化
	UnionFindTree(int n){
		this.n = n;
		count = n;
		parent = new int[n];
		rank = new int[n];
		for(int i = 0; i < n; i++){
			parent[i] = i;
			rank[i] = 0;
		}
	}
	// 根を求める
	int find(int x){
		if(parent[x] == x){
			return x;
		}else{
			return parent[x] = find(parent[x]);
		}
	}
	// xとyの集合を結合
	void unite(int x, int y){
		x = find(x);
		y = find(y);
		if(x == y){
			return;
		}
		if(rank[x] < rank[y]){
			parent[x] = y;
			count--;
		}else{
			parent[y] = x;
			if(rank[x] == rank[y]) rank[x]++;
			count--;
		}
	}
	// xとyが同じ集合か
	boolean same(int x, int y){
		return find(x) == find(y);
	}
};
 
 

 
class CountHashMap<E> extends HashMap<E, Integer>{
	ArrayList<E> keyArray = new ArrayList<E>();
	public void add(E key){add(key, 1);}
	public void add(E key, Integer value){
		if(containsKey(key)){value += get(key);
		}else{keyArray.add(key);}
		put(key, value);
	}
}
 
/**
 * MyUtil
 * @author yoshikyoto
 */
class MyUtil extends MyIO{
	public static Random rand = new Random();
	public static int digit(int n){return String.valueOf(n).length();}
	public static String reverse(String s){return (new StringBuffer(s)).reverse().toString();}
	public static void dsort(int[] a){
		Arrays.sort(a);
		int l = a.length;
		for(int i = 0; i < l/2; i++){
			int tmp = a[i]; a[i] = a[l-1-i]; a[l-1-i] = tmp;
		}
	}
	public static void sleep(int t){try{Thread.sleep(t);}catch(Exception e){}}
	public static int sum(int[] a){int s = 0; for(int i = 0; i < a.length; i++)s+=a[i]; return s;}
	public static int[] cp(int[] a){
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++) b[i] = a[i];
		return b;
	}
	public static int randomInt(int min, int max){return min + rand.nextInt(max - min + 1);}
	static boolean inside(int y, int x, int h, int w){return 0 <= y && y <= (h-1) && 0 <= x && x <= (w-1);};
	public static boolean isUpper(char c){return 'A'<=c&&c<='Z';}
	public static boolean isLower(char c){return 'a'<=c&&c<='z';}
	public static char toUpper(char c){
		if(isLower(c)) return (char)(c - 'a' + 'A');
		return c;
	}
	public static char toLower(char c){
		if(isUpper(c)) return (char)(c - 'A' + 'a');
		return c;
	}
	public static int[] swap(int[] arr, int i, int j){
		int[] ret = cp(arr);
		int tmp = ret[i];
		ret[i] = ret[j];
		ret[j] = tmp;
		return ret;
	}
	public static int toInt(boolean[] a){
		int pow = 1, ret = 0, l = a.length;
		for(int i = 0; i < l; i++){
			if(a[i]) ret += pow;
			pow *= 2;
		}
		return ret;
	}
}
 
/**
 * MyIO
 * @author yoshikyoto
 */
class MyIO extends MyMath{
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	public static char scNextChar(){return sc.next().charAt(0);}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static String line;
 
	public static int ins[];
	public static int[] readIntMap() throws IOException{return parseInt(readLine().split(" "));}
	public static int readIntMap(int i) throws Exception{
		if(i == 0) ins = readIntMap();
		return ins[i];
	}
	public static int[][] readIntMap(int n, int m) throws IOException{
		int[][] ret = new int[n][];
		for(int i = 0; i < n; i++) ret[i] = readIntMap();
		return ret;
	}
	public static int[] readIntToMap(int n) throws IOException{
		int[] ret = new int[n];
		for(int i = 0; i < n; i++) ret[i] = readInt();
		return ret;
	}
	public static int[] readNoDistIntMap() throws IOException{
		String[] strs = readLine().split("");
		int l = strs.length;
		int[] ret = new int[l-1];
		for(int i = 1; i < l; i++)
			ret[i-1] = parseInt(strs[i]);
		return ret;
	}
	public static boolean readToLine() throws IOException{return (line = br.readLine()) != null;}
	public static String readLine() throws IOException{return br.readLine();}
	public static int readInt() throws IOException{return Integer.parseInt(br.readLine());}
	public static int[] parseInt(String[] arr){
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Integer.parseInt(arr[i]);
		return res;
	}
	public static double[] parseDouble(String[] arr){
		double[] res = new double[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Double.parseDouble(arr[i]);
		return res;
	}
	public static boolean[] parseBool(String[] arr){
		int[] t = parseInt(arr);
		boolean[] res = new boolean[t.length];
		for(int i = 0; i < t.length; i++){
			if(t[i] == 1){res[i] = true;
			}else{res[i] = false;}
		}
		return res;
	}
	public static int parseInt(Object o){return Integer.parseInt(o.toString());}
}
 
class MyMath{
	public static int max(int[] arr){return max(arr, 0, arr.length-1);}
	public static int max(int[] arr, int l, int r){
		int max = arr[l];
		for(int i = l+1; i <= r; i++)
			max = Math.max(max, arr[i]);
		return max;
	}
	public static int min(int[] arr){return min(arr, 0, arr.length-1);}
	public static int min(int[] arr, int l, int r){
		int min = arr[l];
		for(int i = l+1; i <= r; i++)
			min = Math.min(min, arr[i]);
		return min;
	}
	public static boolean isCross(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
		// 並行な場合
		int m = (x2-x1)*(y4-y3)-(y2-y1)*(x4-x3);
		if(m == 0) return false;
		// 媒介変数の値が0より大きく1以下なら交差する、これは問題の状況によって変わるかも。
		double r =(double)((y4-y3)*(x3-x1)-(x4-x3)*(y3-y1))/m;
		double s =(double)((y2-y1)*(x3-x1)-(x2-x1)*(y3-y1))/m;
		return (0 < r && r <= 1 && 0 < s && s <= 1);
	}
	public static boolean isParallel(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
		if((x2-x1)*(y4-y3) == (y2-y1)*(x4-x3)) return true;
		else return false;
	}
	public static double sq(double d){return d*d;}
	public static int sq(int i){return i*i;}
	public static int sqdist(int x1, int y1, int x2, int y2){return (x1-x2) + sq(y1-y2);}
	public static double sqdist(double x1, double y1, double x2, double y2){return sq(x1-x2) + sq(y1-y2);}
	public static double dist(int x1, int y1, int x2, int y2){return Math.sqrt(sqdist(x1, y1, x2, y2));}
	public static double dist(double x1, double y1, double x2, double y2){return Math.sqrt(sqdist(x1, y1, x2, y2));}
	static long comb(long n, long m){
		if(n < m) return 0;
		long c = 1; m = (n - m < m ? n - m : m);
		for(long ns = n - m + 1, ms = 1; ms <= m; ns ++, ms ++){c *= ns; c /= ms;}
		return c;
	}
	static int gcd(int a, int b){if(a%b==0){return(b);}else{return(gcd(b,a%b));}};
	/**
	 * aの中から、合計がborderを超えるペア（重複除く）の数を数える
	 */
	static int countPair(int[] a, int border){
		int count = 0, l = a.length, i = 0, j = l-1;
		for (; i < l; i++) {
			for (; j >= 0; j--) if(a[i] + a[j] <= border) break;
			count += l - (j + 1);
			if(j < i) count--;
		}
		return count/2;
	}
	// modに対応したDPのCombination
	static int mcomb(int n, int m, int mod){
		n = n - m;
		int[][] dp = new int[n+1][m+1];
		for(int i = 0; i <= n; i++) dp[i][0] = 1;
		for(int i = 0; i <= m; i++) dp[0][i] = 1;
		// mod = 0 の時は余りを取らない
		if(mod != 0){
			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= m; j++){
					dp[i][j] = (dp[i-1][j] + dp[i][j-1]);
				}
			}
			return dp[n][m];
		// それ以外の時は mod をとっていく
		}else{
			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= m; j++){
					dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % mod;
				}
			}
			return dp[n][m] % mod;
		}
	}
	

	static long mcomb(int n, int m, long mod){
		n = n - m;
		long[][] dp = new long[n+1][m+1];
		for(int i = 0; i <= n; i++) dp[i][0] = 1;
		for(int i = 0; i <= m; i++) dp[0][i] = 1;
		// mod = 0 の時は余りを取らない
		if(mod != 0){
			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= m; j++){
					dp[i][j] = (dp[i-1][j] + dp[i][j-1]);
				}
			}
			return dp[n][m];
		// それ以外の時は mod をとっていく
		}else{
			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= m; j++){
					dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % mod;
				}
			}
			return dp[n][m] % mod;
		}
	}
}