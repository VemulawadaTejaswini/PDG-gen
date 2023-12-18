import java.io.*;
import java.math.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.ArrayIndexOutOfBoundsException;

/**
 * @author yoshikyoto
 */
class Main extends MyUtil{
	// public static ArrayList<ArrayList<Integer>> g;
	public static Graph g;
	static Prime p;
	
	public static void main(String[] args) throws Exception{
		int n = readInt();
		int[] arr = readIntMap(n);
		int max = arr[1] - arr[0];
		for(int i = 2; i < n; i++){
			max = max(max, arr[i] - min(arr, 0, i-1));
		}
		p(max);
	}
}

class Data extends MyUtil{
	static int[] sum;
	static int n;
	
	String name;
	int[] d;
	int point = 0;
	Data(String str){
		String[] strs = str.split(" ");
		name = strs[0];
		int m = parseInt(strs[1]);
		d = new int[m];
		for(int i = 0; i < m; i++){
			d[i] = parseInt(strs[2+i]);
			sum[d[i]]++;
		}
	}
	
	void calcPoint(){
		for(int dd : d){
			point += (n - sum[dd] + 1);
		}
	}
}


class DataComparator implements Comparator<Data>{
    public int compare(Data a, Data b) {
    	// a-bで昇順
        if (a.point != b.point) {
            return a.point - b.point;
        } else {
        	return a.name.compareTo(b.name);
        }
    }
}

class ArrayComparator implements Comparator<int[]>{
	public int compare(int[] a, int[] b){
		int l = Math.min(a.length, b.length);
		for(int i = 0; i < l; i++){
			if(a[i] == b[i]) continue;
			return b[i] - a[i];
		}
		return 0;
	}
}

class Node extends ArrayList<Edge>{
	int index, depth = -1;
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
/*
class NodeComparator implements Comparator<Node>{
	public int compare(Node a, Node b){
		
	}
}*/
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
	void calcDepth(int root){
		QI que = new QI();
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
 * UnionFindTree Set周りは未実装
 * @author yoshikyoto
 */
class UnionFindTree{
    public int[] parent, rank;
    public int n;
    public Set<Integer> set;
    // 初期化
    UnionFindTree(int _n){
        n = _n;
        for(int i = 0; i < n; i++){
        	parent = new int[n];
        	rank = new int[n];
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
        }else{
            parent[y] = x;
            if(rank[x] == rank[y]) rank[x]++;
        }
    }
    // xとyが同じ集合か
    boolean same(int x, int y){
        return find(x) == find(y);
    }
};


/**
 * 整数を数え上げたりするクラス
 * new Prime(int n) でnまでエラトステネスの篩を実行。
 * @author yoshikyoto
 * @param a[i] iが素数の時true
 * @param count[i] i以下の素数の数
 */
class Prime{
	boolean[] a;
	int[] count;
	Prime(int n){
		a = new boolean[n+1];
		a[0] = false; a[1] = false;
		for(int i = 2; i <= n; i++) a[i] = true;
		// ふるい
		for(int i = 2; i < (n - 3) / 2; i++)
			if(a[i]) for(int j = 2; j * i <= n; j++)
					a[j * i] = false;
		
		// 数え上げ
		count = new int[n+1];
		count[0] = 0;
		for(int i = 1; i <= n; i++){
			int gain = 0;
			if(a[i]) gain = 1;
			count[i] = count[i-1] + gain;
		}
	}
	boolean isPrime(int i){return a[i];}
	static boolean calcPrime(int i){
		if(i <= 1) return false;
		if(i == 2) return true;
		if(i % 2 == 0) return false;
		for(int j = 3; j <= Math.sqrt(i); j+=2){
			if(i % j == 0) return false;
		}
		return true;
	}
}

class AI extends ArrayList<Integer>{}
class SI extends Stack<Integer>{}

class CountHashMap<E> extends HashMap<E, Integer>{
	ArrayList<E> keyArray = new ArrayList<E>();
	public void add(E key){add(key, 1);}
	public void add(E key, Integer value){
		if(containsKey(key)){value += get(key);
		}else{keyArray.add(key);}
		put(key, value);
	}
}
class HM extends CountHashMap<String>{} 

class Q<E> extends ArrayDeque<E>{
	public void push(E item){add(item);}
	public E pop(){return poll();}
}
class QS extends Q<String>{}
class QI extends Q<Integer>{}

/**
 * MyUtil
 * @author yoshikyoto
 */
class MyUtil extends MyIO{
	public static Random rand = new Random();
	public static long start_time = 0;
	public static void start(){start_time = System.currentTimeMillis();}
	public static void end(){
		if(start_time == 0) return;
		long time = System.currentTimeMillis() - start_time;
		if(DEBUG) p(time + "ms");
	}
	public static int digit(int n){return String.valueOf(n).length();}
	public static String reverse(String s){
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
	public static void sort(int[] a){Arrays.sort(a);}
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
}

/**
 * MyIO
 * @author yoshikyoto
 */
class MyIO extends MyMath{
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	public static char scNextChar(){return sc.next().charAt(0);}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static boolean DEBUG = false;
	public static String line;
	public static void debug(){DEBUG = !DEBUG;};
	public static int[] readIntMap() throws IOException{return parseInt(readLine().split(" "));}
	public static int[] readIntMap(int n) throws IOException{
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
	public static void p(Object o){System.out.println(o.toString());}
	public static void pr(Object o){System.out.print(o.toString());}
	public static void d(Object o){if(DEBUG)System.out.println(o.toString());}
	public static void dr(Object o){if(DEBUG)System.out.print(o.toString());}
	public static void da(Object[] o){if(DEBUG)System.out.println(Arrays.toString(o));}
	public static void da(int[] arr){if(DEBUG)System.out.println(Arrays.toString(arr));}
	public static void da(double[] arr){if(DEBUG)System.out.println(Arrays.toString(arr));}
	public static void da(boolean[] arr){if(DEBUG)System.out.println(Arrays.toString(arr));}
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
	public static PrintWriter getFilePrintWriter(String file) throws IOException{
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		return pw;
	}
	public static BufferedReader getFileBufferdReader(String file) throws FileNotFoundException{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		return br;
	}
}

class MyMath{
	/**
	 * 弧度法の角度を入力してsinの値を返す（Math.sin の入力はラジアン）
	 */
	public static double sin(int r){return Math.sin(Math.toRadians(r));}

	/**
	 * 弧度法の角度を入力してcosの値を返す（Math.sin の入力はラジアン）
	 */
	public static double cos(int r){return Math.cos(Math.toRadians(r));}
	public static int max(int a, int b){return Math.max(a, b);}
	public static int min(int a, int b){return Math.min(a, b);}
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
	public static int sqdist(int x1, int y1, int x2, int y2){
		return sq(x1-x2) + sq(y1-y2);}
	public static double sqdist(double x1, double y1, double x2, double y2){
		return sq(x1-x2) + sq(y1-y2);}
	public static double dist(int x1, int y1, int x2, int y2){
		return Math.sqrt(sqdist(x1, y1, x2, y2));}
	public static double dist(double x1, double y1, double x2, double y2){
		return Math.sqrt(sqdist(x1, y1, x2, y2));}
	long comb(long n, long m){
		if(n < m) return 0;
    	long c = 1; m = (n - m < m ? n - m : m);
    	for(long ns = n - m + 1, ms = 1; ms <= m; ns ++, ms ++){c *= ns; c /= ms;}
    	return c;
    }
	static int gcd(int a, int b){if(a%b==0){return(b);}else{return(gcd(b,a%b));}};

}