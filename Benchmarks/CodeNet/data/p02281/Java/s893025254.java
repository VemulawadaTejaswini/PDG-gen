import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		BTNode[] tree=new BTNode[n];
		for(int i=0;i<n;i++)tree[i]=new BTNode();
		
		for(int i=0;i<n;i++) {
			int id=Integer.parseInt(in.next()),
					l=Integer.parseInt(in.next()),
					r=Integer.parseInt(in.next());
			
			if(l!=-1) {
				tree[id].lc=l;
				tree[l].p=id;
			}
			if(r!=-1) {
				tree[id].rc=r;
				tree[r].p=id;
			}
		}
		in.close();
		
		int root=findRoot(tree);
		
		System.out.println("Preorder");
		preWalk(tree,root);
		System.out.println("\nInorder");
		inWalk(tree,root);
		System.out.println("\nPostorder");
		postWalk(tree,root);
		System.out.println();
	}
	
	static int findRoot(BTNode[] tree) {
		for(int i=0;i<tree.length;i++) {
			if(tree[i].p==-1)return i;
		}
		
		return -1;
	}
	
	static void preWalk(BTNode[] tree,int pos){
		System.out.print(" "+pos);
		if(tree[pos].lc!=-1)preWalk(tree,tree[pos].lc);
		if(tree[pos].rc!=-1)preWalk(tree,tree[pos].rc);
	}
	
	static void inWalk(BTNode[] tree,int pos){
		if(tree[pos].lc!=-1)inWalk(tree,tree[pos].lc);
		System.out.print(" "+pos);
		if(tree[pos].rc!=-1)inWalk(tree,tree[pos].rc);
	}
	
	static void postWalk(BTNode[] tree,int pos){
		if(tree[pos].lc!=-1)postWalk(tree,tree[pos].lc);
		if(tree[pos].rc!=-1)postWalk(tree,tree[pos].rc);
		System.out.print(" "+pos);
	}

}

class BTNode{
	int p=-1,lc=-1,rc=-1;
}
