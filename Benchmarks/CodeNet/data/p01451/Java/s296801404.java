import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	static ContestScanner in;
	static Writer out;
	public static void main(String[] args) {
		Main main = new Main();
		try {
			in = new ContestScanner();
			out = new Writer();
			main.solve();
			out.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void solve() throws IOException {
		int na = in.nextInt();
		int nb = in.nextInt();
		Pos[] a = new Pos[na];
		Pos[] b = new Pos[nb];
		for(int i = 0; i < na; i++) {
			a[i] = new Pos(in.nextInt(), in.nextInt());
		}
		for(int i = 0; i < nb; i++) {
			b[i] = new Pos(in.nextInt(), in.nextInt());
		}
		double ans = shortest(a, b[0], b[1]);
		ans = Math.min(ans, shortest(b, a[0], a[1]));
		if(ans >= inf) out.println(-1);
		else out.println(ans);
	}
	
	final double inf = 1e9;
	double shortest(Pos[] p, Pos s1, Pos s2) {
		int n = p.length;
		double[] d = new double[n];
		Arrays.fill(d, inf);
		Queue<St> qu = new PriorityQueue<>();
		qu.add(new St(0, 0));
		while(!qu.isEmpty()) {
			St s = qu.poll();
			if(d[s.p] < inf) continue;
			d[s.p] = s.d;
			if(s.p == 1) {
				return s1.dist(s2) + s.d;
			}
			for(int i = 0; i < n; i++) {
				if(d[i] < inf) continue;
				if(cross(s1, s2, p[s.p], p[i])) continue;
				qu.add(new St(i, s.d + p[s.p].dist(p[i])));
			}
		}
		return inf;
	}
	
	static boolean cross(Pos p1, Pos p2, Pos p3, Pos p4){
		return ccw(p1, p2, p3) * ccw(p1, p2, p4) <= 0 && ccw(p3, p4, p1) * ccw(p3, p4, p2) <= 0;
	}
	static double cross(Pos a, Pos b){
		return a.x*b.y - b.x*a.y;
	}
	public static double cross(double x1, double y1, double x2, double y2){
		return x1*y2 - x2*y1;
	}
	// ?????£??§?¨???§???????¨????????????£
	// ?????£???????????¶????????????
	static double ccw(Pos a, Pos b, Pos c){
		double dx1 = b.x - a.x;
		double dy1 = b.y - a.y;
		double dx2 = c.x - a.x;
		double dy2 = c.y - a.y;
		return dx1*dy2 - dx2*dy1;
	}
}

class St implements Comparable<St>{
	double d;
	int p;
	public St(int p, double d) {
		this.p = p;
		this.d = d;
	}
	@Override
	public int compareTo(St o) {
		return Double.compare(d, o.d);
	}
}

class Pos {
	int x, y;
	public Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double dist(Pos p) {
		return Math.sqrt(sq(x - p.x) + sq(y - p.y));
	}
	
	long sq(long a) {
		return a * a;
	}
}

@SuppressWarnings("serial")
class MultiSet<T> extends HashMap<T, Integer>{
	@Override public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key){final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
	public MultiSet<T> merge(MultiSet<T> set)
	{MultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
	for(Entry<T,Integer>e:s.entrySet())l.add(e.getKey(),e.getValue());return l;}
}

class Writer extends PrintWriter{
	public Writer(String filename)throws IOException
	{super(new BufferedWriter(new FileWriter(filename)));}
	public Writer()throws IOException{super(System.out);}
}
class ContestScanner implements Closeable{
	private BufferedReader in;private int c=-2;
	public ContestScanner()throws IOException 
	{in=new BufferedReader(new InputStreamReader(System.in));}
	public ContestScanner(String filename)throws IOException
	{in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
	public String nextToken()throws IOException {
		StringBuilder sb=new StringBuilder();
		while((c=in.read())!=-1&&Character.isWhitespace(c));
		while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public String readLine()throws IOException{
		StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
		while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public long nextLong()throws IOException,NumberFormatException
	{return Long.parseLong(nextToken());}
	public int nextInt()throws NumberFormatException,IOException
	{return(int)nextLong();}
	public double nextDouble()throws NumberFormatException,IOException 
	{return Double.parseDouble(nextToken());}
	public void close() throws IOException {in.close();}
}