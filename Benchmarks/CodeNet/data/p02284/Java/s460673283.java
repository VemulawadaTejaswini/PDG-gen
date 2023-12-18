mport java.util.Scanner;
public class Main {
static private Scanner s = new Scanner(System.in);
static Node root = null;
static StringBuilder sb = new StringBuilder();
public static void main(String[] args) {
	int n = s.nextInt();
	String str = new String();

	 for(int i = 0;i < n;i++) {
	 str = s.next();
		 if(str.equals("insert")) {
		 Insert(s.nextInt());
		 }else if(str.equals("find")){
			 if(find(root,s.nextInt())) {
				 sb.append("yes\n");
			 }else{
				 sb.append("no\n");
			 }
		 }else if(str.equals("print")){
				 inorder(root);
				 sb.append("\n");
				 preorder(root);
				 sb.append("\n");
			 }
		 }
	 System.out.print(sb);
}

Node mins(int n,Node[] a) {
	Node min = a[0];
	for(int i = 1;i < n;i++) {
		if(min.key > a[i].key) {

		}
	}
	return min;
}

static void Insert(int k) {
	Node y = null;
	Node x = root;
	Node z = new Node();

	z.key = k;
	z.l = null;
	z.r = null;
	while(x != null) {
		y = x;
		if(z.key < x.key) {
			x = x.l;
		}else {
			x = x.r;
		}
	}
	z.parent = y;
	if(y == null) {
		root = z;
	}else if(z.key < y.key) {
		y.l = z;
	}else {
		y.r = z;
	}
}

static void preorder(Node a) {
		if(a ==null)return;
		sb.append(" " + a.key);
		preorder(a.l);
		preorder(a.r);
}

static void inorder(Node a) {
		if(a == null) return;
		inorder(a.l);
		sb.append(" " + a.key);
		inorder(a.r);
}

static boolean find(Node a,int k) {
	while(a != null) {
		if(k == a.key)
		return true;
	if(k < a.key) {
		a = a.l;
	}else {
		a = a.r;
	}
	}
	return false;
}
}

class Node{
	int key;
	Node l = null;
	Node r = null;
	Node parent;


	Node(){
	}
}


