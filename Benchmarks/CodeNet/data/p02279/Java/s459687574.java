import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		tree T=new tree(n);
		
		for(int i=0;i<n;i++) {
			int u=Integer.parseInt(in.next()), k=Integer.parseInt(in.next());
			int b=-1;
			for(int j=0;j<k;j++) {
				int c=Integer.parseInt(in.next());
				T.T[c].p=u;
				if(j==0) {
					T.T[u].l=c;
				}
				else {
					T.T[b].r=c;
				}
				b=c;
			}
		}
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<n;i++) {
			out.printf("node %d: parent = %d, ", i, T.T[i].p);
			out.printf("depth = %d, %s, ", T.getDepth(i, 0), T.getCat(i));
			out.println(T.getChilds(i));
		}
		out.flush();
	}

}

class treeNode{
	int p=-1,l=-1,r=-1;
}

class tree{
	static treeNode T[];
	
	tree(int n){
		T=new treeNode[n];
		for(int i=0;i<n;i++) {
			T[i]=new treeNode();
		}
	}
	
	static void insert(int u,int c) {
		T[c].p=u;
		if(T[u].l==-1)T[u].l=c;
		else {
			int i=T[u].l;
			while(true) {
				if(T[i].r==-1) {
					T[i].r=c;
					break;
				}
				i=T[i].r;
			}
		}
	}
	
	static int getDepth(int i,int d) {
		if(T[i].p!=-1) d=getDepth(T[i].p,++d);
		return d;
	}
	
	static String getCat(int u) {
		String str;
		if(T[u].p==-1)str="root";
		else if(T[u].l==-1)str="leaf";
		else str="internal node";
		return str;
	}
	
	static List<Integer> getChilds(int u){
		List<Integer> c=new ArrayList<>();
		if(T[u].l!=-1) {
			int i=T[u].l;
			while(i!=-1) {
				c.add(i);
				i=T[i].r;
			}
		}
		return c;
	}
}

