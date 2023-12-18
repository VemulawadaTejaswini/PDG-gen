
import java.util.Scanner;



public class Main {

	static Scanner scanner=new Scanner(System.in);
	static int n=scanner.nextInt();
	static Node[] nodes=new Node[n];
	 static class Node{
		Node p;
	
		int left,right;
		int id;
		Node(int id){
			this.id=id;
		}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<n;i++){
			nodes[i]=new Node(i);
		}
		for(int i=0;i<n;i++){
			int id=scanner.nextInt();
			int left=scanner.nextInt();
		    int right=scanner.nextInt();
		    nodes[id].left=left;
		    nodes[id].right=right;
		    if(left!=-1){
		    	nodes[left].p=nodes[id];
		    }
		    if(right!=-1){
		    	nodes[right].p=nodes[id];
		    }
		}
		int root=0;
		for(int i=0;i<n;i++){
			if(nodes[i].p==null)
				root=i;
		}
		System.out.println("Preorder");
		preorder(root);
		System.out.println();
		
		System.out.println("Inorder");
		inorder(root);
		System.out.println();
		
		System.out.println("Postorder");
		postorder(root);
		System.out.println();
		
	}
	private static void preorder(int root) {
		// TODO Auto-generated method stub
		if(root==-1)
			return;
		System.out.print(" "+root);
		preorder(nodes[root].left);
		preorder(nodes[root].right);
	}
	private static void postorder(int root) {
		// TODO Auto-generated method stub
		if(root==-1)
			return;
		postorder(nodes[root].left);
		postorder(nodes[root].right);
		System.out.print(" "+root);
	}
	private static void inorder(int root) {
		// TODO Auto-generated method stub
		if(root==-1)
			return;
	
		inorder(nodes[root].left);
		System.out.print(" "+root);
		inorder(nodes[root].right);
	}
	

}

