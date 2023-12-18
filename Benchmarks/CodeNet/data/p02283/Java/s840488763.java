import java.util.*;
//二分探索木の節を表すクラスNode
//Javaプログラマのためのアルゴリズムとデータ構造 p.221参照
class Node{
	Integer data;
	Node left;
	Node right;
	Node(Integer data){
		left = null;
		right = null;
		this.data = data;
	}
}

//二分探索木を表すクラスBinarySearchTree
//Javaプログラマのためのアルゴリズムとデータ構造 p.223参照
public class Main{
	Scanner sc = new Scanner(System.in);
	private static Node root;
	//命令の数m
	int m;
	//命令insert or print
	String order;
	//挿入するデータ
	int[] T;
	public ProblemA() {
		root = null;
	}
	//二分探索木にキーkeyを持つ節を挿入するメソッド
	public Node insert(Integer key) {
		Node p = root;
		//parentは現在注目している節の親
		Node parent = null;
		//pがparentの左の子ならtrue,右の子ならfalseを返す
		boolean isLeftChild = false;
		//注目している節がある限り処理を繰り返す
		while(p != null) {
			int result = key.compareTo(p.data);
			//節とキーを比較し、等しければすでに登録されているためnullを返す
			if(result == 0) {
				return null;
			//キーの方が小さければ左部分木
			}else if(result < 0) {
				parent = p;
				isLeftChild = true;
				p = p.left;
			//キーの方が大きければ右部分木
			}else {
				parent = p;
				isLeftChild = false;
				p = p.right;
			}
		}
		//新しい節を適切な場所に挿入する
		//新しい節を割り当てる
		Node newNode = new Node(key);
		if(parent == null) {
			//新しい節は根となるため、rootに新しい節を代入する
			root = newNode;
		}else if(isLeftChild) {
			//節parentの左の子になる
			parent.left = newNode;
		}else {
			//節parentの右の子になる
			parent.right = newNode;
		}
		return newNode;
	}
	//データを入力するメソッド
	public void input() {
		m = sc.nextInt();
		T = new int[m];
		for(int i=0; i<m; i++) {
			order = sc.next();
			if(order.equals("print")) {
				inorder(root);
				System.out.println();
				preorder(root);
			}else {
				T[i] = sc.nextInt();
				insert(T[i]);
			}
		}
	}
	//通りがけ順に出力するメソッド
	//Javaプログラマのためのアルゴリズムとデータ構造 p.242参照
	public void inorder(Node p) {
		if(p == null) {
			return;
		}else {
			inorder(p.left);
			System.out.print(" "+p.data);
			inorder(p.right);
		}
	}
	//行きがけ順に出力するメソッド
	//Javaプログラマのためのアルゴリズムとデータ構造 p.172参照
	public void preorder(Node p) {
		if(p == null) {
			return;
		}else {
			System.out.print(" "+p.data);
			preorder(p.left);
			preorder(p.right);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
	}
}
