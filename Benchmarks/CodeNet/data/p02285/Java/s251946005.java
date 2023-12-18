import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Node {
		int key;
		Node left;
		Node right;
		Node parent;
		
		public Node(int key) {
			this.key = key;
		}
	}
	
	Node root;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(s.startsWith("i")) {
				insert(sc.nextInt());
			}
			else if (s.startsWith("f")) {
				Node ans = find(root, sc.nextInt());
				if(ans != null) System.out.println("yes");
				else System.out.println("no");
			}
			else if(s.startsWith("d")) {
				deleteNode(find(root, sc.nextInt()));
			}
			else{
				inorder(root);
				System.out.println();
				preorder(root);
				System.out.println();
			}
		}
		sc.close();
	}
	
	void preorder(Node u) {
		if(u == null) return;
		System.out.print(" " + u.key);
		preorder(u.left);
		preorder(u.right);
	}
	
	void inorder(Node u) {
		if(u == null) return;
		inorder(u.left);
		System.out.print(" " + u.key);
		inorder(u.right);
	}
	
	void insert (int key) {
		Node y = null;
		Node x = root;
		Node z = new Node(key);
		while (x != null) {
			y = x;
			if(z.key < x.key) {
				x = x.left;
			} else {
				x = x.right;
			}
		}
		z.parent = y;
		
		if(y == null) {
			root = z;
		} else if (z.key < y.key) {
			y.left = z;
		}else {
			y.right = z;
		}
	}
	
	Node find(Node x, int k) {
		while(x != null && k != x.key) {
			if(k < x.key) x = x.left;
			else x = x.right;
		}
		return x;
	}
	
	void deleteNode(Node z) {
		Node y;
		Node x;
		//削除する対象を節点yとする
		if(z.left == null || z.right == null) {
			y = z;		//ｚが子を持たないか、子を一つ持つ場合は入力節点のz
		}else {
			y = getSuccessor(z);	//ｚが子を二つ持つ場合はzの次節点
		}
		
		//yの子xを決める
		if(y.left != null) {
			x = y.left;
		}else {
			x = y.right;
		}
		
		if(x != null) x.parent = y.parent; //xの親の設定 
		
		if(y.parent == null)
			root = x;			//yが根の時、xを木の根とする
		else if( y == y.parent.left)
			y.parent.left = x;		//yがその親の左の子なら、その親の左の子をxとする
		else
			y.parent.right = x;		//yがその親の右の子なら、その親の右の子をxとする
		
		if( y != z)		//ｚの次節点が削除された場合
			z.key = y.key;		//yのデータをｘにコピーする
		
	}
	
	Node getSuccessor(Node x) {
		Node y;
		if(x.right != null)
			return getMinimum(x.right);
		
		y = x.parent;
		while(y != null && x == y.right) {
			x = y;
			y = y.parent;
		}
		return y;
	}
	
	Node getMinimum(Node x) {
		while(x.left != null) {
			x = x.left;
		}
		return x;
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
	
}
