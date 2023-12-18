import java.io.*;
import java.util.*;
public class Main {
	
	static Node tree[];

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		tree=new Node[n]; for(int i=0;i<n;i++)tree[i]=new Node();
		
		for(int i=0;i<n;i++) {
			int id=Integer.parseInt(in.next()),l=Integer.parseInt(in.next()),r=Integer.parseInt(in.next());
			
			tree[id].left=l; tree[id].right=r;
			if(l!=-1)tree[l].parent=id;
			if(r!=-1)tree[r].parent=id;
		}
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<n;i++) {
			out.print("node "+i+": ");
			out.print("parent = "+tree[i].parent+", ");
			out.print("sibling = "+getSibling(i)+", ");
			out.print("degree = "+getDegree(i)+", ");
			out.print("depth = "+getDepth(i)+", ");
			out.print("height = "+getHeight(i,0)+", ");
			out.println(getType(i));
		}
		out.flush();
		
		
	}
	
	static int getSibling(int index) {
		int p=tree[index].parent;
		if(p==-1)return -1;
		else if(tree[p].left==index && tree[p].right!=-1)return tree[p].right;
		else if(tree[p].right==index && tree[p].left!=-1)return tree[p].left;
		else return -1;
	}
	
	static int getDegree(int index) {
		if(tree[index].left!=-1 && tree[index].right!=-1)return 2;
		else if(tree[index].left!=-1 || tree[index].right!=-1) return 1;
		else return 0;
	}
	
	static int getDepth(int index) {
		int d=0;
		while(tree[index].parent!=-1) {
			d++;
			index=tree[index].parent;
		}
		return d;
	}
	
	static int getHeight(int index,int h) {
		int h1=h,h2=h;
		if(tree[index].left!=-1)h1=getHeight(tree[index].left,h+1);
		if(tree[index].right!=-1)h2=getHeight(tree[index].right,h+1);
		return Math.max(h1, h2);
	}
	
	static String getType(int index) {
		if(tree[index].parent==-1)return "root";
		else if(tree[index].left==-1 && tree[index].right==-1)return "leaf";
		else return "internal node";
	}

}

class Node{
	int parent=-1,left=-1,right=-1;
}

