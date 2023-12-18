import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static final int INF = Integer.MAX_VALUE / 10;
	static final double EPS = 1e-10;

	public static void main(String[] args) {
		while (true) {
			int n = si(), q = si();
			if(n==0) break;
			UnionFind1 uft = new UnionFind1(n);
			int[] parrem = new int[n];
			for (int i = 1; i < n; i++) {
				int p = si()-1;
				uft.par[i]=p;
				parrem[i]=p;
			}

			Stack<Integer> stack = new Stack<Integer>();
			for (int i = 0; i < q; i++) {
				String string = scan.next();
				int v = si()-1;
				if(string.equals("M")){
					uft.par[v]=v;
				}
				stack.push(string.equals("M")? 0 : 1);
				stack.push(v);
			}

			int ans = 0;

			while (!stack.isEmpty()) {
				int v = stack.pop();
				int ope = stack.pop();

				if(ope==1){
					ans += uft.root(v)+1;
				}else{
					uft.par[v] = parrem[v];
				}
			}
			out.println(ans);
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}

class UnionFind1 {

	//フィールド
	int[] par;
	int[] rank;

	//コンストラクタ
	UnionFind1(int n){

		par = new int[n];
		rank = new int[n];

		for(int i=0;i<n;i++){
			par[i]=i;
			rank[i]=0;
		}
	}

	//木の根を求める
	int root(int x){
		if(par[x]==x)		//xが根の要素ならそれを返す
			return x;
		else
			return par[x] = root(par[x]);		//xが根でなければ一つ上のpar[]を求めて返す＆経路圧縮
	}

	//xとyの属する集合を併合
	void unite(int x,int y){
		x=root(x);
		y=root(y);
		if(x==y) return;		//同じ集合なら併合済み

		if(rank[x]<rank[y])		//yの方が高い木ならxの根の部分をyの根から繋げる
			par[x]=y;
		else{
			par[y]=x;
			if(rank[x]==rank[y])		//おなじ高さならyを一つ下げて繋げる（その結果、xの木は高さが１増える）
				rank[x]++;
		}
	}

	boolean isSame(int x,int y){
		return root(x)==root(y);
	}
}