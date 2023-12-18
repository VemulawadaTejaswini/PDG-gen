import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		BT tree=new BT();
		PrintWriter out=new PrintWriter(System.out);
		
		for(int i=0;i<n;i++) {
			String odr=in.next();
			
			if(odr.equals("insert")) {
				int key=Integer.parseInt(in.next());
				tree.insert(key);
			}
			
			else if(odr.equals("find")) {
				int key=Integer.parseInt(in.next());
				if(tree.find(key))out.println("yes");
				else out.println("no");
			}
			
			else if(odr.equals("print")) {
				Queue<Integer> Q=new ArrayDeque<>(tree.walk('I'));
				while(!Q.isEmpty())out.print(" "+Q.remove());
				out.println();
				Q=tree.walk('F');
				while(!Q.isEmpty())out.print(" "+Q.remove());
				out.println();
				
			}
		}
		out.flush();
	}

}

class BTNode{
	int key;
	BTNode Parent,Left,Right;
	
	BTNode(int k){
		key=k;
	}
}

class BT{
	BTNode root,dummy;
	int NIL=-2000000001;
	int size=0;
	
	Queue<Integer> Q;
	
	BT(){
		root=new BTNode(NIL);
		dummy=new BTNode(NIL);
		root.Parent=dummy;
		root.Left=dummy;
		root.Right=dummy;
	}
	
	void insert(int k) {
		if(size==0) {
			root.key=k;
			size++;
			return;
		}
		
		BTNode node=new BTNode(k),s=root,p=root;
		node.Left=dummy;node.Right=dummy;
		
		while(s!=dummy) {
			p=s;
			if(k<s.key)s=s.Left;
			else s=s.Right;
		}
		
		node.Parent=p;
		size++;
		
		if(k<p.key)p.Left=node;
		else p.Right=node;
	}
	
	Queue<Integer> walk(char odr) {
		Q=new ArrayDeque<>();
		if(odr=='F')preWalk(root);
		else if(odr=='I')inWalk(root);
		return Q;
	}
	
	void preWalk(BTNode node) {
		Q.add(node.key);
		if(node.Left!=dummy)preWalk(node.Left);
		if(node.Right!=dummy)preWalk(node.Right);
	}
	
	void inWalk(BTNode node) {
		if(node.Left!=dummy)inWalk(node.Left);
		Q.add(node.key);
		if(node.Right!=dummy)inWalk(node.Right);
	}
	
	boolean find(int key) {
		if(isExist(key,root))return true;
		else return false;
	}
	
	boolean isExist(int key,BTNode node) {
		if(node==dummy)return false;
		if(node.key==key)return true;
		
		boolean b;
		if(key<node.key)b=isExist(key,node.Left);
		else b=isExist(key,node.Right);
		
		return b;
	}
}

