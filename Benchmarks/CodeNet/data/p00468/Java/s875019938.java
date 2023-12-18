import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main{
	static int[] sum=new int[10000];
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		while(true) {
			int N=sc.nextInt();
			int K=sc.nextInt();
			if(N*K==0) {
				System.exit(0);
			}
			Vertex[] graph=new Vertex[N];
			for(int i=0; i<N; i++) {
				graph[i]=new Vertex();
			}
			for(int i=0; i<K; i++) {
				int from=sc.nextInt()-1;
				int to=sc.nextInt()-1;
				graph[from].add(to, 1);
				graph[to].add(from, 1);
			}
			int[] cost=new int[N];
			boolean[] used=new boolean[N];
			Arrays.fill(cost, 1000000007);
			cost[0]=0;
			while(true) {
				int v=-1;
				for(int i=0; i<N; i++) {
					if(!used[i] && (v==-1 || cost[v]>cost[i])) {
						v=i;
					}
				}
				if(v==-1) {
					break;
				}
				else {
					used[v]=true;
					for(int i=0; i<N; i++) {
						int add=1145141919;
						if(graph[v].find_Vertex(i)!=-1) {
							add=graph[v].getValue(graph[v].find_Vertex(i));
						}
						cost[i]=Math.min(cost[i], cost[v]+add);		//経路の最短を更新する
					}
				}
			}
			int num=0;
			for(int i=1; i<N; i++) {
				if(cost[i]<=2) {
					num++;
				}
			}
			pl(num);
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
	public static final class Pair<K, V>{        //powered by mikit
		//Pair<任意の型、任意の型>だが、下の機能すべて使うには、Pair<Integer,Integer>でないと不可能
		public K key;
		public V value;
		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
		public static int getValue(Pair<Integer,Integer> a) {
			return a.value;
		}
		public static int getKey(Pair<Integer,Integer> a) {
			return a.key;
		}
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Pair<?, ?> pair = (Pair<?, ?>) o;
			return Objects.equals(key, pair.key) &&
					Objects.equals(value, pair.value);
		}
		public int hashCode() {
			return Objects.hash(key, value);
		}
		public String toString() {
			return "Pair{" +
					"x=" + key +
					", y=" + value +
					'}';
		}
	}
	public static class Vertex{
		ArrayList <Pair<Integer,Integer>> rinsetu=new ArrayList<Pair<Integer,Integer>>();
		public void add(int V,int cost) {
			rinsetu.add(new Pair<Integer, Integer>(V,cost));
		}
		public void show() {        //隣接リストを出力
			for(int i=0; i<rinsetu.size(); i++) {
				System.out.println(rinsetu.get(i));
			}
		}
		public void sort_by_cost() {        //コストの低い順にソートします
			rinsetu.sort(Comparator.comparing(p -> p.value));
		}
		public void sort_by_Vertex() {      //向かう頂点の番号順にソートします
			rinsetu.sort(Comparator.comparing(p -> p.key));
		}
		public int getValue(int i) {
			return Pair.getValue(rinsetu.get(i));   //Valueを取り出す
		}
		public Pair<Integer,Integer> get(int i) {
			return rinsetu.get(i);   //Pairをぶっこ抜く
		}
		public int getKey(int i) {
			return Pair.getKey(rinsetu.get(i)); //Valueを取り出す
		}
		public void changeKey(int i,int value) {	//リストのペアの前の値（Key,Value）のKeyを書き換え
			Pair<Integer,Integer> tmp=new Pair<Integer, Integer>(value,Pair.getValue(rinsetu.get(i)));
			rinsetu.set(i, tmp);
		}
		public void changeValue(int i,int value) {	//リストのペアの後ろの値（Key,Value）のValueを書き換え
			Pair<Integer,Integer> tmp=new Pair<Integer, Integer>(Pair.getKey(rinsetu.get(i)),value);
			rinsetu.set(i, tmp);
		}
		public void changeKeyValue(int i,int key,int value) {	//リストのペアを書き換え（Key,Valueどちらも）
			Pair<Integer,Integer> tmp=new Pair<Integer, Integer>(key,value);
			rinsetu.set(i, tmp);
		}
		public int size() {     //次数を返す
			return rinsetu.size();
		}
		public int find_Vertex(int a) {     //ある頂点から本当に特定の辺に行くか？  逐次探索なので速さはお察し
			for(int i=0; i<rinsetu.size(); i++) {
				if(a==Pair.getKey(rinsetu.get(i))) {
					return i;
				}
			}
			return -1;
		}
	}
}
