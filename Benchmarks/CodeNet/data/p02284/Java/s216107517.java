

import java.util.Scanner;




public class Main{

	static class Node{
		int val;
		Node p,left,right;
		Node(int val){
			this.val=val;
			this.left=null;
			this.right=null;
		}
	}
	static Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++){
			String  str=scanner.next();
			if(str.equals("insert")){
				int val=scanner.nextInt();
				root=insert(root,val);
			}
			else if(str.equals("print")){
				inorder(root);
				System.out.println();
				preorder(root);
				System.out.println();
			}else if(str.equals("find")){
				find(root,scanner.nextInt());
			}
		}
	}
	private static void find(Node node,int x) {
		// TODO Auto-generated method stub
		if(node==null){
			System.out.println("no");
			return;
		}	
		else if(node.val==x){
			System.out.println("yes");
			return;
		}	
		else if(node.val>x){
			find(node.left, x);
		}else find(node.right, x);
	}
	private static void preorder(Node node) {
		// TODO Auto-generated method stub
		if(node==null)
			return;
		else{
			System.out.print(" "+node.val);
			preorder(node.left);
			preorder(node.right);
		}
	}
	private static void inorder(Node node) {
		// TODO Auto-generated method stub
		if(node==null)
			return;
		else{
			inorder(node.left);
			System.out.print(" "+node.val);
			inorder(node.right);
		}
	}
	private static Node insert(Node node,int val) {
		// TODO Auto-generated method stub
		if(node==null){
			node=new Node(val);
		}
		else{
			if(val<node.val){
				node.left=insert(node.left,val);
			}
			else node.right=insert(node.right,val);
		}
		
		return node;
	}

}

