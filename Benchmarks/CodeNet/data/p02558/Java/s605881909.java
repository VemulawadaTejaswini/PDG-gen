import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] $) {
		new Main().run();
	}
	
	int[] p;
	{
		Arrays.fill(p=new int[200000], -1);
	}
	
	int root(int x) {
		return p[x]<0?x:(p[x]=root(p[x]));
	}
	
	void unite(int x,int y) {
		x=root(x);y=root(y);
		if (x!=y) p[x]=y;
	}
	
	boolean equiv(int x,int y) {
		return root(x)==root(y);
	}
	
	void run() {
		var sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		var pw=new PrintWriter(System.out);
		while (Q-->0) {
			int t=sc.nextInt();
			int u=sc.nextInt();
			int v=sc.nextInt();
			if (t==0) unite(u,v);
			else pw.println(equiv(u,v)?1:0);
		}
		pw.flush();
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
