import java.util.Scanner;

public class Main{
	public static TreeNode[] node = null;
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		node = new TreeNode[num];
		for(int i=0;i<num;i++) {
			node[i] = new TreeNode();
		}
		for(int i=0;i<num;i++) {
			int parent =sc.nextInt();
			int left = sc.nextInt();
			int right = sc.nextInt();
			node[parent].left = left;
			node[parent].right = right;
			if(left!=-1) {
				node[left].parent = parent;
			}
			if(right!=-1) {
				node[right].parent = parent;
			}
			
		}	
		
		for(int i=0;i<num;i++) {
			int parent = node[i].parent;
			if(parent==-1) {
				System.out.println("Preorder");
				PreOrder(i);
				System.out.println();
				System.out.println("Inorder");
				InOrder(i);
				System.out.println();
				System.out.println("Postorder");
				PostOrder(i);
				System.out.println();
				break;
			}
	
		}
	}
	
	public static void PreOrder(int i) {
		if(i==-1) {
			return;
		}
		System.out.print(" "+i);
		PreOrder(node[i].left);
		PreOrder(node[i].right);
		
	}
	
	public static void InOrder(int i) {
		if(i==-1) {
			return;
		}
		InOrder(node[i].left);
		System.out.print(" "+i);
		InOrder(node[i].right);
	}

	public static void PostOrder(int i) {
		if(i==-1) {
			return;
		}
		PostOrder(node[i].left);
		PostOrder(node[i].right);
		System.out.print(" "+i);
}
}

class TreeNode {
	public int parent;
	public int left;
	public int right;

public TreeNode() {
	parent = -1;
}
}


