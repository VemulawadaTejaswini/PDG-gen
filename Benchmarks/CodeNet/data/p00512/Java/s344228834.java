import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		HashMap<String,Integer> order=new HashMap<String,Integer>();
		Vertex[] a=new Vertex[6];
		for(int i=0; i<6; i++) {
			a[i]=new Vertex();
		}
		for(int i=0; i<N; i++) {
			String t=sc.next();
			int vol=sc.nextInt();
			if(!order.containsKey(t)) {
				order.put(t, vol);
			}
			else {
				vol+=order.get(t);
				order.put(t, vol);
			}
		}
		for(int i=0; i<order.size(); i++) {

		}
		for ( String key : order.keySet() ) {
			int data = order.get( key );
			a[key.length()].add(key,data);
		}
		for(int i=1; i<=5; i++) {
			a[i].sort();
		}
		for(int h=1; h<=5; h++) {
			for(int i=0; i<a[h].size(); i++) {
				pl(a[h].getKey(i)+" "+a[h].getValue(i));
			}
		}

	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static final class Pair<K, V> {        //powered by mikit
		public K key;
		public V value;
		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
		public static int getValue(Pair<String,Integer> a) {
			return a.value;
		}
		public static String getKey(Pair<String,Integer> a) {
			return a.key;
		}
	}
	public static class Vertex{
		ArrayList <Pair<String,Integer>> rinsetu=new ArrayList<Pair<String,Integer>>();
		public void add(String key,int cost) {
			rinsetu.add(new Pair<String, Integer>(key,cost));
		}
		public String getKey(int i) {
			return Pair.getKey(rinsetu.get(i)); //Valueを取り出す
		}
		public int getValue(int i) {
			return Pair.getValue(rinsetu.get(i)); //Valueを取り出す
		}
		public void sort() {      //向かう頂点の番号順にソートします
			rinsetu.sort(Comparator.comparing(p -> p.key));
		}
		public int size() {     //次数を返す
			return rinsetu.size();
		}
	}
}

