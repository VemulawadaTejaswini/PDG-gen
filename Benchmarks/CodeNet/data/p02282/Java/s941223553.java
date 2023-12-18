import java.util.Scanner;

class Main {
	static StringBuilder sb = new StringBuilder("");
	static int index = 0;
	
	public static void main(String args[]) {
		run();
	}
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		Node[] nodes = new Node[num];
		int[] preorder = new int[num];
		int[] inorder = new int[num];
		
		//入力ごとに配列
		for (int i = 0; i < num; i++) {
			preorder[i] = scanner.nextInt();
		}
		for (int i = 0; i < num; i++) {
			inorder[i] = scanner.nextInt();
		}
		
		Reconstruction(nodes, preorder, inorder, 0, num);
		
		output();//出力関数
		
		scanner.close();
	}
	
	//
	public static int Reconstruction(Node[] nodes, int[] preorder, int[] inorder, int right, int left) {
		 if (left == right) {
			 return -1;
		 }
		
		int sub = index;
		index ++;
		
		// root探し
		int root = 0;
		outside: for (int i = 0; i < preorder.length; i++) {
			for (int j = right; j < left; j++) {
				if (preorder[i] == inorder[j]) {
					root = j;
					break outside;
				}
			}
		}
		
		
		//左右に分けて処理
		nodes[sub] = new Node(inorder[root], -1, -1);
		nodes[sub].left = Reconstruction(nodes, preorder, inorder, right, root);
		nodes[sub].right = Reconstruction(nodes, preorder, inorder, root + 1, left);
		
		sb.append(" ").append(nodes[sub].id);
		
		return sub;
	}
	
	//出力
	public static void output(){
		sb.deleteCharAt(0);//重複してるroot消し
		System.out.println(sb);
	}
}
class Node{
	public int id;
	public int left;
	public int right;
	
	public Node(int id, int left, int right) {
		this.id = id;
		this.left = left;
		this.right = right;
	}
	
}

