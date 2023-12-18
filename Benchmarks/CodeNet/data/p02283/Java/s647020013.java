import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		BTree t=new BTree();
		boolean ct=false;

		for(int i=0;i<n;i++) {
			String odr=in.next();

			if(odr.equals("insert")) {
				int key=Integer.parseInt(in.next());
				t.insert(key);
			}
			else if(odr.equals("print")) {
				PrintWriter out=new PrintWriter(System.out);
				Queue<Integer> Q=new ArrayDeque<>(t.walk('I'));
				while(!Q.isEmpty())out.print(" "+Q.remove());
				out.println();
				Q=new ArrayDeque<>(t.walk('P'));
				while(!Q.isEmpty())out.print(" "+Q.remove());
				out.println();
				out.flush();
			}
		}
	}

}

class BTreeNode{
	int key=-2000000001;

	BTreeNode Parent,Left,Right;

	BTreeNode(int k){
		key=k;
	}

	void setParent(BTreeNode P) {
		this.Parent=P;
	}

	void setLeft(BTreeNode L) {
		this.Left=L;
	}

	void setRight(BTreeNode R) {
		this.Right=R;
	}
}

class BTree{
	int size=0;

	Queue<Integer> Q;

	BTreeNode dummy;
	BTreeNode r;
	BTree(){
		dummy=new BTreeNode(-2000000001);
		r=new BTreeNode(-2000000001);
		r.setParent(dummy);
		r.setLeft(dummy);
		r.setRight(dummy);
	}

	void insert(int k) {

		if(size==0) {
			r.key=k;
			size++;
			return;
		}

		BTreeNode n=new BTreeNode(k);
		n.setLeft(dummy);
		n.setRight(dummy);

		BTreeNode s=r;
		while(s.Left.key!=-2000000001 && s.Right.key!=-2000000001) {
			if(k<s.key)s=s.Left;
			else s=s.Right;
		}

		n.setParent(s);
		size++;

		if(k<s.key) s.setLeft(n);
		else s.setRight(n);
	}

	Queue<Integer> walk(char odr){
		Q=new ArrayDeque<>();
		if(odr=='I')inoderWalk(r);
		if(odr=='P')preoderWalk(r);
		return Q;
	}

	void preoderWalk(BTreeNode n) {
		Q.add(n.key);
		if(n.Left!=dummy)preoderWalk(n.Left);
		if(n.Right!=dummy)preoderWalk(n.Right);
	}
	
	void inoderWalk(BTreeNode n) {
		if(n.Left!=dummy)inoderWalk(n.Left);
		Q.add(n.key);
		if(n.Right!=dummy)inoderWalk(n.Right);
	}
}
