import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Mobile Computing
public class Main{

	double r, best;
	int n;
	int[] ws, w;
	Set<String>[] trees;

	int bit(int s){
		int c = 0;
		for(int j=0;j<n;j++)if(((s>>j)&1)>0)c++;
		return c;
	}
	boolean sub(int s, int t){
		for(int j=0;j<n;j++)if(((t>>j)&1)>0&&((s>>j)&1)==0)return false;
		return true;
	}
	
	
	class M{
		double x;
		boolean leaf;
		int w;
		M left, right;
		public M(double x, boolean leaf, int w) {
			this.x = x;
			this.leaf = leaf;
			this.w = w;
			left = right = null;
		}
		int get(){
			if(leaf)return w;
			return left.get()+right.get();
		}
		void val(){
			if(leaf){
				min = Math.min(min, x); max = Math.max(max, x); return;
			}
			int w1 = left.get(), w2 = right.get();
			double a = w2*1.0/(w1+w2);
//			System.out.println("A:"+a+" X:"+x);
			left.x = x-a;
			right.x = x+1-a;
			left.val();
			right.val();
		}
		void f(){
			if(leaf){
				System.out.print("x"); return;
			}
			System.out.print("(");
			left.f();
			System.out.print(",");
			right.f();
			System.out.print(")");
		}
	}
	
	double min, max;
	boolean[] used;
	int[] order;
	void dfs(int k){
		if(k==n){
			for(String t:trees[n]){
				s = (t+"$").toCharArray();
				id = 0;
				int a = 0;
				for(int i=0;i<s.length;i++){
					if(s[i]=='?'){
						s[i] = (char)(order[a++]+'0');
					}
				}
//				System.out.println("S:"+new String(s));
				M root = exp();
//				root.f();
//				System.out.println();
				min = max = 0;
				if(!root.leaf){
					root.x = 0;
					root.val();
				}
				double res = max-min;
//				System.out.println(min+" - "+max+" RES:"+res);
				
				if(res<r)best = Math.max(best, res);
				root.val();
			}
			return;
		}
		for(int i=0;i<n;i++){
			if(used[i])continue;
			used[i]=true;
			order[k] = i;
			dfs(k+1);
			used[i]=false;
		}
	}
	
	char[] s;
	int id;
	char get(){
		return s[id++];
	}
	M exp(){
		char ch = get();
		if(ch=='('){
			M res = new M(0, false, 0);
			res.left = exp();
			get();
			res.right = exp();
			get();
			return res;
		}
		M res = new M(0, true, ws[ch-'0']);
		return res;
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		trees = new Set[7];
		for(int i=1;i<=6;i++)trees[i] = new HashSet<String>();
		trees[1].add("?");
		for(int i=2;i<=6;i++){
			for(int j=1;j<i;j++){
				for(String left:trees[j])for(String right:trees[i-j])trees[i].add("("+left+","+right+")");
			}
//			System.out.println("Size:"+trees[i].size());
//			debug(trees[i]);
		}
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--!=0){
			r = sc.nextDouble(); n = sc.nextInt();
			ws = new int[n];
			for(int i=0;i<n;i++)ws[i]=sc.nextInt();
			w = new int[1<<n];
			for(int i=0;i<1<<n;i++){
				int s = 0;
				for(int j=0;j<n;j++)if(((i>>j)&1)>0)s+=ws[n-1-j];
				w[i] = s;
			}
//			if(n==1){
//				System.out.printf("%.8f\n", 0.0);
//				continue;
//			}
			best = -1;
			used = new boolean[n];
			order = new int[n];
			dfs(0);
			System.out.printf("%.8f\n", best);
		}
	}
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	public static void main(String[] args) {
		new Main().run();
	}
}