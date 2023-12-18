import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Main {
	public static void main(String[] $) {
		new Main().run();
	}
	
	class DSU {
		int n;
		int[] upper;
		
		public DSU(int n) {
			this.n=n;
			Arrays.fill(upper=new int[n], -1);
		}
		
		int root(int x) {
			return upper[x]<0?x:(upper[x]=root(upper[x]));
		}
		
		void unite(int x,int y) {
			x=root(x);y=root(y);
			if (x!=y) {
				upper[x]+=upper[y];
				upper[y]=x;
			}
		}
		
		int sz(int x) {
			return -upper[root(x)];
		}
		
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] id=new int[N];
		int[] y=new int[N];
		for (int i=0;i<N;++i) {
			int x=sc.nextInt()-1;
			y[x]=sc.nextInt()-1;
			id[x]=i;
		}
		DSU ds=new DSU(N);
		Stack<Integer> st=new Stack<Integer>();
		for (int x=0;x<N;++x) {
			int q=x;
			while (!st.isEmpty() && y[st.peek()]<y[x]) {
				int p=st.pop();
				if (q==x) q=p;
				ds.unite(id[x], id[p]);
			}
			st.add(q);
		}
		PrintWriter pw=new PrintWriter(System.out);
		for (int i=0;i<N;++i) {
			pw.println(ds.sz(i));
		}
		pw.flush();
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}