import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int V=sc.nextInt();	//頂点数
		int E=sc.nextInt();	//辺の数
		int start=sc.nextInt();	//スタート地点の頂点
		int[] distance=new int[V];	//各頂点の最短距離
		int INF=1000000007;	//十分に大きな定数
		Vertex[] graph=new Vertex[V];
		for(int i=0; i<V; i++) {
			graph[i]=new Vertex();
		}
		for(int i=0;i<E; i++) {
			int from=sc.nextInt();
			int to=sc.nextInt();
			int cost=sc.nextInt();
			graph[from].add(to, cost);
		}

		PriorityQueue<Pair<Integer,Integer>> que =new PriorityQueue<Pair<Integer,Integer>>();
		Arrays.fill(distance, INF);	//距離が未確定なのでスタート地点からの距離は無限遠
		distance[start]=0;	//スタート地点からスタート地点までの距離は当然0
		Pair<Integer,Integer> s=new Pair<Integer,Integer>(start,0);	//コスト、頂点の番号
		que.add(s);	//スタート地点の情報をPriortyQueueに入れる
		Pair<Integer,Integer> tmp=new Pair<Integer,Integer>(0,0);	//一時的な変数

		while(que.size()>0) {
			tmp=que.poll();
			int vertex=Pair.getKey(tmp);	//頂点の番号を取得
			if(distance[vertex]<Pair.getValue(tmp)) {	//キューに入っていた頂点とその頂点までの距離が現在の最短距離の値よりも大きい時、その値を用いて最短距離を更新することはできないので、キューから新しい情報を得るためにこのループを終了させる
				continue;
			}
			else {//最短経路を更新できる可能性があるときは、
				for(int i=0; i<graph[vertex].size(); i++) {
					tmp=graph[vertex].get(i);
					int to=Pair.getKey(tmp);
					int cost=Pair.getValue(tmp);
					if(distance[to]>distance[vertex]+cost) {
						distance[to]=distance[vertex]+cost;
						tmp=new Pair<Integer,Integer>(to,distance[to]);
						que.add(tmp);
					}
				}
			}
		}
		for(int i=0; i<V; i++) {
			if(distance[i]>=INF) {
				pl("INF");
			}
			else {
				pl(distance[i]);
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

	public static final class Pair<K, V> implements Comparable<Object>{        //powered by mikit
		//Pair<任意の型、任意の型>だが、下の機能すべて使うには、Pair<Integer,Integer>でないと不可能
		public int key;
		public int value;
		public Pair(int key, int value) {
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
		public int compareTo(Object o) {		//キーの順序で比較可能にした
			Pair<?,?> temp=(Pair<?, ?>) o;
			return (((int)this.value)-((int)temp.value));
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
