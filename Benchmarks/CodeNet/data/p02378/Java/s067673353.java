import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int e = sc.nextInt();
		
		V = x + y;

		//グラフの隣接リスト表現
		@SuppressWarnings("unchecked")
		Vector<Integer> G[] = new Vector[V];
		for(int i = 0; i < G.length; i++){
			G[i] = new Vector<Integer>();
		}
		
		for(int i = 0; i < e; i++){
			addEdge(G, sc.nextInt(), sc.nextInt() + x);
		}
		
		System.out.println(bipartiteMatching(G));

	}
	//頂点数
	static int V;
	//マッチングのペア
	static int match[];
	//DFSで既に使用したか
	static boolean[] used;

	static void addEdge(Vector<Integer>[] G, int u, int v){
		G[u].add(v);
		G[v].add(u);

		//			System.out.println("add "+u+" and "+v);
	}

	//二部グラフの最大マッチングを求める
	static int bipartiteMatching(Vector<Integer>[] G){
		int result = 0;
		match = new int[G.length];
		Arrays.fill(match, -1);

		used = new boolean[G.length];
		for(int v = 0; v < G.length; v++){
			if(match[v] < 0){
				Arrays.fill(used, false);
				if(dfs(G, match, used, v)){
					result++;
				}
			}
		}
		return result;
	}

	//増加パスを探す
	static boolean dfs(Vector<Integer>[] G, int[] match, boolean[] used, int v){
		used[v] = true;

		for(int i = 0; i < G[v].size(); i++){
			int u = G[v].get(i);
			int w = match[u];

			if(w < 0 || !used[w] && dfs(G, match, used, w)){
				match[v] = u;
				match[u] = v;
				return true;
			}
		}
		return false;
	}


}

